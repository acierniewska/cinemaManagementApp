package pl.edu.wat.inz.primefaces.bean.managedBean;

import java.util.LinkedList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.TransferEvent;
import org.primefaces.model.DualListModel;

import pl.edu.wat.inz.hibernate.data.Feature;
import pl.edu.wat.inz.spring.service.AnimalFeatureService;
import pl.edu.wat.inz.spring.service.FeatureService;

@ManagedBean(name = "featurePickListMB")
@SessionScoped
public class FeaturePickListManegedBean {

	@ManagedProperty(value = "#{FeatureService}")
	private FeatureService fService;
	@ManagedProperty(value = "#{AnimalFeatureService}")
	private AnimalFeatureService afService;
	@ManagedProperty(value = "#{animalMB}")
	private AnimalManagedBean animalMB;
	private DualListModel<Feature> features;

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
		List<Feature> source = fService.getFeatures();
		List<Feature> target = new LinkedList<Feature>();
		if (animalMB.getSelectedAnimal() != null) {
			target = afService.getAnimalsFeaturesId(animalMB
					.getSelectedAnimal().getAnimalId());
		}

		source.removeAll(target);
		features = new DualListModel<Feature>(source, target);
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
