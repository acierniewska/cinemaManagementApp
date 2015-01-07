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

import pl.edu.wat.inz.hibernate.data.AnimalRepo;
import pl.edu.wat.inz.spring.service.AnimalRepoService;

@ManagedBean(name = "animalRepoMB")
@ViewScoped
public class AnimalRepoManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private AnimalRepo selectedAnimalRepo = new AnimalRepo();

	@ManagedProperty(value = "#{AnimalRepoService}")
	private AnimalRepoService animalRepoService;

	List<AnimalRepo> animalRepoList;
	private int id;
	private String name;

	public AnimalRepo getSelectedAnimalRepo() {
		return selectedAnimalRepo;
	}

	public void setSelectedAnimalRepo(AnimalRepo selectedAnimalRepo) {
		this.selectedAnimalRepo = selectedAnimalRepo;
	}

	public void onUserRowUnselect(UnselectEvent event) {
		setSelectedAnimalRepo(null);
	}

	public void onCompRowSelect(SelectEvent event) {
		setSelectedAnimalRepo((AnimalRepo) event.getObject());
	}

	public String addAnimalRepo() {
		try {
			AnimalRepo AnimalRepo = new AnimalRepo();
			AnimalRepo.setAnimalRepoName(getName());
			getAnimalRepoService().addAnimalRepo(AnimalRepo);
			reset();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String updateAnimalRepo(AnimalRepo AnimalRepo) {
		try {
			getAnimalRepoService().updateAnimalRepo(AnimalRepo);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String deleteAnimalRepo(AnimalRepo animalRepo) {
		try {
			getAnimalRepoService().deleteAnimalRepo(animalRepo);
			animalRepoList = null;
			getAnimalRepoList();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public void onEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Edited");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		updateAnimalRepo((AnimalRepo) event.getObject());
	}

	public void onCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Cancelled");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void reset() {
		this.setId(0);
		this.setName("");
	}

	public List<AnimalRepo> getAnimalRepoList() {
		if (animalRepoList == null) {
			animalRepoList = new ArrayList<AnimalRepo>();
			animalRepoList.addAll(getAnimalRepoService().getAnimalRepos());
		}
		return animalRepoList;
	}

	public AnimalRepoService getAnimalRepoService() {
		return animalRepoService;
	}

	public void setAnimalRepoService(AnimalRepoService AnimalRepoService) {
		this.animalRepoService = AnimalRepoService;
	}

	public void setAnimalRepoList(List<AnimalRepo> AnimalRepoList) {
		this.animalRepoList = AnimalRepoList;
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