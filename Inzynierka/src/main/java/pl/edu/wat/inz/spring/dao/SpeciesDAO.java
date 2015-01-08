package pl.edu.wat.inz.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.edu.wat.inz.hibernate.data.Species;

@Component
public class SpeciesDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void register(Species species) {
		sessionFactory.getCurrentSession().save(species);
	}

	public void deleteSpecies(Species species) {
		sessionFactory.getCurrentSession().delete(species);
	}

	public void updateSpecies(Species species) {
		sessionFactory.getCurrentSession().update(species);
	}

	public void addSpecies(Species species) {
		sessionFactory.getCurrentSession().save(species);
	}

	public Species getSpeciesById(int id) {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Species where id=?").setParameter(0, id)
				.list();
		return (Species) list.get(0);
	}

	public List<Species> getSpeciess() {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Species").list();
		return list;
	}
}
