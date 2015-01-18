package pl.edu.wat.inz.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import pl.edu.wat.inz.hibernate.data.Application;
import pl.edu.wat.inz.hibernate.data.FinancialSupport;
import pl.edu.wat.inz.hibernate.data.Person;
import pl.edu.wat.inz.primefaces.bean.managedBean.FinancialSupportManagedBean;

public class FinancialSupportTest {
	FinancialSupportManagedBean fsMB = new FinancialSupportManagedBean();

	@Test
	public void test() {
		// String testFileTxt = getTxtFromFile("example.txt");
		FinancialSupport fs = createFinancialSupport();
		fsMB.setSelectedFinancialSupport(fs);

		Assert.assertEquals("meh", fsMB.prepareFinancialSupport());

	}

	private FinancialSupport createFinancialSupport() {
		Person person = new Person();
		person.setPersonName("Nazwa");
		person.setSurname("beneficjenta");
		person.setAdress("Adres beneficjenta wiersz pierwszy|Adres beneficjenta wiersz drugi");
		person.setAccountNr("CCAAAAAAAABBBBBBBBBBBBBBBB");

		Application app = new Application();
		app.setPerson(person);

		FinancialSupport fs = new FinancialSupport();
		fs.setAmount(10000.0f);
		fs.setTitle("Pole tytu쿮m wiersz pierwszy|Pole tytu쿮m wiersz drugi|Pole tytu쿮m wiersz trzeci|Pole tytu쿮m wiersz czwarty");
		fs.setApplication(app);

		return fs;
	}

	private String getTxtFromFile(String path) {
		try (BufferedReader br = new BufferedReader(new FileReader(
				"example.txt"))) {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			return sb.toString();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
