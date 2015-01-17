package pl.edu.wat.inz.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.edu.wat.inz.hibernate.data.FinancialSupport;

@Component
public class FinancialSupportDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void register(FinancialSupport financialSupport) {
		sessionFactory.getCurrentSession().save(financialSupport);
	}

	public void deleteFinancialSupport(FinancialSupport financialSupport) {
		sessionFactory.getCurrentSession().delete(financialSupport);
	}

	public void updateFinancialSupport(FinancialSupport financialSupport) {
		sessionFactory.getCurrentSession().update(financialSupport);
	}

	public void addFinancialSupport(FinancialSupport financialSupport) {
		sessionFactory.getCurrentSession().save(financialSupport);
	}

	public FinancialSupport getFinancialSupportById(int id) {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from FinancialSupport where id=?")
				.setParameter(0, id).list();
		return (FinancialSupport) list.get(0);
	}

	public List<FinancialSupport> getFinancialSupports() {
		List list = getSessionFactory().getCurrentSession()
				.createQuery("from FinancialSupport").list();
		return list;
	}

	public List<FinancialSupport> getFinancialSupportForAnimal(long animalId) {
		List list = getSessionFactory()
				.getCurrentSession()
				.createQuery(
						"select f from FinancialSupport f join f.animal a where a.animalId =:aId")
				.setParameter("aId", animalId).list();
		return list;
	}

}
