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

import pl.edu.wat.inz.basic.enums.AnimalContractType;
import pl.edu.wat.inz.basic.enums.ApplicationType;

@Entity
@Table(name = "application")
public class Application {

	@Column(name = "APPLICATION_ID", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long applicationId;

	@ManyToOne(targetEntity = Person.class)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "PERSON_ID", referencedColumnName = "PERSON_ID", nullable = false) })
	private Person person;

	@ManyToOne(targetEntity = Animal.class)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "ANIMAL_ID", referencedColumnName = "ANIMAL_ID") })
	private Animal animal;

	@Column(name = "APPLICATION_TYPE", nullable = false, length = 11)
	private int applicationType;

	public long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(long applicationId) {
		this.applicationId = applicationId;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public int getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(int applicationType) {
		this.applicationType = applicationType;
	}

	public AnimalContractType getAnimalContractTypeEnum() {
		return AnimalContractType.fromIntValue(applicationType);
	}

	public void setAnimalContractType(ApplicationType at) {
		this.applicationType = at.getIntValue();
	}
}
