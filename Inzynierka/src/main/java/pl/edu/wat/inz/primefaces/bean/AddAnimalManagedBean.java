package pl.edu.wat.inz.primefaces.bean;

import static pl.edu.wat.inz.basic.AppConst.ERROR;
import static pl.edu.wat.inz.basic.AppConst.SUCCESS;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.dao.DataAccessException;

import pl.edu.wat.inz.hibernate.data.Animal;
import pl.edu.wat.inz.hibernate.data.Fur;
import pl.edu.wat.inz.primefaces.bean.managedBean.AnimalManagedBean;
import pl.edu.wat.inz.spring.service.AnimalService;
import pl.edu.wat.inz.spring.service.FurService;

@ManagedBean(name = "addAnimalMB")
@SessionScoped
public class AddAnimalManagedBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Animal newAnimal = new Animal();
	private Integer furLen;
	private Integer furColour;

	@ManagedProperty(value = "#{animalMB}")
	private AnimalManagedBean animalMB;

	public AnimalManagedBean getAnimalMB() {
		return animalMB;
	}

	public void setAnimalMB(AnimalManagedBean animalMB) {
		this.animalMB = animalMB;
	}

	@ManagedProperty(value = "#{FurService}")
	private FurService furService;

	@ManagedProperty(value = "#{AnimalService}")
	private AnimalService animalService;

	public String addAnimal() {
		try {
			Fur fur = getFurService().findByColourAndLength(furColour, furLen);
			if (fur == null) {
				getFurService().addFur(fur);
			}
			newAnimal.setFur(fur);
			getAnimalService().addAnimal(newAnimal);
			addMessage("Poprawnie dodano zwierzê o imieniu "
					+ newAnimal.getAnimalName());
			newAnimal = new Animal();
			animalMB.updateAnimalList();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public AnimalService getAnimalService() {
		return animalService;
	}

	public void setAnimalService(AnimalService AnimalService) {
		this.animalService = AnimalService;
	}

	public Animal getNewAnimal() {
		return newAnimal;
	}

	public void setNewAnimal(Animal newAnimal) {
		this.newAnimal = newAnimal;
	}

	public Integer getFurLen() {
		return furLen;
	}

	public void setFurLen(Integer furLen) {
		this.furLen = furLen;
	}

	public Integer getFurColour() {
		return furColour;
	}

	public void setFurColour(Integer furColour) {
		this.furColour = furColour;
	}

	public FurService getFurService() {
		return furService;
	}

	public void setFurService(FurService furService) {
		this.furService = furService;
	}

	public void addMessage(String summary) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				summary, null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

}