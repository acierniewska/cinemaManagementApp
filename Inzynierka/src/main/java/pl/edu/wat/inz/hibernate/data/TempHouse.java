package pl.edu.wat.inz.hibernate.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "temp_house")
public class TempHouse {
	@Column(name = "TEMP_HOUSE_ID", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long tempHouseId;

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

	public long getTempHouseId() {
		return tempHouseId;
	}

	public void setTempHouseId(long tempHouseId) {
		this.tempHouseId = tempHouseId;
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

}
