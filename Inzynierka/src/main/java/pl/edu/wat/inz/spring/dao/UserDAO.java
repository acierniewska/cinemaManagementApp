package pl.edu.wat.inz.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pl.edu.wat.inz.hibernate.data.User;

@Repository
public class UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session openSession() {
		return sessionFactory.getCurrentSession();
	}

	public User getUser(String login) {
		List<User> userList = new ArrayList<User>();
		Query query = openSession().createQuery(
				"from User U where U.login = :userLogin");
		query.setParameter("userLogin", login);
		userList = (List<User>) query.list();
		if (userList.size() > 0)
			return userList.get(0);
		else
			return null;
	}
}