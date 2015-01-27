package pl.edu.wat.inz.primefaces.bean;

import java.io.Serializable;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.event.ScheduleEntryMoveEvent;
import org.primefaces.event.ScheduleEntryResizeEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.DefaultScheduleModel;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;

import pl.edu.wat.inz.basic.enums.EventType;
import pl.edu.wat.inz.hibernate.data.Event;
import pl.edu.wat.inz.spring.service.EventService;

@ManagedBean(name = "scheduleView")
@ApplicationScoped
public class ScheduleView implements Serializable {
	private static final long serialVersionUID = -6788743225281253117L;
	private ScheduleModel eventModel;
	private ScheduleEvent event = new DefaultScheduleEvent();
	private String desc;

	@ManagedProperty("#{EventService}")
	private EventService service;

	public EventService getService() {
		return service;
	}

	public void setService(EventService service) {
		this.service = service;
	}

	@PostConstruct
	public void init() {
		if (eventModel != null)
			return;
		eventModel = new DefaultScheduleModel();
		/*
		 * eventModel.addEvent(new DefaultScheduleEvent(
		 * "Weterynarz - szczepienie", previousDay8Pm(), previousDay11Pm(),
		 * "emp1")); eventModel.addEvent(new
		 * DefaultScheduleEvent("Spotkanie dot. akcji", nextDay9Am(),
		 * nextDay11Am(), "emp3"));
		 */
		List<Event> events = service.getEvents();
		for (Event e : events) {
			eventModel.addEvent(new DefaultScheduleEvent(e.getEventName(), e
					.getDateStart(), e.getDateEnd(), e.getEventType()
					.getStyleClass()));
		}
	}

	public Date getRandomDate(Date base) {
		Calendar date = Calendar.getInstance();
		date.setTime(base);
		date.add(Calendar.DATE, ((int) (Math.random() * 30)) + 1); // set random
																	// day of
																	// month

		return date.getTime();
	}

	public Date getInitialDate() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(calendar.get(Calendar.YEAR), Calendar.FEBRUARY,
				calendar.get(Calendar.DATE), 0, 0, 0);

		return calendar.getTime();
	}

	public ScheduleModel getEventModel() {
		return eventModel;
	}

	private Calendar today() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
				calendar.get(Calendar.DATE), 0, 0, 0);

		return calendar;
	}

	private Date previousDay8Pm() {
		Calendar t = (Calendar) today().clone();
		t.set(Calendar.AM_PM, Calendar.PM);
		t.set(Calendar.DATE, t.get(Calendar.DATE) - 1);
		t.set(Calendar.HOUR, 8);

		return t.getTime();
	}

	private Date previousDay11Pm() {
		Calendar t = (Calendar) today().clone();
		t.set(Calendar.AM_PM, Calendar.PM);
		t.set(Calendar.DATE, t.get(Calendar.DATE) - 1);
		t.set(Calendar.HOUR, 11);

		return t.getTime();
	}

	private Date nextDay9Am() {
		Calendar t = (Calendar) today().clone();
		t.set(Calendar.AM_PM, Calendar.AM);
		t.set(Calendar.DATE, t.get(Calendar.DATE) + 1);
		t.set(Calendar.HOUR, 9);

		return t.getTime();
	}

	private Date nextDay11Am() {
		Calendar t = (Calendar) today().clone();
		t.set(Calendar.AM_PM, Calendar.AM);
		t.set(Calendar.DATE, t.get(Calendar.DATE) + 1);
		t.set(Calendar.HOUR, 11);

		return t.getTime();
	}

	public ScheduleEvent getEvent() {
		return event;
	}

	public void setEvent(ScheduleEvent event) {
		this.event = event;
	}

	public void addEvent(ActionEvent actionEvent) {
		pl.edu.wat.inz.hibernate.data.Event e = new pl.edu.wat.inz.hibernate.data.Event();
		e.setEventName(event.getTitle());
		e.setEventType(EventType.fromStyleClass(event.getStyleClass()));
		e.setTimeStart(new Time(event.getStartDate().getTime()));
		e.setDateStart(event.getStartDate());
		e.setTimeEnd(new Time(event.getEndDate().getTime()));
		e.setDateEnd(event.getEndDate());
		e.setEventDesc(desc);
		if (event.getId() == null) {
			eventModel.addEvent(event);
			service.addEvent(e);
		} else {
			eventModel.updateEvent(event);
			if (service.getEventById(e.getEventId()) == null)
				service.addEvent(e);
			else
				service.updateEvent(e);
		}
		event = new DefaultScheduleEvent();

		event.getDescription();
	}

	public void onEventSelect(SelectEvent selectEvent) {
		event = (ScheduleEvent) selectEvent.getObject();
	}

	public void onDateSelect(SelectEvent selectEvent) {
		event = new DefaultScheduleEvent("", (Date) selectEvent.getObject(),
				(Date) selectEvent.getObject());
	}

	public void onEventMove(ScheduleEntryMoveEvent event) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Event moved", "Day delta:" + event.getDayDelta()
						+ ", Minute delta:" + event.getMinuteDelta());

		addMessage(message);
	}

	public void onEventResize(ScheduleEntryResizeEvent event) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Event resized", "Day delta:" + event.getDayDelta()
						+ ", Minute delta:" + event.getMinuteDelta());

		addMessage(message);
	}

	private void addMessage(FacesMessage message) {
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}