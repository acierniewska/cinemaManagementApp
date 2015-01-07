package pl.edu.wat.inz.primefaces.bean.managedBean;

import static pl.edu.wat.inz.basic.AppConst.ERROR;
import static pl.edu.wat.inz.basic.AppConst.SUCCESS;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import org.springframework.dao.DataAccessException;

import pl.edu.wat.inz.hibernate.data.Person;
import pl.edu.wat.inz.spring.service.PersonService;

@ManagedBean(name = "personMB")
@RequestScoped
public class PersonManagedBean implements Serializable {
	private static final long serialVersionUID = 6388454038294869974L;

	private Person selectedPerson;
	@ManagedProperty(value = "#{PersonService}")
	private PersonService personService;

	List<Person> personList;
	private int id;
	private String name;

	public Person getSelectedPerson() {
		return selectedPerson;
	}

	public void setSelectedPerson(Person selectedPerson) {
		this.selectedPerson = selectedPerson;
	}

	public void onUserRowUnselect(UnselectEvent event) {
		setSelectedPerson(null);
	}

	public void onCompRowSelect(SelectEvent event) {
		setSelectedPerson((Person) event.getObject());
	}

	public String addPerson() {
		try {
			Person Person = new Person();
			Person.setPersonName(getName());
			getPersonService().addPerson(Person);
			reset();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String updatePerson(Person Person) {
		try {
			getPersonService().updatePerson(Person);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String deletePerson(Person person) {
		try {
			getPersonService().deletePerson(person);
			personList = null;
			getPersonList();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public void onEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Edited");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		updatePerson((Person) event.getObject());
	}

	public void onCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Cancelled");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void reset() {
		this.setId(0);
		this.setName("");
	}

	public List<Person> getPersonList() {
		if (personList == null) {
			personList = new ArrayList<Person>();
			personList.addAll(getPersonService().getPersons());
		}
		return personList;
	}

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService PersonService) {
		this.personService = PersonService;
	}

	public void setPersonList(List<Person> PersonList) {
		this.personList = PersonList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
