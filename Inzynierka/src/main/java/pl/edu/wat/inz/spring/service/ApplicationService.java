package pl.edu.wat.inz.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.edu.wat.inz.hibernate.data.Application;
import pl.edu.wat.inz.spring.dao.ApplicationDAO;

@Service("ApplicationService")
@Transactional(readOnly = true)
public class ApplicationService {

	@Autowired
	ApplicationDAO applicationDAO;

	@Transactional(readOnly = false)
	public void addApplication(Application application) {
		getApplicationDAO().addApplication(application);
	}

	@Transactional(readOnly = false)
	public void deleteApplication(Application application) {
		getApplicationDAO().deleteApplication(application);
	}

	@Transactional(readOnly = false)
	public void updateApplication(Application application) {
		getApplicationDAO().updateApplication(application);
	}

	public Application getApplicationById(int id) {
		return getApplicationDAO().getApplicationById(id);
	}

	public List<Application> getApplications() {
		return getApplicationDAO().getApplications();
	}

	public ApplicationDAO getApplicationDAO() {
		return applicationDAO;
	}

	public void setApplicationDAO(ApplicationDAO applicationDAO) {
		this.applicationDAO = applicationDAO;
	}
}
