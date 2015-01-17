package pl.edu.wat.inz.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.edu.wat.inz.hibernate.data.AnimalFeature;
import pl.edu.wat.inz.spring.dao.AnimalFeatureDAO;

@Service("AnimalFeatureService")
@Transactional(readOnly = true)
public class AnimalFeatureService {

	@Autowired
	AnimalFeatureDAO animalFeatureDAO;

	@Transactional(readOnly = false)
	public void addAnimalFeature(AnimalFeature animalFeature) {
		getAnimalFeatureDAO().addAnimalFeature(animalFeature);
	}

	@Transactional(readOnly = false)
	public void deleteAnimalFeature(AnimalFeature animalFeature) {
		getAnimalFeatureDAO().deleteAnimalFeature(animalFeature);
	}

	@Transactional(readOnly = false)
	public void updateAnimalFeature(AnimalFeature animalFeature) {
		getAnimalFeatureDAO().updateAnimalFeature(animalFeature);
	}

	public AnimalFeature getAnimalFeatureById(int id) {
		return getAnimalFeatureDAO().getAnimalFeatureById(id);
	}

	public List<AnimalFeature> getAnimalFeatures() {
		return getAnimalFeatureDAO().getAnimalFeatures();
	}

	public List<AnimalFeature> getAnimalsAnimalFeature(long animalId) {
		return getAnimalFeatureDAO().getAnimalsAnimalFeatures(animalId);
	}

	public List<Long> getAnimalsFeaturesId(long animalId) {
		return getAnimalFeatureDAO().getAnimalsFeaturesId(animalId);
	}

	public AnimalFeatureDAO getAnimalFeatureDAO() {
		return animalFeatureDAO;
	}

	public void setAnimalFeatureDAO(AnimalFeatureDAO animalFeatureDAO) {
		this.animalFeatureDAO = animalFeatureDAO;
	}
}
