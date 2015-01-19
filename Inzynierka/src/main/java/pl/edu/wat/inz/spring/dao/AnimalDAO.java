package pl.edu.wat.inz.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import pl.edu.wat.inz.hibernate.data.Animal;

@Component
@Transactional
public class AnimalDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void register(Animal animal) {
		sessionFactory.getCurrentSession().save(animal);
	}

	public void deleteAnimal(Animal animal) {
		sessionFactory.getCurrentSession().delete(animal);
	}

	public void updateAnimal(Animal animal) {
		sessionFactory.getCurrentSession().update(animal);
	}

	@Transactional
	public void addAnimal(Animal animal) {
		sessionFactory.getCurrentSession().save(animal);
	}

	public Animal getAnimalById(int id) {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Animal where id=?").setParameter(0, id)
				.list();
		return (Animal) list.get(0);
	}

	public List<Animal> getAnimals() {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Animal").list();
		return list;
	}

	public List<Animal> getCatsOnly() {

		return null;
	}
}
