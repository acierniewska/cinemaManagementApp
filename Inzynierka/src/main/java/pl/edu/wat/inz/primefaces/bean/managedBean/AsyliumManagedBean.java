package pl.edu.wat.inz.primefaces.bean.managedBean;

import static pl.edu.wat.inz.basic.AppConst.ERROR;
import static pl.edu.wat.inz.basic.AppConst.SUCCESS;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import org.springframework.dao.DataAccessException;

import pl.edu.wat.inz.hibernate.data.Asylium;
import pl.edu.wat.inz.spring.service.AsyliumService;

@ManagedBean(name = "asyliumMB")
@ViewScoped
public class AsyliumManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Asylium selectedAsylium = new Asylium();

	@ManagedProperty(value = "#{AsyliumService}")
	private AsyliumService asyliumService;

	List<Asylium> asyliumList;
	private int id;
	private String name;

	public Asylium getSelectedAsylium() {
		return selectedAsylium;
	}

	public void setSelectedAsylium(Asylium selectedAsylium) {
		this.selectedAsylium = selectedAsylium;
	}

	public void onUserRowUnselect(UnselectEvent event) {
		setSelectedAsylium(null);
	}

	public void onCompRowSelect(SelectEvent event) {
		setSelectedAsylium((Asylium) event.getObject());
	}

	public String addAsylium() {
		try {
			Asylium Asylium = new Asylium();
			Asylium.setAsyliumName(getName());
			getAsyliumService().addAsylium(Asylium);
			reset();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String updateAsylium(Asylium Asylium) {
		try {
			getAsyliumService().updateAsylium(Asylium);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String deleteAsylium(Asylium asylium) {
		try {
			getAsyliumService().deleteAsylium(asylium);
			asyliumList = null;
			getAsyliumList();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public void onEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Edited");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		updateAsylium((Asylium) event.getObject());
	}

	public void onCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Cancelled");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void reset() {
		this.setId(0);
		this.setName("");
	}

	public List<Asylium> getAsyliumList() {
		if (asyliumList == null) {
			asyliumList = new ArrayList<Asylium>();
			asyliumList.addAll(getAsyliumService().getAsyliums());
		}
		return asyliumList;
	}

	public AsyliumService getAsyliumService() {
		return asyliumService;
	}

	public void setAsyliumService(AsyliumService AsyliumService) {
		this.asyliumService = AsyliumService;
	}

	public void setAsyliumList(List<Asylium> AsyliumList) {
		this.asyliumList = AsyliumList;
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
}