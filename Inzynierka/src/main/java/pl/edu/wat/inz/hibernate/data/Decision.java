package pl.edu.wat.inz.hibernate.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "desicion")
public class Decision implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne(targetEntity = Application.class)
	@JoinColumns({ @JoinColumn(name = "APPLICATION_ID", referencedColumnName = "APPLICATION_ID") })
	@Id
	private Application application;

	@ManyToOne(targetEntity = Person.class)
	@JoinColumns({ @JoinColumn(name = "PERSON_ID", referencedColumnName = "PERSON_ID") })
	@Id
	private Person person;

	@Column(name = "DECISION_VALUE", nullable = false)
	private boolean decisionValue;

	@Column(name = "EXPLANATION", nullable = false)
	private String explanation;

	@Column(name = "AMOUNT")
	private float amount;

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public boolean isDecisionValue() {
		return decisionValue;
	}

	public void setDecisionValue(boolean decisionValue) {
		this.decisionValue = decisionValue;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}
