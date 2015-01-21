package pl.edu.wat.inz.primefaces.bean.managedBean;

import static pl.edu.wat.inz.basic.AppConst.ERROR;
import static pl.edu.wat.inz.basic.AppConst.SUCCESS;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import org.springframework.dao.DataAccessException;

import pl.edu.wat.inz.hibernate.data.Animal;
import pl.edu.wat.inz.spring.service.AnimalService;

@ManagedBean(name = "animalMB", eager = true)
@ApplicationScoped
public class AnimalManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{AnimalService}")
	private AnimalService animalService;

	private Animal selectedAnimal = new Animal();
	List<Animal> animalList;

	public Animal getSelectedAnimal() {
		return selectedAnimal;
	}

	@PostConstruct
	public void init() {
		animalList = new ArrayList<Animal>();
		animalList.addAll(getAnimalService().getAnimals());
	}

	public void setSelectedAnimal(Animal selectedAnimal) {
		this.selectedAnimal = selectedAnimal;
	}

	public void onUserRowUnselect(UnselectEvent event) {
		setSelectedAnimal(new Animal());
	}

	public void onCompRowSelect(SelectEvent event) {
		setSelectedAnimal((Animal) event.getObject());
	}

	public String updateAnimal(Animal animal) {
		try {
			getAnimalService().updateAnimal(animal);
			updateAnimalList();
			addMessage("Zmodyfikowano zwierzê o imieniu "
					+ animal.getAnimalName());
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String updateAnimal() {
		try {
			getAnimalService().updateAnimal(selectedAnimal);
			updateAnimalList();
			addMessage("Zmodyfikowano zwierzê o imieniu "
					+ selectedAnimal.getAnimalName());
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String deleteAnimal() {
		try {
			getAnimalService().deleteAnimal(
					getAnimalService().getAnimalById(
							selectedAnimal.getAnimalId()));
			updateAnimalList();
			addMessage("Usuniêto zwierzê o imieniu "
					+ selectedAnimal.getAnimalName());
			selectedAnimal = new Animal();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public void onEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Edited");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		updateAnimal((Animal) event.getObject());
	}

	public void onCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Cancelled");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public List<Animal> getAnimalList() {
		return animalList;
	}

	public void updateAnimalList() {
		animalList.clear();
		animalList.addAll(getAnimalService().getAnimals());
	}

	public AnimalService getAnimalService() {
		return animalService;
	}

	public void setAnimalService(AnimalService AnimalService) {
		this.animalService = AnimalService;
	}

	public void setAnimalList(List<Animal> AnimalList) {
		this.animalList = AnimalList;
	}

	public void addMessage(String summary) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				summary, null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

}