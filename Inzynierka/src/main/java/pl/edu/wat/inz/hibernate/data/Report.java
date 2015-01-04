package pl.edu.wat.inz.hibernate.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "report")
public class Report {
	@Column(name = "REPORT_ID", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long reportId;

	@ManyToOne(targetEntity = Person.class)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "PERSON_ID", referencedColumnName = "PERSON_ID", nullable = false) })
	private Person person;

	@Column(name = "REPORT_DATE", nullable = false)
	@Temporal(TemporalType.DATE)
	private java.util.Date reportDate;

	@Column(name = "YEAR", nullable = false, precision = 4, scale = 0)
	private java.math.BigDecimal year;

	public long getReportId() {
		return reportId;
	}

	public void setReportId(long reportId) {
		this.reportId = reportId;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public java.util.Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(java.util.Date reportDate) {
		this.reportDate = reportDate;
	}

	public java.math.BigDecimal getYear() {
		return year;
	}

	public void setYear(java.math.BigDecimal year) {
		this.year = year;
	}

}
