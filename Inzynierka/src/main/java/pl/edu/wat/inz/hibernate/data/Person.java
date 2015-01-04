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
@Table(name = "person")
public class Person {
	@Column(name = "PERSON_ID", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long personId;

	@ManyToOne(targetEntity = TempHouse.class)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "TEMP_HOUSE_ID", referencedColumnName = "TEMP_HOUSE_ID") })
	private TempHouse tempHouse;

	@ManyToOne(targetEntity = Asylum.class)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "ASYLIUM_ID", referencedColumnName = "ASYLIUM_ID") })
	private Asylum asylium;

	@ManyToOne(targetEntity = AnimalRepo.class)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "ANIMAL_REPO_ID", referencedColumnName = "ANIMAL_REPO_ID") })
	private AnimalRepo animalRepo;

	@ManyToOne(targetEntity = User.class)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID") })
	private User user;

	@Column(name = "STREET", nullable = false, length = 32)
	private String street;

	@Column(name = "HOUSE_NR", nullable = false, length = 8)
	private String houseNr;

	@Column(name = "APARTMENT_NR", nullable = true, length = 8)
	private String apartmentNr;

	@Column(name = "ZIP_CODE", nullable = false, precision = 5, scale = 0)
	private java.math.BigDecimal zipCode;

	@Column(name = "CITY", nullable = false, length = 32)
	private String city;

	@Column(name = "POST", nullable = false, length = 32)
	private String post;

	@Column(name = "PERSON_NAME", nullable = false, length = 32)
	private String personName;

	@Column(name = "SECOND_NAME", nullable = false, length = 32)
	private String secondName;

	@Column(name = "SURNAME", nullable = false, length = 64)
	private String surName;

	@Column(name = "PERSON_BIRTHDAY", nullable = false)
	@Temporal(TemporalType.DATE)
	private java.util.Date personBirthday;

	@Column(name = "PERSONAL_ID_NR", nullable = false, precision = 11, scale = 0)
	private java.math.BigDecimal personalIdNr;

	@Column(name = "ID_CARD_NR", nullable = false, length = 9)
	private String idCardNr;

	@Column(name = "IS_BOARD_MEMBER", nullable = true)
	private Boolean isBoardMember;

	@Column(name = "IS_EMPLOYEE", nullable = true)
	private Boolean isEmployee;

	@Column(name = "IS_VOULOUNTEER", nullable = true)
	private Boolean isVolounteer;

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public TempHouse getTempHouse() {
		return tempHouse;
	}

	public void setTempHouse(TempHouse tempHouse) {
		this.tempHouse = tempHouse;
	}

	public Asylum getAsylium() {
		return asylium;
	}

	public void setAsylium(Asylum asylium) {
		this.asylium = asylium;
	}

	public AnimalRepo getAnimalRepo() {
		return animalRepo;
	}

	public void setAnimalRepo(AnimalRepo animalRepo) {
		this.animalRepo = animalRepo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseNr() {
		return houseNr;
	}

	public void setHouseNr(String houseNr) {
		this.houseNr = houseNr;
	}

	public String getApartmentNr() {
		return apartmentNr;
	}

	public void setApartmentNr(String apartmentNr) {
		this.apartmentNr = apartmentNr;
	}

	public java.math.BigDecimal getZipCode() {
		return zipCode;
	}

	public void setZipCode(java.math.BigDecimal zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public java.util.Date getPersonBirthday() {
		return personBirthday;
	}

	public void setPersonBirthday(java.util.Date personBirthday) {
		this.personBirthday = personBirthday;
	}

	public java.math.BigDecimal getPersonalIdNr() {
		return personalIdNr;
	}

	public void setPersonalIdNr(java.math.BigDecimal personalIdNr) {
		this.personalIdNr = personalIdNr;
	}

	public String getIdCardNr() {
		return idCardNr;
	}

	public void setIdCardNr(String idCardNr) {
		this.idCardNr = idCardNr;
	}

	public Boolean getIsBoardMember() {
		return isBoardMember;
	}

	public void setIsBoardMember(Boolean isBoardMember) {
		this.isBoardMember = isBoardMember;
	}

	public Boolean getIsEmployee() {
		return isEmployee;
	}

	public void setIsEmployee(Boolean isEmployee) {
		this.isEmployee = isEmployee;
	}

	public Boolean getIsVolounteer() {
		return isVolounteer;
	}

	public void setIsVolounteer(Boolean isVolounteer) {
		this.isVolounteer = isVolounteer;
	}

}
