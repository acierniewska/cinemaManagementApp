package pl.edu.wat.inz.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import pl.edu.wat.inz.hibernate.data.Breed;
import pl.edu.wat.inz.spring.dao.BreedDAO;
import pl.edu.wat.inz.spring.dao.SpeciesDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:WEB-INF/applicationContext.xml" })
@TransactionConfiguration(defaultRollback = true)
@Transactional
public class BreedTest {
	@Autowired
	private BreedDAO bDAO;

	@Test
	public void testFindById() {
		Breed b = bDAO.getBreedById(1L);
		Assert.assertEquals("europejski", b.getBreedName());
		Assert.assertEquals("Profesjonalna nazwa dachowców", b.getBreedDesc());
		Assert.assertEquals("kot", b.getSpecies().getSpeciesName());
	}

	private Breed createBreed() {
		Breed b = new Breed();
		// b.setBreedId(3);
		b.setBreedName("Rosyjski");
		b.setBreedDesc("Posiada d³ugie futro, zwykle niebieskie");
		b.setSpecies(new SpeciesDAO().getSpeciesById(1));

		return b;
	}

}
