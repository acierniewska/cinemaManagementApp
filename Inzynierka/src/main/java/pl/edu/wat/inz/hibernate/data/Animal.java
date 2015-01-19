package pl.edu.wat.inz.hibernate.data;

import java.io.Serializable;

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
@Table(name = "animal")
public class Animal implements Serializable {
	private static final long serialVersionUID = 1L;

	public Animal() {
	}

	@Column(name = "ANIMAL_ID", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long animalId;

	@ManyToOne(targetEntity = Asylium.class)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "ASYLIUM_ID", referencedColumnName = "ASYLIUM_ID") })
	private Asylium asylium;

	@ManyToOne(targetEntity = AnimalRepo.class)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "ANIMAL_REPO_ID", referencedColumnName = "ANIMAL_REPO_ID") })
	private AnimalRepo animalRepo;

	@ManyToOne(targetEntity = Person.class)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "PERSON_ID", referencedColumnName = "PERSON_ID") })
	private Person person;

	@ManyToOne(targetEntity = Person.class)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "VIRTUAL_PERSON_ID", referencedColumnName = "PERSON_ID") })
	private Person virtualPerson;

	@ManyToOne(targetEntity = Person.class)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "TEMP_HOUSE_PERSON_ID", referencedColumnName = "PERSON_ID") })
	private Person tempHousePerson;

	@ManyToOne(targetEntity = Fur.class)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "FUR_ID", referencedColumnName = "FUR_ID", nullable = false) })
	private Fur fur;

	@ManyToOne(targetEntity = Breed.class)
	@Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "BREED_ID", referencedColumnName = "BREED_ID", nullable = false) })
	private Breed breed;

	@Column(name = "ANIMAL_NAME", nullable = false, length = 32)
	private String animalName;

	@Column(name = "ANIMAL_BIRTH_DAY", nullable = false)
	@Temporal(TemporalType.DATE)
	private java.util.Date animalBirthdayDay;

	@Column(name = "ANIMAL_RESCUE_DATE", nullable = false)
	@Temporal(TemporalType.DATE)
	private java.util.Date animalRescueDate;

	@Column(name = "IS_HANDICAPED", nullable = false)
	private boolean isHandicapte;

	@Column(name = "IS_CASTRATED", nullable = false)
	private boolean isCastrated;

	@Column(name = "PIC_PATH", nullable = false)
	private String picPath;

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public long getAnimalId() {
		return animalId;
	}

	public void setAnimalId(long animalId) {
		this.animalId = animalId;
	}

	public Asylium getAsylium() {
		return asylium == null ? new Asylium() : asylium;
	}

	public void setAsylium(Asylium asylium) {
		this.asylium = asylium;
	}

	public AnimalRepo getAnimalRepo() {
		return animalRepo == null ? new AnimalRepo() : animalRepo;
	}

	public void setAnimalRepo(AnimalRepo animalRepo) {
		this.animalRepo = animalRepo;
	}

	public Person getPerson() {
		return person == null ? new Person() : person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public boolean getIsCastrated() {
		return isCastrated;
	}

	public void setIsCastrated(boolean isCastrated) {
		this.isCastrated = isCastrated;
	}

	public Fur getFur() {
		return fur == null ? new Fur() : fur;
	}

	public void setFur(Fur fur) {
		this.fur = fur;
	}

	public Breed getBreed() {
		return breed == null ? new Breed() : breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public java.util.Date getAnimalBirthdayDay() {
		return animalBirthdayDay;
	}

	public void setAnimalBirthdayDay(java.util.Date animalBirthdayDay) {
		this.animalBirthdayDay = animalBirthdayDay;
	}

	public java.util.Date getAnimalRescueDate() {
		return animalRescueDate;
	}

	public void setAnimalRescueDate(java.util.Date animalRescueDate) {
		this.animalRescueDate = animalRescueDate;
	}

	public boolean getIsHandicapte() {
		return isHandicapte;
	}

	public void setIsHandicapte(boolean isHandicapte) {
		this.isHandicapte = isHandicapte;
	}

	public Person getVirtualPerson() {
		return virtualPerson == null ? new Person() : virtualPerson;
	}

	public void setVirtualPerson(Person virtualPerson) {
		this.virtualPerson = virtualPerson;
	}

	public Person getTempHousePerson() {
		return tempHousePerson == null ? new Person() : tempHousePerson;
	}

	public void setTempHousePerson(Person tempHousePerson) {
		this.tempHousePerson = tempHousePerson;
	}

}
