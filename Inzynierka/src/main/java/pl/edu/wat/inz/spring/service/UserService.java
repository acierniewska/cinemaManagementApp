package pl.edu.wat.inz.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.edu.wat.inz.hibernate.data.User;
import pl.edu.wat.inz.spring.dao.UserDAO;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserDAO userDAO;

	public User getUser(String login) {
		return userDAO.getUser(login);
	}

}