package pl.edu.wat.inz.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import pl.edu.wat.inz.hibernate.data.AnimalContract;

@Component
@Transactional
public class AnimalContractDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void register(AnimalContract animalContract) {
		sessionFactory.getCurrentSession().save(animalContract);
	}

	public void deleteAnimalContract(AnimalContract animalContract) {
		sessionFactory.getCurrentSession().delete(animalContract);
	}

	public void updateAnimalContract(AnimalContract animalContract) {
		sessionFactory.getCurrentSession().update(animalContract);
	}

	@Transactional
	public void addAnimalContract(AnimalContract animalContract) {
		sessionFactory.getCurrentSession().save(animalContract);
	}

	public AnimalContract getAnimalContractById(long id) {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from AnimalContract where id=?")
				.setParameter(0, id).list();
		return (AnimalContract) list.get(0);
	}

	public List<AnimalContract> getAnimalContracts() {
		List list = getSessionFactory().getCurrentSession()
				.createQuery(" from AnimalContract").list();
		return list;
	}

	public List<AnimalContract> getCatsOnly() {

		return null;
	}
}
