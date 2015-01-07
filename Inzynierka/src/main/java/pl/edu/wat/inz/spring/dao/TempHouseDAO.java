package pl.edu.wat.inz.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.edu.wat.inz.hibernate.data.TempHouse;

@Component
public class TempHouseDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void register(TempHouse animal) {
		sessionFactory.getCurrentSession().save(animal);
	}

	public void deleteTempHouse(TempHouse animal) {
		sessionFactory.getCurrentSession().delete(animal);
	}

	public void updateTempHouse(TempHouse animal) {
		sessionFactory.getCurrentSession().update(animal);
	}

	public void addTempHouse(TempHouse animal) {
		sessionFactory.getCurrentSession().save(animal);
	}

	public TempHouse getTempHouseById(int id) {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from TempHouse where id=?").setParameter(0, id)
				.list();
		return (TempHouse) list.get(0);
	}

	public List<TempHouse> getTempHouses() {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from TempHouse").list();
		return list;
	}

	public List<TempHouse> getCatsOnly() {

		return null;
	}
}
