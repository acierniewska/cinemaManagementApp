package pl.edu.wat.inz.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.edu.wat.inz.hibernate.data.Person;

@Component
public class PersonDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void register(Person person) {
		sessionFactory.getCurrentSession().save(person);
	}

	public void deletePerson(Person person) {
		sessionFactory.getCurrentSession().delete(person);
	}

	public void updatePerson(Person person) {
		sessionFactory.getCurrentSession().update(person);
	}

	public void addPerson(Person person) {
		sessionFactory.getCurrentSession().save(person);
	}

	public Person getPersonById(int id) {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Person where id=?").setParameter(0, id)
				.list();
		return (Person) list.get(0);
	}

	public List<Person> getPersons() {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Person").list();
		return list;
	}

}
