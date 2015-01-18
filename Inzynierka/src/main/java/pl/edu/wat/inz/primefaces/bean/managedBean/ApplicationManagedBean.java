package pl.edu.wat.inz.primefaces.bean.managedBean;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import pl.edu.wat.inz.basic.enums.ApplicationType;
import pl.edu.wat.inz.hibernate.data.Animal;
import pl.edu.wat.inz.hibernate.data.Application;
import pl.edu.wat.inz.hibernate.data.Person;

@ManagedBean(name = "applicationMB")
@ViewScoped
public class ApplicationManagedBean {

	private List<Application> applications;

	@PostConstruct
	public void init() {
		applications = new LinkedList<Application>();
		Application app = new Application();
		Animal animal = new Animal();
		animal.setAnimalName("Plejada");
		app.setAnimal(animal);
		Person person = new Person();
		person.setPersonName("Anna");
		person.setSurname("Cierniewska");
		app.setPerson(person);
		app.setApplicationType(ApplicationType.ADOPTION.getIntValue());
		app.setApplicationDesc("Spe³niam wszystkie warunki do adopcji...");
		applications.add(app);
	}

	public List<Application> getApplications() {
		return applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

}
