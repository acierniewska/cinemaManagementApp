package pl.edu.wat.inz.primefaces.bean.managedBean;

import static pl.edu.wat.inz.basic.AppConst.ERROR;
import static pl.edu.wat.inz.basic.AppConst.SUCCESS;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import org.springframework.dao.DataAccessException;

import pl.edu.wat.inz.hibernate.data.Species;
import pl.edu.wat.inz.spring.service.SpeciesService;

@ManagedBean(name = "speciesMB")
@ViewScoped
public class SpeciesManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Species selectedSpecies = new Species();

	@ManagedProperty(value = "#{SpeciesService}")
	private SpeciesService speciesService;

	List<Species> speciesList;
	private int id;
	private String name;

	public void handleChange() {
		id++;
		System.out.println(id);
	}

	public Species getSelectedSpecies() {
		return selectedSpecies;
	}

	public void setSelectedSpecies(Species selectedSpecies) {
		this.selectedSpecies = selectedSpecies;
	}

	public void onUserRowUnselect(UnselectEvent event) {
		setSelectedSpecies(null);
	}

	public void onCompRowSelect(SelectEvent event) {
		setSelectedSpecies((Species) event.getObject());
	}

	public String addSpecies() {
		try {
			Species Species = new Species();
			Species.setSpeciesName(getName());
			getSpeciesService().addSpecies(Species);
			reset();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String updateSpecies(Species Species) {
		try {
			getSpeciesService().updateSpecies(Species);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String deleteSpecies(Species species) {
		try {
			getSpeciesService().deleteSpecies(species);
			speciesList = null;
			getSpeciesList();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public void onEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Edited");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		updateSpecies((Species) event.getObject());
	}

	public void onCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Cancelled");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void reset() {
		this.setId(0);
		this.setName("");
	}

	public List<Species> getSpeciesList() {
		if (speciesList == null) {
			speciesList = new ArrayList<Species>();
			speciesList.addAll(getSpeciesService().getSpeciess());
		}
		return speciesList;
	}

	public SpeciesService getSpeciesService() {
		return speciesService;
	}

	public void setSpeciesService(SpeciesService SpeciesService) {
		this.speciesService = SpeciesService;
	}

	public void setSpeciesList(List<Species> SpeciesList) {
		this.speciesList = SpeciesList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}