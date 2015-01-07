package pl.edu.wat.inz.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.edu.wat.inz.hibernate.data.TempHouse;
import pl.edu.wat.inz.spring.dao.TempHouseDAO;

@Service("TempHouseService")
@Transactional(readOnly = true)
public class TempHouseService {

	@Autowired
	TempHouseDAO tempHouseDAO;

	@Transactional(readOnly = false)
	public void addTempHouse(TempHouse tempHouse) {
		getTempHouseDAO().addTempHouse(tempHouse);
	}

	@Transactional(readOnly = false)
	public void deleteTempHouse(TempHouse tempHouse) {
		getTempHouseDAO().deleteTempHouse(tempHouse);
	}

	@Transactional(readOnly = false)
	public void updateTempHouse(TempHouse tempHouse) {
		getTempHouseDAO().updateTempHouse(tempHouse);
	}

	public TempHouse getTempHouseById(int id) {
		return getTempHouseDAO().getTempHouseById(id);
	}

	public List<TempHouse> getTempHouses() {
		return getTempHouseDAO().getTempHouses();
	}

	public TempHouseDAO getTempHouseDAO() {
		return tempHouseDAO;
	}

	public void setTempHouseDAO(TempHouseDAO tempHouseDAO) {
		this.tempHouseDAO = tempHouseDAO;
	}
}
