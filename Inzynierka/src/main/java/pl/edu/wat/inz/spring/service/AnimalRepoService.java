package pl.edu.wat.inz.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.edu.wat.inz.hibernate.data.AnimalRepo;
import pl.edu.wat.inz.spring.dao.AnimalRepoDAO;

@Service("AnimalRepoService")
@Transactional(readOnly = true)
public class AnimalRepoService {

	@Autowired
	AnimalRepoDAO animalRepoDAO;

	@Transactional(readOnly = false)
	public void addAnimalRepo(AnimalRepo animalRepo) {
		getAnimalRepoDAO().addAnimalRepo(animalRepo);
	}

	@Transactional(readOnly = false)
	public void deleteAnimalRepo(AnimalRepo animalRepo) {
		getAnimalRepoDAO().deleteAnimalRepo(animalRepo);
	}

	@Transactional(readOnly = false)
	public void updateAnimalRepo(AnimalRepo animalRepo) {
		getAnimalRepoDAO().updateAnimalRepo(animalRepo);
	}

	public AnimalRepo getAnimalRepoById(int id) {
		return getAnimalRepoDAO().getAnimalRepoById(id);
	}

	public List<AnimalRepo> getAnimalRepos() {
		return getAnimalRepoDAO().getAnimalRepos();
	}

	public AnimalRepoDAO getAnimalRepoDAO() {
		return animalRepoDAO;
	}

	public void setAnimalRepoDAO(AnimalRepoDAO animalRepoDAO) {
		this.animalRepoDAO = animalRepoDAO;
	}
}
