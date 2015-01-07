package pl.edu.wat.inz.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.edu.wat.inz.hibernate.data.AnimalRepo;

@Component
public class AnimalRepoDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void register(AnimalRepo animalRepo) {
		sessionFactory.getCurrentSession().save(animalRepo);
	}

	public void deleteAnimalRepo(AnimalRepo animalRepo) {
		sessionFactory.getCurrentSession().delete(animalRepo);
	}

	public void updateAnimalRepo(AnimalRepo animalRepo) {
		sessionFactory.getCurrentSession().update(animalRepo);
	}

	public void addAnimalRepo(AnimalRepo animalRepo) {
		sessionFactory.getCurrentSession().save(animalRepo);
	}

	public AnimalRepo getAnimalRepoById(int id) {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from AnimalRepo where id=?").setParameter(0, id)
				.list();
		return (AnimalRepo) list.get(0);
	}

	public List<AnimalRepo> getAnimalRepos() {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from AnimalRepo").list();
		return list;
	}

	public List<AnimalRepo> getCatsOnly() {

		return null;
	}
}
