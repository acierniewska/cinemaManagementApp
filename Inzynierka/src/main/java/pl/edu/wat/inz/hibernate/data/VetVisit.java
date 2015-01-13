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
@Table(name = "vet_visit")
public class VetVisit {

	@Column(name = "VET_VISIT_ID", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long vetVisitId;

	@ManyToOne(targetEntity = Animal.class)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "ANIMAL_ID", referencedColumnName = "ANIMAL_ID", nullable = false) })
	private Animal animal;

	@Column(name = "VET_VISIT_DATE", nullable = false)
	@Temporal(TemporalType.DATE)
	private java.util.Date vetVisitDate;

	@Column(name = "VET_VISIT_TIME", nullable = false)
	private java.sql.Time vetVisitTime;

	@Column(name = "PLANNED", nullable = false)
	private boolean planned;

	@Column(name = "FOUNDATION_PAYMENT", nullable = true, precision = 4, scale = 2)
	private java.math.BigDecimal foundationPayment;

	@Column(name = "DETAILS", nullable = true, length = 128)
	private String details;

	public long getVetVisitId() {
		return vetVisitId;
	}

	public void setVetVisitId(long vetVisitId) {
		this.vetVisitId = vetVisitId;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public java.util.Date getVetVisitDate() {
		return vetVisitDate;
	}

	public void setVetVisitDate(java.util.Date vetVisitDate) {
		this.vetVisitDate = vetVisitDate;
	}

	public java.sql.Time getVetVisitTime() {
		return vetVisitTime;
	}

	public void setVetVisitTime(java.sql.Time vetVisitTime) {
		this.vetVisitTime = vetVisitTime;
	}

	public boolean getPlanned() {
		return planned;
	}

	public void setPlanned(boolean planned) {
		this.planned = planned;
	}

	public java.math.BigDecimal getFoundationPayment() {
		return foundationPayment;
	}

	public void setFoundationPayment(java.math.BigDecimal foundationPayment) {
		this.foundationPayment = foundationPayment;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
