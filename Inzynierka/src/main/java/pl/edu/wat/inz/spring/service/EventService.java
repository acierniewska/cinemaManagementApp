package pl.edu.wat.inz.spring.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.edu.wat.inz.hibernate.data.Event;
import pl.edu.wat.inz.spring.dao.EventDAO;

@Service("EventService")
@Transactional(readOnly = true)
public class EventService implements Serializable {
	private static final long serialVersionUID = 1L;
	@Autowired
	EventDAO eventDAO;

	@Transactional(readOnly = false)
	public void addEvent(Event Event) {
		getEventDAO().addEvent(Event);
	}

	@Transactional(readOnly = false)
	public void deleteEvent(Event Event) {
		getEventDAO().deleteEvent(Event);
	}

	@Transactional(readOnly = false)
	public void updateEvent(Event Event) {
		getEventDAO().updateEvent(Event);
	}

	public Event getEventById(long l) {
		return getEventDAO().getEventById(l);
	}

	public List<Event> getEvents() {
		return getEventDAO().getEvents();
	}

	public EventDAO getEventDAO() {
		return eventDAO;
	}

	public void setEventDAO(EventDAO EventDAO) {
		this.eventDAO = EventDAO;
	}
}
