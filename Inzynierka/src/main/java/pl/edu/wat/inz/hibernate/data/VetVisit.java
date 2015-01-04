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

	@Column(name = "VET_VISIT_ID_DATE", nullable = false)
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
}
