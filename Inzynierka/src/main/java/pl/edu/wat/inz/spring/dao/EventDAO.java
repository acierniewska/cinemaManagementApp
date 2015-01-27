package pl.edu.wat.inz.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.edu.wat.inz.hibernate.data.Event;

@Component
public class EventDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void register(Event event) {
		sessionFactory.getCurrentSession().save(event);
	}

	public void deleteEvent(Event event) {
		sessionFactory.getCurrentSession().delete(event);
	}

	public void updateEvent(Event event) {
		sessionFactory.getCurrentSession().update(event);
	}

	public boolean addEvent(Event event) {
		sessionFactory.getCurrentSession().save(event);
		return true;
	}

	public Event getEventById(long id) {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Event where eventId=?").setParameter(0, id)
				.list();
		return list.isEmpty() ? null : (Event) list.get(0);
	}

	public List<Event> getEvents() {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Event").list();
		return list;
	}
}