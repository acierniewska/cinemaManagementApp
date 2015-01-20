package pl.edu.wat.inz.hibernate.data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "animal_feature")
public class AnimalFeature implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne(targetEntity = Animal.class)
	@JoinColumns({ @JoinColumn(name = "ANIMAL_ID", referencedColumnName = "ANIMAL_ID") })
	@Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@Id
	private Animal animal;

	@ManyToOne(targetEntity = Feature.class)
	@JoinColumns({ @JoinColumn(name = "FEATURE_ID", referencedColumnName = "FEATURE_ID") })
	@Cascade({ org.hibernate.annotations.CascadeType.LOCK })
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
