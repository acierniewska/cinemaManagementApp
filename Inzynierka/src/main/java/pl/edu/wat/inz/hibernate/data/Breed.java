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

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "breed")
public class Breed implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "BREED_ID", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long breedId;

	@ManyToOne(targetEntity = Species.class)
	@Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "SPECIES_ID", referencedColumnName = "SPECIES_ID") })
	private Species species;

	@Column(name = "BREED_NAME", nullable = false, length = 32)
	private String breedName;

	@Column(name = "BREED_DESC", nullable = true, length = 255)
	private String breedDesc;

	public long getBreedId() {
		return breedId;
	}

	public void setBreedId(long breedId) {
		this.breedId = breedId;
	}

	public Species getSpecies() {
		return species == null ? new Species() : species;
	}

	public void setSpecies(Species species) {
		this.species = species;
	}

	public String getBreedName() {
		return breedName;
	}

	public void setBreedName(String breedName) {
		this.breedName = breedName;
	}

	public String getBreedDesc() {
		return breedDesc;
	}

	public void setBreedDesc(String breedDesc) {
		this.breedDesc = breedDesc;
	}

}
