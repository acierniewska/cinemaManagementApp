package pl.edu.wat.inz.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.edu.wat.inz.hibernate.data.Asylium;
import pl.edu.wat.inz.spring.dao.AsyliumDAO;

@Service("AsyliumService")
@Transactional(readOnly = true)
public class AsyliumService {

	@Autowired
	AsyliumDAO asyliumDAO;

	@Transactional(readOnly = false)
	public void addAsylium(Asylium Asylium) {
		getAsyliumDAO().addAsylium(Asylium);
	}

	@Transactional(readOnly = false)
	public void deleteAsylium(Asylium Asylium) {
		getAsyliumDAO().deleteAsylium(Asylium);
	}

	@Transactional(readOnly = false)
	public void updateAsylium(Asylium Asylium) {
		getAsyliumDAO().updateAsylium(Asylium);
	}

	public Asylium getAsyliumById(int id) {
		return getAsyliumDAO().getAsyliumById(id);
	}

	public List<Asylium> getAsyliums() {
		return getAsyliumDAO().getAsyliums();
	}

	public AsyliumDAO getAsyliumDAO() {
		return asyliumDAO;
	}

	public void setAsyliumDAO(AsyliumDAO AsyliumDAO) {
		this.asyliumDAO = AsyliumDAO;
	}
}
