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

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "employment_contract")
public class EmploymentContract {
	@Column(name = "EMPLOYMENT_COTRACT_ID", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long employmentContractId;

	@ManyToOne(targetEntity = Person.class)
	@Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "PERSON_ID", referencedColumnName = "PERSON_ID", nullable = false) })
	private Person person;

	@Column(name = "CONTRACT_DATE", nullable = false)
	@Temporal(TemporalType.DATE)
	private java.util.Date contractDate;

	@Column(name = "CONSTRACT_NR", nullable = false, length = 16)
	private String contractNr;

	@Column(name = "EMPLOYMENT_CONTRACT_TYPE", nullable = false, length = 11)
	private int employmentContractType;

	public long getEmploymentContractId() {
		return employmentContractId;
	}

	public void setEmploymentContractId(long employmentContractId) {
		this.employmentContractId = employmentContractId;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public java.util.Date getContractDate() {
		return contractDate;
	}

	public void setContractDate(java.util.Date contractDate) {
		this.contractDate = contractDate;
	}

	public String getContractNr() {
		return contractNr;
	}

	public void setContractNr(String contractNr) {
		this.contractNr = contractNr;
	}

	public int getEmploymentContractType() {
		return employmentContractType;
	}

	public void setEmploymentContractType(int employmentContractType) {
		this.employmentContractType = employmentContractType;
	}

}
