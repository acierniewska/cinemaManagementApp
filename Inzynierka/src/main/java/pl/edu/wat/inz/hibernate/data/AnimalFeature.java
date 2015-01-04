package pl.edu.wat.inz.hibernate.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "animal_feature")
public class AnimalFeature {

	@Column(name = "ANIMAL_ID", nullable = false)
	@Id
	private long animalId;

	@Column(name = "FEATURE_ID", nullable = false)
	@Id
	private long featureId;

	public long getAnimalId() {
		return animalId;
	}

	public void setAnimalId(long animalId) {
		this.animalId = animalId;
	}

	public long getFeatureId() {
		return featureId;
	}

	public void setFeatureId(long featureId) {
		this.featureId = featureId;
	}
}
