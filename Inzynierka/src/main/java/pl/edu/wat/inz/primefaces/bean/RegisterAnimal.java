package pl.edu.wat.inz.primefaces.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import pl.edu.wat.inz.hibernate.data.Animal;
import pl.edu.wat.inz.spring.service.AnimalService;

@ManagedBean
@SessionScoped
public class RegisterAnimal {

	@ManagedProperty("#{AnimalService}")
	private AnimalService AnimalService;

	private Animal Animal = new Animal();

	public String register() {
		// AnimalService.register(Animal);
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage("The Animal " + this.Animal.getAnimalName()
						+ " Is Registered Successfully"));
		return "";
	}

	public Animal getAnimal() {
		return Animal;
	}

	public void setAnimal(Animal Animal) {
		this.Animal = Animal;
	}

	public AnimalService getAnimalService() {
		return AnimalService;
	}

	public void setAnimalService(AnimalService AnimalService) {
		this.AnimalService = AnimalService;
	}

}
