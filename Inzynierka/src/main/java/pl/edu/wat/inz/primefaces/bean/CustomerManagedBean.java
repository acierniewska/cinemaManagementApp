package pl.edu.wat.inz.primefaces.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;
import org.springframework.dao.DataAccessException;

import pl.edu.wat.inz.hibernate.data.Cat;
import pl.edu.wat.inz.spring.service.CatService;

@ManagedBean(name = "catMB")
@RequestScoped
public class CustomerManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final String SUCCESS = "success";
	private static final String ERROR = "error";

	@ManagedProperty(value = "#{CatService}")
	CatService catService;

	List<Cat> catList;

	private int id;
	private String name;
	private String surname;

	public String addCat() {
		try {
			Cat Cat = new Cat();
			Cat.setName(getName());
			getCatService().addCat(Cat);
			reset();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String updateCat(Cat Cat) {
		try {
			getCatService().updateCat(Cat);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String deleteCat(Cat Cat) {
		try {
			getCatService().deleteCat(Cat);
			catList = null;
			getCatList();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public void onEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Edited");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		updateCat((Cat) event.getObject());
	}

	public void onCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Cancelled");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void reset() {
		this.setId(0);
		this.setName("");
		this.setSurname("");
	}

	public List<Cat> getCatList() {
		if (catList == null) {
			catList = new ArrayList<Cat>();
			catList.addAll(getCatService().getCats());
		}
		return catList;
	}

	public CatService getCatService() {
		return catService;
	}

	public void setCatService(CatService CatService) {
		this.catService = CatService;
	}

	public void setCatList(List<Cat> CatList) {
		this.catList = CatList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}