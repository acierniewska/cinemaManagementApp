package pl.edu.wat.inz.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.edu.wat.inz.hibernate.data.FinancialSupport;
import pl.edu.wat.inz.spring.dao.FinancialSupportDAO;

@Service("FinancialSupportService")
@Transactional(readOnly = true)
public class FinancialSupportService {

	@Autowired
	FinancialSupportDAO financialSupportDAO;

	@Transactional(readOnly = false)
	public void addFinancialSupport(FinancialSupport financialSupport) {
		getFinancialSupportDAO().addFinancialSupport(financialSupport);
	}

	@Transactional(readOnly = false)
	public void deleteFinancialSupport(FinancialSupport financialSupport) {
		getFinancialSupportDAO().deleteFinancialSupport(financialSupport);
	}

	@Transactional(readOnly = false)
	public void updateFinancialSupport(FinancialSupport financialSupport) {
		getFinancialSupportDAO().updateFinancialSupport(financialSupport);
	}

	public FinancialSupport getFinancialSupportById(int id) {
		return getFinancialSupportDAO().getFinancialSupportById(id);
	}

	public List<FinancialSupport> getFinancialSupports() {
		return getFinancialSupportDAO().getFinancialSupports();
	}

	public List<FinancialSupport> getNotExportedFinancialSupports() {
		return getFinancialSupportDAO().getNotExportedFinancialSupports();
	}

	public List<FinancialSupport> getFinancialSupportsForAnimal(long animalId) {
		return getFinancialSupportDAO().getFinancialSupportForAnimal(animalId);
	}

	public FinancialSupportDAO getFinancialSupportDAO() {
		return financialSupportDAO;
	}

	public void setFinancialSupportDAO(FinancialSupportDAO financialSupportDAO) {
		this.financialSupportDAO = financialSupportDAO;
	}
}
