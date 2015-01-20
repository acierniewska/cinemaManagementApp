package pl.edu.wat.inz.primefaces.bean.managedBean;

import static pl.edu.wat.inz.basic.AppConst.ERROR;
import static pl.edu.wat.inz.basic.AppConst.SUCCESS;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import org.springframework.dao.DataAccessException;

import pl.edu.wat.inz.hibernate.data.VetVisit;
import pl.edu.wat.inz.spring.service.VetVisitService;

@ManagedBean(name = "vetVisitMB")
@ViewScoped
public class VetVisitManagedBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{VetVisitService}")
	private VetVisitService vetVisitService;

	List<VetVisit> vetVisitList;
	private VetVisit selectedVetVisit = new VetVisit();

	List<VetVisit> plannedVetVisitList;

	List<VetVisit> completedVisitList;

	@PostConstruct
	public void init() {
		List list = getVetVisitService().getVetVisits(false);
		if (!list.isEmpty()) {
			completedVisitList.addAll(list);
		}
	}

	public List<VetVisit> getCompletedVisitList() {
		return completedVisitList;
	}

	public List<VetVisit> getVetVisitList() {
		if (vetVisitList == null) {
			vetVisitList = new ArrayList<VetVisit>();
			vetVisitList.addAll(getVetVisitService().getVetVisits());
		}
		return vetVisitList;
	}

	public VetVisit getSelectedVetVisit() {
		return selectedVetVisit;
	}

	public void setSelectedVetVisit(VetVisit selectedVetVisit) {
		this.selectedVetVisit = selectedVetVisit;
	}

	public void onUserRowUnselect(UnselectEvent event) {
		setSelectedVetVisit(null);
	}

	public void onCompRowSelect(SelectEvent event) {
		setSelectedVetVisit((VetVisit) event.getObject());
	}

	public String addVetVisit() {
		try {
			getVetVisitService().addVetVisit(selectedVetVisit);
			reset();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String updateVetVisit(VetVisit VetVisit) {
		try {
			getVetVisitService().updateVetVisit(VetVisit);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String deleteVetVisit(VetVisit vetVisit) {
		try {
			getVetVisitService().deleteVetVisit(vetVisit);
			vetVisitList = null;
			getVetVisitList();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public void onEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Edited");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		updateVetVisit((VetVisit) event.getObject());
	}

	public void onCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Cancelled");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void reset() {
		this.selectedVetVisit = new VetVisit();
	}

	public List<VetVisit> getVetVisitListForAnimal(long animalId) {
		vetVisitList = new ArrayList<VetVisit>();
		vetVisitList.addAll(getVetVisitService()
				.getVetVisitsForAnimal(animalId));
		return vetVisitList;
	}

	public VetVisitService getVetVisitService() {
		return vetVisitService;
	}

	public void setVetVisitService(VetVisitService VetVisitService) {
		this.vetVisitService = VetVisitService;
	}

	public void setVetVisitList(List<VetVisit> VetVisitList) {
		this.vetVisitList = VetVisitList;
	}

	public List<VetVisit> getPlannedVetVisitList() {
		return plannedVetVisitList;
	}

	public void setPlannedVetVisitList(List<VetVisit> plannedVetVisitList) {
		this.plannedVetVisitList = plannedVetVisitList;
	}

	public void setCompletedVisitList(List<VetVisit> completedVisitList) {
		this.completedVisitList = completedVisitList;
	}

}