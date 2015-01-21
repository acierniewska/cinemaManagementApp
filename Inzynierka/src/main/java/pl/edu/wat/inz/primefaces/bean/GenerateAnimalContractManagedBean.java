package pl.edu.wat.inz.primefaces.bean;

import static pl.edu.wat.inz.basic.AppConst.ERROR;
import static pl.edu.wat.inz.basic.AppConst.SUCCESS;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.springframework.dao.DataAccessException;

import pl.edu.wat.inz.basic.enums.FurColour;
import pl.edu.wat.inz.basic.enums.FurLength;
import pl.edu.wat.inz.hibernate.data.AnimalContract;
import pl.edu.wat.inz.hibernate.data.Person;
import pl.edu.wat.inz.spring.service.AnimalContractService;
import pl.edu.wat.inz.spring.service.UserService;

@ManagedBean(name = "generateAnimalContractMB")
@SessionScoped
public class GenerateAnimalContractManagedBean implements Serializable {
	private static final long serialVersionUID = 1L;
	@ManagedProperty(value = "#{AnimalContractService}")
	private AnimalContractService animalContractService;

	@ManagedProperty(value = "#{loginMgmtBean}")
	private LoginBean loginBean;

	@ManagedProperty(value = "#{UserService}")
	private UserService userService;

	private Person userPerson;

	private String path = "E:/WAT/_in¿/git/Inzynierka/src/main/resources/doc/";
	private AnimalContract contract = new AnimalContract();

	@PostConstruct
	public void init() {
		String login = loginBean.getUserName();
		userPerson = userService.getUser(login).getPerson();
	}

	public String addAnimalContract() {
		try {
			contract.setContractDate(new Date());
			contract.setContractNr(String.valueOf(contract
					.getAnimalContractId()) + "/2015");
			getAnimalContractService().addAnimalContract(contract);

			contract.setContractNr(String.valueOf(contract
					.getAnimalContractId()) + "/2015");
			getAnimalContractService().updateAnimalContract(contract);

			generateAnimalContract();
			addMessage("Wygenerowano umowê. Lokalizacja pliku: " + path);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public void generateAnimalContract() {
		XWPFDocument doc = null;
		try {
			doc = new XWPFDocument(getClass().getResourceAsStream(
					"/doc/template.docx"));

			XWPFParagraph paragraph = doc.createParagraph();
			paragraph.setAlignment(ParagraphAlignment.RIGHT);
			XWPFRun run = paragraph.createRun();
			DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
			run.setText("Warszawa, "
					+ dateFormat.format(contract.getContractDate()));

			paragraph = doc.createParagraph();
			paragraph = doc.createParagraph();
			paragraph.setAlignment(ParagraphAlignment.CENTER);
			run = paragraph.createRun();
			run.setBold(true);
			run.setUnderline(UnderlinePatterns.SINGLE);
			run.setText("UMOWA ADOPCYJNA nr " + contract.getContractNr());

			paragraph = doc.createParagraph();

			XWPFTable table = doc.createTable();
			XWPFTableRow tableRowOne = table.getRow(0);
			tableRowOne.getCell(0).setText("");
			tableRowOne.addNewTableCell().setText("Osoba adoptuj¹ca");
			tableRowOne.addNewTableCell().setText("Przedstawiciel Fundacji");
			XWPFTableRow tableRowTwo = table.createRow();
			tableRowTwo.getCell(0).setText("Imiê i nazwisko");
			tableRowTwo.getCell(1).setText(
					contract.getPerson().getPersonName() + " "
							+ contract.getPerson().getSurname());
			tableRowTwo.getCell(2).setText(
					userPerson.getPersonName() + " " + userPerson.getSurname());
			XWPFTableRow tableRowThree = table.createRow();
			tableRowThree.getCell(0).setText("Adres");
			tableRowThree.getCell(1).setText(contract.getPerson().getAdress());
			tableRowThree.getCell(2).setText(userPerson.getAdress());
			XWPFTableRow tableRowFour = table.createRow();
			tableRowFour.getCell(0).setText("Numer dowodu");
			tableRowFour.getCell(1).setText(contract.getPerson().getIdCardNr());
			tableRowFour.getCell(2).setText(userPerson.getIdCardNr());
			XWPFTableRow tableRowFive = table.createRow();
			tableRowFive.getCell(0).setText("Numer dowodu");
			tableRowFive.getCell(1).setText(
					contract.getPerson().getPersonalIdNr().toString());
			tableRowFive.getCell(2).setText(
					userPerson.getPersonalIdNr().toString());

			paragraph = doc.createParagraph();
			paragraph = doc.createParagraph();
			run = paragraph.createRun();
			run.setBold(true);
			run.setText("Dane zwierzêcia");
			paragraph = doc.createParagraph();
			run = paragraph.createRun();
			run.setText("Gatunek: "
					+ contract.getAnimal().getBreed().getSpecies()
							.getSpeciesName());
			paragraph = doc.createParagraph();
			run = paragraph.createRun();
			run.setText("Rasa: "
					+ contract.getAnimal().getBreed().getBreedName());
			paragraph = doc.createParagraph();
			run = paragraph.createRun();
			run.setText("Data urodzenia: "
					+ contract.getAnimal().getAnimalBirthdayDay());
			paragraph = doc.createParagraph();
			run = paragraph.createRun();
			run.setText("Umaszczenie: "
					+ FurColour.fromIntValue(contract.getAnimal().getFur()
							.getFurColour())
					+ ", "
					+ FurLength.fromIntValue(contract.getAnimal().getFur()
							.getFurLength()));
			paragraph = doc.createParagraph();
			run = paragraph.createRun();
			run.setText("Imie: " + contract.getAnimal().getAnimalName());
			paragraph = doc.createParagraph();
			run = paragraph.createRun();
			run.setText("Wysterylizowany: "
					+ (contract.getAnimal().getIsCastrated() ? "TAK" : "NIE"));
			paragraph = doc.createParagraph();
			run = paragraph.createRun();
			run.setText("Wymaga specjalnej opieki: "
					+ (contract.getAnimal().getIsHandicapte() ? "TAK" : "NIE"));
			paragraph = doc.createParagraph();

			paragraph = doc.createParagraph();
			run = paragraph.createRun();
			run.setBold(true);
			run.setText("Osoba adoptuj¹ca zabowi¹zuje siê:");
			paragraph = doc.createParagraph();
			run = paragraph.createRun();
			run.setText("1. Zapewniæ zwierzêciu odpowiednie wy¿ywienie, czyst¹ wodê i ciep³e schronienie,");
			paragraph = doc.createParagraph();
			run = paragraph.createRun();
			run.setText("2. Zapewniæ starann¹ opiekê weterynaryjn¹ w razie choroby, a tak¿e regularne szczepienia ochronne i odrobaczanie zgodnie z zaleceniami lekarza weterynarii,");
			paragraph = doc.createParagraph();
			run = paragraph.createRun();
			run.setText("3. Powiadomiæ Fundacjê w razie powa¿nej choroby, zaginiêcia lub œmierci zwierzêcia");
			paragraph = doc.createParagraph();
			run = paragraph.createRun();
			run.setText("4. Nie rozmno¿yæ powierzonego zwierzêcia, wysterylizowaæ je zaraz po osi¹gniêciu dojrza³oœci p³ciowej (nie dotyczy zwierz¹t oddawanych po sterylizacji)");
			paragraph = doc.createParagraph();
			run = paragraph.createRun();
			run.setText("5. Zabezpieczyæ okna i balkon tak, aby zwierzê nie uleg³o wypadkowi,");
			paragraph = doc.createParagraph();
			run = paragraph.createRun();
			run.setText("6. oddaæ zwierzê osobie upowa¿nionej przez Fundacjê w przypadku rezygnacji z posiadania go. Pod ¿adnym warunkiem Przyjmuj¹cemu nie wolno porzuciæ zwierzêcia, oddaæ lub odsprzedaæ do sklepów zoologicznych, schronisk dla zwierz¹t lub laboratoriów badawczych.");
			paragraph = doc.createParagraph();

			paragraph = doc.createParagraph();
			run = paragraph.createRun();
			run.setText("Fundacja „Kociarnia” zastrzega sobie prawo interesowania siê dalszymi losami zwierzêcia. Przyjmuj¹cy zwierzê zobowi¹zuje siê do okazania zwierzêcia w jego nowym miejscu zamieszkania osobie wskazanej przez Fundacjê w celu sprawdzenia stanu zwierzêcia i warunków, w jakich ¿yje.");
			paragraph = doc.createParagraph();
			run = paragraph.createRun();
			run.setText("W przypadku ra¿¹cego naruszenia któregoœ z punktów niniejszej umowy Fundacja „Kociarnia” ma prawo do natychmiastowego odebrania zwierzêcia od Przyjmuj¹cego.");
			paragraph = doc.createParagraph();
			run = paragraph.createRun();
			run.setText("Niniejsza Umowa nie jest umow¹ kupna-sprzeda¿y. Wszelkie zmiany i uzupe³nienia niniejszej Umowy wymagaj¹ formy pisemnej, pod rygorem niewa¿noœci.");
			paragraph = doc.createParagraph();
			run = paragraph.createRun();
			run.setText("Niniejsz¹ Umowê sporz¹dzono w dwóch jednobrzmi¹cych egzemplarzach, po jednym dla ka¿dej ze Stron.");

			paragraph = doc.createParagraph();
			paragraph = doc.createParagraph();
			paragraph.setAlignment(ParagraphAlignment.CENTER);
			run = paragraph.createRun();
			run.setText("Podpis osoby przyjmuj¹cej zwierzê:						Podpis przedstawiciela Fundacji:");

			path += contract.getContractDate() + "_umowaAdopcyjnaNr"
					+ contract.getContractNr() + ".docx";
			FileOutputStream out = new FileOutputStream(new File(path));
			doc.write(out);
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addMessage(String summary) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				summary, null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public AnimalContractService getAnimalContractService() {
		return animalContractService;
	}

	public void setAnimalContractService(
			AnimalContractService animalContractService) {
		this.animalContractService = animalContractService;
	}

	public AnimalContract getContract() {
		return contract;
	}

	public void setContract(AnimalContract contract) {
		this.contract = contract;
	}

	public LoginBean getLoginBean() {
		return loginBean;
	}

	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public Person getUserPerson() {
		return userPerson;
	}

	public void setUserPerson(Person userPerson) {
		this.userPerson = userPerson;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}