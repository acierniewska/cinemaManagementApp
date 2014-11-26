package pl.edu.wat.inz.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.edu.wat.inz.hibernate.data.Cat;
import pl.edu.wat.inz.spring.dao.CatDAO;

@Service("CatService")
@Transactional(readOnly = true)
public class CatService {

	@Autowired
	CatDAO catDAO;

	@Transactional(readOnly = false)
	public void addCat(Cat Cat) {
		getCatDAO().addCat(Cat);
	}

	@Transactional(readOnly = false)
	public void deleteCat(Cat Cat) {
		getCatDAO().deleteCat(Cat);
	}

	@Transactional(readOnly = false)
	public void updateCat(Cat Cat) {
		getCatDAO().updateCat(Cat);
	}

	public Cat getCatById(int id) {
		return getCatDAO().getCatById(id);
	}

	public List<Cat> getCats() {
		return getCatDAO().getCats();
	}

	public CatDAO getCatDAO() {
		return catDAO;
	}

	public void setCatDAO(CatDAO CatDAO) {
		this.catDAO = CatDAO;
	}
}
