package pl.edu.wat.inz.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.edu.wat.inz.hibernate.data.Animal;
import pl.edu.wat.inz.spring.dao.AnimalDAO;

@Service("AnimalService")
@Transactional(readOnly = true)
public class AnimalService {

	@Autowired
	AnimalDAO animalDAO;

	@Transactional(readOnly = false)
	public void addAnimal(Animal animal) {
		getAnimalDAO().addAnimal(animal);
	}

	@Transactional(readOnly = false)
	public void deleteAnimal(Animal animal) {
		getAnimalDAO().deleteAnimal(animal);
	}

	@Transactional(readOnly = false)
	public void updateAnimal(Animal animal) {
		getAnimalDAO().updateAnimal(animal);
	}

	public Animal getAnimalById(int id) {
		return getAnimalDAO().getAnimalById(id);
	}

	public List<Animal> getAnimals() {
		return getAnimalDAO().getAnimals();
	}

	public AnimalDAO getAnimalDAO() {
		return animalDAO;
	}

	public void setAnimalDAO(AnimalDAO animalDAO) {
		this.animalDAO = animalDAO;
	}
}
