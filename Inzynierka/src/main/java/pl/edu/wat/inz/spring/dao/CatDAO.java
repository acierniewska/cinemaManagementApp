package pl.edu.wat.inz.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.edu.wat.inz.hibernate.data.Cat;

@Component
public class CatDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void register(Cat cat) {
		sessionFactory.getCurrentSession().save(cat);
	}

	public void deleteCat(Cat cat) {
		sessionFactory.getCurrentSession().delete(cat);
	}

	public void updateCat(Cat cat) {
		sessionFactory.getCurrentSession().update(cat);
	}

	public void addCat(Cat cat) {
		sessionFactory.getCurrentSession().save(cat);
	}

	public Cat getCatById(int id) {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Cat where id=?").setParameter(0, id).list();
		return (Cat) list.get(0);
	}

	public List<Cat> getCats() {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Cat").list();
		return list;
	}
}
