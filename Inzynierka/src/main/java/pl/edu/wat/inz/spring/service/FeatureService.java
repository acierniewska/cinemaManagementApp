package pl.edu.wat.inz.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.edu.wat.inz.hibernate.data.Feature;
import pl.edu.wat.inz.spring.dao.FeatureDAO;

@Service("FeatureService")
@Transactional(readOnly = true)
public class FeatureService {

	@Autowired
	FeatureDAO featureDAO;

	@Transactional(readOnly = false)
	public void addFeature(Feature feature) {
		getFeatureDAO().addFeature(feature);
	}

	@Transactional(readOnly = false)
	public void deleteFeature(Feature feature) {
		getFeatureDAO().deleteFeature(feature);
	}

	@Transactional(readOnly = false)
	public void updateFeature(Feature feature) {
		getFeatureDAO().updateFeature(feature);
	}

	public Feature getFeatureById(int id) {
		return getFeatureDAO().getFeatureById(id);
	}

	public List<Feature> getFeatures() {
		return getFeatureDAO().getFeatures();
	}

	public FeatureDAO getFeatureDAO() {
		return featureDAO;
	}

	public void setFeatureDAO(FeatureDAO featureDAO) {
		this.featureDAO = featureDAO;
	}
}
