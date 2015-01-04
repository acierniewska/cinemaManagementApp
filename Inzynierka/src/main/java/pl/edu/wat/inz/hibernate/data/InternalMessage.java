package pl.edu.wat.inz.hibernate.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@org.hibernate.annotations.Proxy(lazy = false)
@Table(name = "internal_message")
public class InternalMessage {
	@Column(name = "MESSAGE_ID", nullable = false)
	@Id
	@GeneratedValue(generator = "INTERNALMESSAGE_MESSAGEID_GENERATOR")
	@org.hibernate.annotations.GenericGenerator(name = "INTERNALMESSAGE_MESSAGEID_GENERATOR", strategy = "native")
	private long messageId;

	@ManyToOne(targetEntity = User.class)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID", nullable = false) })
	private User user1;

	@Column(name = "MESSAGE_DATE", nullable = false)
	@Temporal(TemporalType.DATE)
	private java.util.Date messageDate;

	@Column(name = "MESSAGE_TIME", nullable = false)
	private java.sql.Time messageTime;

	@Column(name = "SEEN_BY_USER", nullable = false)
	private boolean seenByUser;

	@Column(name = "MESSAGE", nullable = true)
	private String message;

	public long getMessageId() {
		return messageId;
	}

	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}

	public User getUser1() {
		return user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public java.util.Date getMessageDate() {
		return messageDate;
	}

	public void setMessageDate(java.util.Date messageDate) {
		this.messageDate = messageDate;
	}

	public java.sql.Time getMessageTime() {
		return messageTime;
	}

	public void setMessageTime(java.sql.Time messageTime) {
		this.messageTime = messageTime;
	}

	public boolean isSeenByUser() {
		return seenByUser;
	}

	public void setSeenByUser(boolean seenByUser) {
		this.seenByUser = seenByUser;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}