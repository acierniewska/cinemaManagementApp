package pl.edu.wat.inz.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.edu.wat.inz.hibernate.data.Role;
import pl.edu.wat.inz.spring.dao.RoleDAO;

@Service
@Transactional
public class RoleService {

	@Autowired
	private RoleDAO roleDAO;

	public Role getRole(int id) {
		return roleDAO.getRole(id);
	}

}