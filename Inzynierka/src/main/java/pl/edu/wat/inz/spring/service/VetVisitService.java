package pl.edu.wat.inz.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.edu.wat.inz.hibernate.data.VetVisit;
import pl.edu.wat.inz.spring.dao.VetVisitDAO;

@Service("VetVisitService")
@Transactional(readOnly = true)
public class VetVisitService {

	@Autowired
	VetVisitDAO vetVisitDAO;

	@Transactional(readOnly = false)
	public void addVetVisit(VetVisit vetVisit) {
		getVetVisitDAO().addVetVisit(vetVisit);
	}

	@Transactional(readOnly = false)
	public void deleteVetVisit(VetVisit vetVisit) {
		getVetVisitDAO().deleteVetVisit(vetVisit);
	}

	@Transactional(readOnly = false)
	public void updateVetVisit(VetVisit vetVisit) {
		getVetVisitDAO().updateVetVisit(vetVisit);
	}

	public VetVisit getVetVisitById(int id) {
		return getVetVisitDAO().getVetVisitById(id);
	}

	public List<VetVisit> getVetVisits() {
		return getVetVisitDAO().getVetVisits();
	}

	public List<VetVisit> getVetVisitsForAnimal(long animalId) {
		return getVetVisitDAO().getVetVisitForAnimal(animalId);
	}

	public VetVisitDAO getVetVisitDAO() {
		return vetVisitDAO;
	}

	public void setVetVisitDAO(VetVisitDAO vetVisitDAO) {
		this.vetVisitDAO = vetVisitDAO;
	}
}
