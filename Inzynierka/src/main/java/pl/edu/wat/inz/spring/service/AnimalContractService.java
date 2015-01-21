package pl.edu.wat.inz.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.edu.wat.inz.hibernate.data.AnimalContract;
import pl.edu.wat.inz.spring.dao.AnimalContractDAO;

@Service("AnimalContractService")
public class AnimalContractService {

	@Autowired
	AnimalContractDAO animalContractDAO;

	public void addAnimalContract(AnimalContract animalContract) {
		getAnimalContractDAO().addAnimalContract(animalContract);
	}

	public void deleteAnimalContract(AnimalContract animalContract) {
		getAnimalContractDAO().deleteAnimalContract(animalContract);
	}

	public void updateAnimalContract(AnimalContract animalContract) {
		getAnimalContractDAO().updateAnimalContract(animalContract);
	}

	public AnimalContract getAnimalContractById(long id) {
		return getAnimalContractDAO().getAnimalContractById(id);
	}

	public List<AnimalContract> getAnimalContracts() {
		return getAnimalContractDAO().getAnimalContracts();
	}

	public AnimalContractDAO getAnimalContractDAO() {
		return animalContractDAO;
	}

	public void setAnimalContractDAO(AnimalContractDAO animalContractDAO) {
		this.animalContractDAO = animalContractDAO;
	}
}
