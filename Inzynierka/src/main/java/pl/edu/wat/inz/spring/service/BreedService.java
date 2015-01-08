package pl.edu.wat.inz.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.edu.wat.inz.hibernate.data.Breed;
import pl.edu.wat.inz.spring.dao.BreedDAO;

@Service("BreedService")
@Transactional(readOnly = true)
public class BreedService {

	@Autowired
	BreedDAO breedDAO;

	@Transactional(readOnly = false)
	public void addBreed(Breed breed) {
		getBreedDAO().addBreed(breed);
	}

	@Transactional(readOnly = false)
	public void deleteBreed(Breed breed) {
		getBreedDAO().deleteBreed(breed);
	}

	@Transactional(readOnly = false)
	public void updateBreed(Breed breed) {
		getBreedDAO().updateBreed(breed);
	}

	public Breed getBreedById(int id) {
		return getBreedDAO().getBreedById(id);
	}

	public List<Breed> getBreeds() {
		return getBreedDAO().getBreeds();
	}

	public List<Breed> getBreedsForSpecies(long speciesId) {
		return getBreedDAO().getBreedsForSpecies(speciesId);
	}

	public BreedDAO getBreedDAO() {
		return breedDAO;
	}

	public void setBreedDAO(BreedDAO breedDAO) {
		this.breedDAO = breedDAO;
	}
}
