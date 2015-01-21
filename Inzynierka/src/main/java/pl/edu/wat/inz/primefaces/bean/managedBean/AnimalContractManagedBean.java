package pl.edu.wat.inz.primefaces.bean.managedBean;

import static pl.edu.wat.inz.basic.AppConst.ERROR;
import static pl.edu.wat.inz.basic.AppConst.SUCCESS;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import org.springframework.dao.DataAccessException;

import pl.edu.wat.inz.hibernate.data.AnimalContract;
import pl.edu.wat.inz.spring.service.AnimalContractService;

@ManagedBean(name = "animalContractMB")
@ViewScoped
public class AnimalContractManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{AnimalContractService}")
	private AnimalContractService animalContractService;

	private List<AnimalContract> animalContractList;
	private AnimalContract selectedAnimalContract;

	@PostConstruct
	public void init() {
		selectedAnimalContract = new AnimalContract();
	}

	public AnimalContract getSelectedAnimalContract() {
		return selectedAnimalContract;
	}

	public void setSelectedAnimalContract(AnimalContract selectedAnimalContract) {
		this.selectedAnimalContract = selectedAnimalContract;
	}

	public void onUserRowUnselect(UnselectEvent event) {
		setSelectedAnimalContract(null);
	}

	public void onCompRowSelect(SelectEvent event) {
		setSelectedAnimalContract((AnimalContract) event.getObject());
	}

	public String addAnimalContract() {
		try {
			getAnimalContractService()
					.addAnimalContract(selectedAnimalContract);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String updateAnimalContract(AnimalContract animalContract) {
		try {
			getAnimalContractService().updateAnimalContract(animalContract);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String deleteAnimal(AnimalContract animalContract) {
		try {
			getAnimalContractService().deleteAnimalContract(animalContract);
			animalContractList = null;
			getAnimalContractList();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public void onEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Edited");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		updateAnimalContract((AnimalContract) event.getObject());
	}

	public void onCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Cancelled");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public List<AnimalContract> getAnimalContractList() {
		if (animalContractList == null) {
			animalContractList = new ArrayList<AnimalContract>();
			animalContractList.addAll(getAnimalContractService()
					.getAnimalContracts());
		}
		return animalContractList;
	}

	public AnimalContractService getAnimalContractService() {
		return animalContractService;
	}

	public void setAnimalContractService(
			AnimalContractService AnimalContractService) {
		this.animalContractService = AnimalContractService;
	}

	public void setAnimalContractList(List<AnimalContract> animalContractList) {
		this.animalContractList = animalContractList;
	}

}
