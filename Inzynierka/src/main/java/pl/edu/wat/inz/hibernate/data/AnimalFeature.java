package pl.edu.wat.inz.hibernate.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "animal_feature")
public class AnimalFeature {

	@ManyToOne(targetEntity = Animal.class)
	@Column(name = "ANIMAL_ID", nullable = false)
	@Id
	private Animal animal;

	@ManyToOne(targetEntity = Feature.class)
	@Column(name = "FEATURE_ID", nullable = false)
	@Id
	private Feature feature;

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Feature getFeature() {
		return feature;
	}

	public void setFeature(Feature feature) {
		this.feature = feature;
	}

}
