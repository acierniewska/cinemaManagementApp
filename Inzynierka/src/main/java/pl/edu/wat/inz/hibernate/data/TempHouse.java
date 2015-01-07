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

	@Column(name = "SPACE", nullable = true, length = 11)
	private Integer space;

	public long getTempHouseId() {
		return tempHouseId;
	}

	public void setTempHouseId(long tempHouseId) {
		this.tempHouseId = tempHouseId;
	}

	public Integer getSpace() {
		return space;
	}

	public void setSpace(Integer space) {
		this.space = space;
	}

}
