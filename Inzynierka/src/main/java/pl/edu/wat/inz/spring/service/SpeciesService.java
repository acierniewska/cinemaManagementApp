package pl.edu.wat.inz.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.edu.wat.inz.hibernate.data.Species;
import pl.edu.wat.inz.spring.dao.SpeciesDAO;

@Service("SpeciesService")
@Transactional(readOnly = true)
public class SpeciesService {

	@Autowired
	SpeciesDAO speciesDAO;

	@Transactional(readOnly = false)
	public void addSpecies(Species species) {
		getSpeciesDAO().addSpecies(species);
	}

	@Transactional(readOnly = false)
	public void deleteSpecies(Species species) {
		getSpeciesDAO().deleteSpecies(species);
	}

	@Transactional(readOnly = false)
	public void updateSpecies(Species species) {
		getSpeciesDAO().updateSpecies(species);
	}

	public Species getSpeciesById(int id) {
		return getSpeciesDAO().getSpeciesById(id);
	}

	public List<Species> getSpeciess() {
		return getSpeciesDAO().getSpeciess();
	}

	public SpeciesDAO getSpeciesDAO() {
		return speciesDAO;
	}

	public void setSpeciesDAO(SpeciesDAO speciesDAO) {
		this.speciesDAO = speciesDAO;
	}
}
