package pl.edu.wat.inz.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.edu.wat.inz.hibernate.data.Person;
import pl.edu.wat.inz.spring.dao.PersonDAO;

@Service("PersonService")
@Transactional(readOnly = true)
public class PersonService {
	@Autowired
	PersonDAO personDAO;

	@Transactional(readOnly = false)
	public void addPerson(Person person) {
		getPersonDAO().addPerson(person);
	}

	@Transactional(readOnly = false)
	public void deletePerson(Person person) {
		getPersonDAO().deletePerson(person);
	}

	@Transactional(readOnly = false)
	public void updatePerson(Person person) {
		getPersonDAO().updatePerson(person);
	}

	public Person getPersonById(int id) {
		return getPersonDAO().getPersonById(id);
	}

	public List<Person> getPersons() {
		return getPersonDAO().getPersons();
	}

	public PersonDAO getPersonDAO() {
		return personDAO;
	}

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}
}
