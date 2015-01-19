package pl.edu.wat.inz.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.edu.wat.inz.hibernate.data.Application;

@Component
public class ApplicationDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void register(Application application) {
		sessionFactory.getCurrentSession().save(application);
	}

	public void deleteApplication(Application application) {
		sessionFactory.getCurrentSession().delete(application);
	}

	public void updateApplication(Application application) {
		sessionFactory.getCurrentSession().update(application);
	}

	public void addApplication(Application application) {
		sessionFactory.getCurrentSession().save(application);
	}

	public Application getApplicationById(int id) {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Application where id=?").setParameter(0, id)
				.list();
		return (Application) list.get(0);
	}

	public List<Application> getApplications() {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Application").list();
		return list;
	}
}
