package pl.edu.wat.inz.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.edu.wat.inz.hibernate.data.Fur;

@Component
public class FurDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void register(Fur fur) {
		sessionFactory.getCurrentSession().save(fur);
	}

	public void deleteFur(Fur fur) {
		sessionFactory.getCurrentSession().delete(fur);
	}

	public void updateFur(Fur fur) {
		sessionFactory.getCurrentSession().update(fur);
	}

	public boolean addFur(Fur fur) {
		sessionFactory.getCurrentSession().save(fur);
		return true;
	}

	public Fur getFurById(long id) {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Fur where id=?").setParameter(0, id).list();
		return (Fur) list.get(0);
	}

	public List<Fur> getFurs() {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Fur").list();
		return list;
	}

	public Fur findByColourAndLength(Integer colour, Integer length) {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Fur where furColour= ? and furLength= ?")
				.setParameter(0, colour).setParameter(1, length).list();
		return list.isEmpty() ? null : (Fur) list.get(0);
	}
}