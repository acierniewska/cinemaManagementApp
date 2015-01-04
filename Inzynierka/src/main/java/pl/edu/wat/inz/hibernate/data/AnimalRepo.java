package pl.edu.wat.inz.hibernate.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "animal_repo")
public class AnimalRepo {

	@Column(name = "ANIMAL_REPO_ID", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long animalRepoId;

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

	@Column(name = "SPACE", nullable = true, length = 11)
	private Integer space;

	@Column(name = "ANIMAL_REPO_NAME", nullable = false, length = 16)
	private String animalRepoName;

	@Column(name = "ANIMAL_REPO_DESC", nullable = false, length = 128)
	private String ANIMAL_REPO_DESC;

	public long getAnimalRepoId() {
		return animalRepoId;
	}

	public void setAnimalRepoId(long animalRepoId) {
		this.animalRepoId = animalRepoId;
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

	public Integer getSpace() {
		return space;
	}

	public void setSpace(Integer space) {
		this.space = space;
	}

	public String getAnimalRepoName() {
		return animalRepoName;
	}

	public void setAnimalRepoName(String animalRepoName) {
		this.animalRepoName = animalRepoName;
	}

	public String getANIMAL_REPO_DESC() {
		return ANIMAL_REPO_DESC;
	}

	public void setANIMAL_REPO_DESC(String aNIMAL_REPO_DESC) {
		ANIMAL_REPO_DESC = aNIMAL_REPO_DESC;
	}

}
