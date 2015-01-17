package pl.edu.wat.inz.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.edu.wat.inz.hibernate.data.AnimalFeature;

@Component
public class AnimalFeatureDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void register(AnimalFeature animalFeature) {
		sessionFactory.getCurrentSession().save(animalFeature);
	}

	public void deleteAnimalFeature(AnimalFeature animalFeature) {
		sessionFactory.getCurrentSession().delete(animalFeature);
	}

	public void updateAnimalFeature(AnimalFeature animalFeature) {
		sessionFactory.getCurrentSession().update(animalFeature);
	}

	public boolean addAnimalFeature(AnimalFeature animalFeature) {
		sessionFactory.getCurrentSession().save(animalFeature);
		return true;
	}

	public AnimalFeature getAnimalFeatureById(long id) {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from AnimalFeature where id=?")
				.setParameter(0, id).list();
		return (AnimalFeature) list.get(0);
	}

	public List<AnimalFeature> getAnimalFeatures() {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from AnimalFeature").list();
		return list;
	}

	public List<AnimalFeature> getAnimalsAnimalFeatures(long animalId) {
		List list = getSessionFactory()
				.getCurrentSession()
				.createQuery(
						"select af from AnimalFeature af left join af.animal a where a.animalId =:aId")
				.setParameter("aId", animalId).list();
		return list;
	}

	public List<Long> getAnimalsFeaturesId(long animalId) {
		List list = getSessionFactory()
				.getCurrentSession()
				.createQuery(
						"select af.featureId from AnimalFeature af left join af.animal a where a.animalId =:aId")
				.setParameter("aId", animalId).list();
		return list;
	}
}