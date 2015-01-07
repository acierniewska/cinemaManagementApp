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

import pl.edu.wat.inz.basic.enums.AnimalContractType;

@Entity
@Table(name = "animal_contract")
public class AnimalContract {
	@Column(name = "ANIMAL_CONTRACT_ID", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long animalContractId;

	@ManyToOne(targetEntity = Person.class)
	@Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "PERSON_ID", referencedColumnName = "PERSON_ID", nullable = false) })
	private Person person;

	@ManyToOne(targetEntity = Animal.class)
	@Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "ANIMAL_ID", referencedColumnName = "ANIMAL_ID", nullable = false) })
	private Animal animal;

	@Column(name = "CONTRACT_DATE", nullable = false)
	@Temporal(TemporalType.DATE)
	private java.util.Date contractDate;

	@Column(name = "CONSTRACT_NR", nullable = false, length = 16)
	private String contractNr;

	@Column(name = "ANIMAL_CONTRACT_TYPE", nullable = false, length = 11)
	private int animalContractType;

	public long getAnimalContractId() {
		return animalContractId;
	}

	public void setAnimalContractId(long animalContractId) {
		this.animalContractId = animalContractId;
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

	public int getAnimalContractType() {
		return animalContractType;
	}

	public AnimalContractType getAnimalContractTypeEnum() {
		return AnimalContractType.fromIntValue(animalContractType);
	}

	public void setAnimalContractType(int animalContractType) {
		this.animalContractType = animalContractType;
	}

	public void setAnimalContractType(AnimalContractType act) {
		this.animalContractType = act.getIntValue();
	}

}
