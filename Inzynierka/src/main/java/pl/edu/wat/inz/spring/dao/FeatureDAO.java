package pl.edu.wat.inz.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.edu.wat.inz.hibernate.data.Feature;

@Component
public class FeatureDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void register(Feature feature) {
		sessionFactory.getCurrentSession().save(feature);
	}

	public void deleteFeature(Feature feature) {
		sessionFactory.getCurrentSession().delete(feature);
	}

	public void updateFeature(Feature feature) {
		sessionFactory.getCurrentSession().update(feature);
	}

	public void addFeature(Feature feature) {
		sessionFactory.getCurrentSession().save(feature);
	}

	public Feature getFeatureById(int id) {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Feature where id=?").setParameter(0, id)
				.list();
		return (Feature) list.get(0);
	}

	public List<Feature> getFeatures() {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from Feature").list();
		return list;
	}
}
