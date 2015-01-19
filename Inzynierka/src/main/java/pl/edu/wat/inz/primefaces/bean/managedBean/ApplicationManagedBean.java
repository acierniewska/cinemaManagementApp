package pl.edu.wat.inz.primefaces.bean.managedBean;

import static pl.edu.wat.inz.basic.AppConst.ERROR;
import static pl.edu.wat.inz.basic.AppConst.SUCCESS;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import org.springframework.dao.DataAccessException;

import pl.edu.wat.inz.hibernate.data.Application;
import pl.edu.wat.inz.spring.service.ApplicationService;

@ManagedBean(name = "applicationMB")
@SessionScoped
public class ApplicationManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{ApplicationService}")
	private ApplicationService applicationService;

	private List<Application> applicationList;
	private Application selectedApplication;

	public Application getSelectedApplication() {
		return selectedApplication;
	}

	public void setSelectedApplication(Application selectedApplication) {
		this.selectedApplication = selectedApplication;
	}

	public void onUserRowUnselect(UnselectEvent event) {
		setSelectedApplication(null);
	}

	public void onCompRowSelect(SelectEvent event) {
		setSelectedApplication((Application) event.getObject());
	}

	public String addApplication() {
		try {
			// Application Application = new Application();
			// Animal.setAnimalName(getName());
			// getAnimalService().addAnimal(Animal);
			reset();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String updateApplication(Application application) {
		try {
			getApplicationService().updateApplication(application);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String deleteAnimal(Application application) {
		try {
			getApplicationService().deleteApplication(application);
			applicationList = null;
			getApplicationList();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public void onEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Edited");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		updateApplication((Application) event.getObject());
	}

	public void onCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Cancelled");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void reset() {
	}

	public List<Application> getApplicationList() {
		if (applicationList == null) {
			applicationList = new ArrayList<Application>();
			applicationList.addAll(getApplicationService().getApplications());
		}
		return applicationList;
	}

	public ApplicationService getApplicationService() {
		return applicationService;
	}

	public void setApplicationService(ApplicationService ApplicationService) {
		this.applicationService = ApplicationService;
	}

	public void setApplicationList(List<Application> applicationList) {
		this.applicationList = applicationList;
	}

}
