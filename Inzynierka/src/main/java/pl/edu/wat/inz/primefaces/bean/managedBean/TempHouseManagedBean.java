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

import pl.edu.wat.inz.hibernate.data.TempHouse;
import pl.edu.wat.inz.spring.service.TempHouseService;

@ManagedBean(name = "tempHouseMB")
@ViewScoped
public class TempHouseManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private TempHouse selectedTempHouse = new TempHouse();

	@ManagedProperty(value = "#{TempHouseService}")
	private TempHouseService tempHouseService;

	List<TempHouse> tempHouseList;
	private int id;
	private String name;

	public TempHouse getSelectedTempHouse() {
		return selectedTempHouse;
	}

	public void setSelectedTempHouse(TempHouse selectedTempHouse) {
		this.selectedTempHouse = selectedTempHouse;
	}

	public void onUserRowUnselect(UnselectEvent event) {
		setSelectedTempHouse(null);
	}

	public void onCompRowSelect(SelectEvent event) {
		setSelectedTempHouse((TempHouse) event.getObject());
	}

	public String addTempHouse() {
		try {
			TempHouse TempHouse = new TempHouse();
			getTempHouseService().addTempHouse(TempHouse);
			reset();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String updateTempHouse(TempHouse TempHouse) {
		try {
			getTempHouseService().updateTempHouse(TempHouse);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String deleteTempHouse(TempHouse tempHouse) {
		try {
			getTempHouseService().deleteTempHouse(tempHouse);
			tempHouseList = null;
			getTempHouseList();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public void onEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Edited");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		updateTempHouse((TempHouse) event.getObject());
	}

	public void onCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Cancelled");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void reset() {
		this.setId(0);
		this.setName("");
	}

	public List<TempHouse> getTempHouseList() {
		if (tempHouseList == null) {
			tempHouseList = new ArrayList<TempHouse>();
			tempHouseList.addAll(getTempHouseService().getTempHouses());
		}
		return tempHouseList;
	}

	public TempHouseService getTempHouseService() {
		return tempHouseService;
	}

	public void setTempHouseService(TempHouseService TempHouseService) {
		this.tempHouseService = TempHouseService;
	}

	public void setTempHouseList(List<TempHouse> TempHouseList) {
		this.tempHouseList = TempHouseList;
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