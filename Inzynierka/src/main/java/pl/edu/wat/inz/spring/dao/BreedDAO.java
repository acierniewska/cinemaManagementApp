package pl.edu.wat.inz.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.edu.wat.inz.hibernate.data.Breed;

@Component
public class BreedDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void register(Breed breed) {
		sessionFactory.getCurrentSession().save(breed);
	}

	public void deleteBreed(Breed breed) {
		sessionFactory.getCurrentSession().delete(breed);
	}

	public void updateBreed(Breed breed) {
		sessionFactory.getCurrentSession().update(breed);
	}

	public boolean addBreed(Breed breed) {
		sessionFactory.getCurrentSession().save(breed);
		return true;
	}

	public Breed getBreedById(long id) {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Breed where id=?").setParameter(0, id)
				.list();
		return (Breed) list.get(0);
	}

	public List<Breed> getBreeds() {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Breed").list();
		return list;
	}

	public List<Breed> getBreedsForSpecies(long speciesId) {
		List list = getSessionFactory()
				.getCurrentSession()
				.createQuery(
						"select b from Breed b left join b.species s where s.speciesId =:sId")
				.setParameter("sId", speciesId).list();
		return list;
	}
}