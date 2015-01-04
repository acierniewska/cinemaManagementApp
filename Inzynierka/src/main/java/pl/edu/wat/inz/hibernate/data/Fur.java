package pl.edu.wat.inz.hibernate.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fur")
public class Fur {
	@Column(name = "FUR_ID", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long furId;

	@Column(name = "FUR_COLOUR", nullable = true, length = 11)
	private Integer furColour;

	@Column(name = "FUR_LENGTH", nullable = true, length = 11)
	private Integer furLength;

	public long getFurId() {
		return furId;
	}

	public void setFurId(long furId) {
		this.furId = furId;
	}

	public Integer getFurColour() {
		return furColour;
	}

	public void setFurColour(Integer furColour) {
		this.furColour = furColour;
	}

	public Integer getFurLength() {
		return furLength;
	}

	public void setFurLength(Integer furLength) {
		this.furLength = furLength;
	}

}
