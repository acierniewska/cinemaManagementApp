package pl.edu.wat.inz.primefaces.bean;

import static pl.edu.wat.inz.basic.AppConst.ERROR;
import static pl.edu.wat.inz.basic.AppConst.SUCCESS;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import org.springframework.dao.DataAccessException;

import pl.edu.wat.inz.hibernate.data.Application;
import pl.edu.wat.inz.spring.service.ApplicationService;

@ManagedBean(name = "addAppMB")
@ApplicationScoped
public class AddApplicationManagedBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Application newApplication = new Application();
	private String test;
	@ManagedProperty(value = "#{ApplicationService}")
	private ApplicationService applicationService;

	public String addApplication() {
		try {
			getApplicationService().addApplication(newApplication);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public ApplicationService getApplicationService() {
		return applicationService;
	}

	public void setApplicationService(ApplicationService ApplicationService) {
		this.applicationService = ApplicationService;
	}

	public Application getNewApplication() {
		return newApplication;
	}

	public void setNewApplication(Application newApplication) {
		this.newApplication = newApplication;
	}

	public void addMessage(String summary) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				summary, null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

}