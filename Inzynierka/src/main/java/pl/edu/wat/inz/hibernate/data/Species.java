package pl.edu.wat.inz.hibernate.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "species")
public class Species implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "SPECIES_ID", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long speciesId;

	@Column(name = "SPECIES_NAME", nullable = false, length = 32)
	private String speciesName;

	@Column(name = "SPECIES_DESC", nullable = true, length = 255)
	private String speciesDesc;

	public long getSpeciesId() {
		return speciesId;
	}

	public void setSpeciesId(long speciesId) {
		this.speciesId = speciesId;
	}

	public String getSpeciesName() {
		return speciesName;
	}

	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName;
	}

	public String getSpeciesDesc() {
		return speciesDesc;
	}

	public void setSpeciesDesc(String speciesDesc) {
		this.speciesDesc = speciesDesc;
	}

}
