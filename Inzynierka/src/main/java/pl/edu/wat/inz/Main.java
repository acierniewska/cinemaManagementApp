package pl.edu.wat.inz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import pl.edu.wat.inz.hibernate.data.Cat;

public class Main {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();

		Session session = null;
		try {
			session = factory.getCurrentSession();
		} catch (org.hibernate.HibernateException he) {
			session = factory.openSession();
		}
		session.getTransaction().begin();

		Cat cat = new Cat();
		cat.setName("Danjeleq");
		session.save(cat);

		session.getTransaction().commit();
	}
}
