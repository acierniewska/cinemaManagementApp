package pl.edu.wat.inz.hibernate.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import pl.edu.wat.inz.basic.enums.EventType;

@Entity
@Table(name = "event")
public class Event {
	@Column(name = "EVENT_ID", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long eventId;

	@Column(name = "DATE_START", nullable = false)
	@Temporal(TemporalType.DATE)
	private java.util.Date dateStart;

	@Column(name = "TIME_START", nullable = false)
	private java.sql.Time timeStart;

	@Column(name = "DATE_END", nullable = false)
	@Temporal(TemporalType.DATE)
	private java.util.Date dateEnd;

	@Column(name = "TIME_END", nullable = false)
	private java.sql.Time timeEnd;
	@Column(name = "EVENT_NAME", nullable = false, length = 32)
	private String eventName;

	@Column(name = "EVENT_TYPE", nullable = false, length = 11)
	private int eventType;

	@Column(name = "EVENT_DESC", nullable = true, length = 128)
	private String eventDesc;

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public java.util.Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(java.util.Date dateStart) {
		this.dateStart = dateStart;
	}

	public java.sql.Time getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(java.sql.Time timeStart) {
		this.timeStart = timeStart;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public EventType getEventType() {
		return EventType.fromIntValue(eventType);
	}

	public int getEventTypeEnum() {
		return eventType;
	}

	public void setEventType(int eventType) {
		this.eventType = eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType.getIntValue();
	}

	public String getEventDesc() {
		return eventDesc;
	}

	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}

}
