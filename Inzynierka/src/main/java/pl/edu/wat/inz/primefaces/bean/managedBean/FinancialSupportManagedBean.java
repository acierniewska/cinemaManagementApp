package pl.edu.wat.inz.primefaces.bean.managedBean;

import static pl.edu.wat.inz.basic.AppConst.ERROR;
import static pl.edu.wat.inz.basic.AppConst.SUCCESS;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import org.springframework.dao.DataAccessException;

import pl.edu.wat.inz.hibernate.data.FinancialSupport;
import pl.edu.wat.inz.spring.service.FinancialSupportService;

@ManagedBean(name = "financialSupportMB")
@ApplicationScoped
public class FinancialSupportManagedBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{FinancialSupportService}")
	private FinancialSupportService financialSupportService;

	List<FinancialSupport> financialSupportList;
	private FinancialSupport selectedFinancialSupport = new FinancialSupport();

	public List<FinancialSupport> getFinancialSupportList() {
		if (financialSupportList == null) {
			financialSupportList = new ArrayList<FinancialSupport>();
			financialSupportList.addAll(getFinancialSupportService()
					.getFinancialSupports());
		}
		return financialSupportList;
	}

	public String prepareFinancialSupport() {
		return "meh";
	}

	public FinancialSupport getSelectedFinancialSupport() {
		return selectedFinancialSupport;
	}

	public void setSelectedFinancialSupport(
			FinancialSupport selectedFinancialSupport) {
		this.selectedFinancialSupport = selectedFinancialSupport;
	}

	public void onUserRowUnselect(UnselectEvent event) {
		setSelectedFinancialSupport(null);
	}

	public void onCompRowSelect(SelectEvent event) {
		setSelectedFinancialSupport((FinancialSupport) event.getObject());
	}

	public String addFinancialSupport() {
		try {
			getFinancialSupportService().addFinancialSupport(
					selectedFinancialSupport);
			reset();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String updateFinancialSupport(FinancialSupport FinancialSupport) {
		try {
			getFinancialSupportService().updateFinancialSupport(
					FinancialSupport);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String deleteFinancialSupport(FinancialSupport financialSupport) {
		try {
			getFinancialSupportService().deleteFinancialSupport(
					financialSupport);
			financialSupportList = null;
			getFinancialSupportList();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public void onEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Edited");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		updateFinancialSupport((FinancialSupport) event.getObject());
	}

	public void onCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Cancelled");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void reset() {
		this.selectedFinancialSupport = new FinancialSupport();
	}

	public List<FinancialSupport> getFinancialSupportListForAnimal(long animalId) {
		financialSupportList = new ArrayList<FinancialSupport>();
		financialSupportList.addAll(getFinancialSupportService()
				.getFinancialSupportsForAnimal(animalId));
		return financialSupportList;
	}

	public FinancialSupportService getFinancialSupportService() {
		return financialSupportService;
	}

	public void setFinancialSupportService(
			FinancialSupportService FinancialSupportService) {
		this.financialSupportService = FinancialSupportService;
	}

	public void setFinancialSupportList(
			List<FinancialSupport> FinancialSupportList) {
		this.financialSupportList = FinancialSupportList;
	}

}