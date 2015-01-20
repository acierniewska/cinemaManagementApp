package pl.edu.wat.inz.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.edu.wat.inz.hibernate.data.Fur;
import pl.edu.wat.inz.spring.dao.FurDAO;

@Service("FurService")
@Transactional(readOnly = true)
public class FurService {

	@Autowired
	FurDAO furDAO;

	@Transactional(readOnly = false)
	public void addFur(Fur fur) {
		getFurDAO().addFur(fur);
	}

	@Transactional(readOnly = false)
	public void deleteFur(Fur fur) {
		getFurDAO().deleteFur(fur);
	}

	@Transactional(readOnly = false)
	public void updateFur(Fur fur) {
		getFurDAO().updateFur(fur);
	}

	public Fur getFurById(int id) {
		return getFurDAO().getFurById(id);
	}

	public List<Fur> getFurs() {
		return getFurDAO().getFurs();
	}

	public Fur findByColourAndLength(Integer colour, Integer length) {
		return getFurDAO().findByColourAndLength(colour, length);
	}

	public FurDAO getFurDAO() {
		return furDAO;
	}

	public void setFurDAO(FurDAO furDAO) {
		this.furDAO = furDAO;
	}
}
