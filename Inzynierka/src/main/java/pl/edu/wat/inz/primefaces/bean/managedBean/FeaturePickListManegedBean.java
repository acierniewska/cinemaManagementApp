package pl.edu.wat.inz.primefaces.bean.managedBean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.TransferEvent;
import org.primefaces.model.DualListModel;

import pl.edu.wat.inz.hibernate.data.Feature;
import pl.edu.wat.inz.spring.service.AnimalFeatureService;
import pl.edu.wat.inz.spring.service.FeatureService;

@ManagedBean(name = "featurePickListMB")
@ViewScoped
public class FeaturePickListManegedBean {

	@ManagedProperty("#{FeatureService}")
	private FeatureService fService;
	@ManagedProperty("#{AnimalFeatureService}")
	private AnimalFeatureService afService;
	@ManagedProperty("#{animalMB}")
	private AnimalManagedBean animalMB;
	private DualListModel<Feature> features;

	@PostConstruct
	public void init() {
		List<Feature> source = fService.getFeatures();
		List<Feature> target = afService.getAnimalsFeaturesId(animalMB
				.getSelectedAnimal().getAnimalId());
		System.out.println(animalMB.getSelectedAnimal().getAnimalId());
		source.removeAll(target);
		features = new DualListModel<Feature>(source, target);
	}

	public DualListModel<Feature> getCities() {
		return features;
	}

	public void onTransfer(TransferEvent event) {

	}

	public AnimalFeatureService getAfService() {
		return afService;
	}

	public void setAfService(AnimalFeatureService afService) {
		this.afService = afService;
	}

	public DualListModel<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(DualListModel<Feature> features) {
		this.features = features;
	}

	public FeatureService getfService() {
		return fService;
	}

	public void setfService(FeatureService fService) {
		this.fService = fService;
	}

	public AnimalManagedBean getAnimalMB() {
		return animalMB;
	}

	public void setAnimalMB(AnimalManagedBean animalMB) {
		this.animalMB = animalMB;
	}

}
