package pl.edu.wat.inz.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.edu.wat.inz.hibernate.data.VetVisit;

@Component
public class VetVisitDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void register(VetVisit vetVisit) {
		sessionFactory.getCurrentSession().save(vetVisit);
	}

	public void deleteVetVisit(VetVisit vetVisit) {
		sessionFactory.getCurrentSession().delete(vetVisit);
	}

	public void updateVetVisit(VetVisit vetVisit) {
		sessionFactory.getCurrentSession().update(vetVisit);
	}

	public void addVetVisit(VetVisit vetVisit) {
		sessionFactory.getCurrentSession().save(vetVisit);
	}

	public VetVisit getVetVisitById(int id) {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from VetVisit where id=?").setParameter(0, id)
				.list();
		return (VetVisit) list.get(0);
	}

	public List<VetVisit> getVetVisits() {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from VetVisit").list();
		return list;
	}

	public List<VetVisit> getVetVisitForAnimal(long animalId) {
		List list = getSessionFactory()
				.getCurrentSession()
				.createQuery(
						"select v from VetVisit v join v.animal a where a.animalId =:aId")
				.setParameter("aId", animalId).list();
		return list;
	}

}
