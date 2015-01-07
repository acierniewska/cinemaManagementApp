package pl.edu.wat.inz.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.edu.wat.inz.hibernate.data.Asylium;

@Component
public class AsyliumDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void register(Asylium Asylium) {
		sessionFactory.getCurrentSession().save(Asylium);
	}

	public void deleteAsylium(Asylium Asylium) {
		sessionFactory.getCurrentSession().delete(Asylium);
	}

	public void updateAsylium(Asylium Asylium) {
		sessionFactory.getCurrentSession().update(Asylium);
	}

	public void addAsylium(Asylium Asylium) {
		sessionFactory.getCurrentSession().save(Asylium);
	}

	public Asylium getAsyliumById(int id) {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Asylium where id=?").setParameter(0, id)
				.list();
		return (Asylium) list.get(0);
	}

	public List<Asylium> getAsyliums() {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Asylium").list();
		return list;
	}

	public List<Asylium> getCatsOnly() {

		return null;
	}
}
