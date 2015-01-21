package pl.edu.wat.inz.primefaces.bean.managedBean;

import static pl.edu.wat.inz.basic.AppConst.ERROR;
import static pl.edu.wat.inz.basic.AppConst.SUCCESS;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import org.springframework.dao.DataAccessException;

import pl.edu.wat.inz.hibernate.data.FinancialSupport;
import pl.edu.wat.inz.hibernate.data.Person;
import pl.edu.wat.inz.spring.service.FinancialSupportService;

@ManagedBean(name = "financialSupportMB")
@ApplicationScoped
public class FinancialSupportManagedBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{FinancialSupportService}")
	private FinancialSupportService financialSupportService;

	private String path;
	private List<FinancialSupport> toExportList = new ArrayList<FinancialSupport>();
	private List<FinancialSupport> financialSupportList;
	private FinancialSupport selectedFinancialSupport = new FinancialSupport();

	public List<FinancialSupport> getFinancialSupportList() {
		if (financialSupportList == null) {
			financialSupportList = new ArrayList<FinancialSupport>();
			financialSupportList.addAll(getFinancialSupportService()
					.getFinancialSupports());
		}
		return financialSupportList;
	}

	public String export() {
		try {
			toExportList.addAll(getFinancialSupportService()
					.getNotExportedFinancialSupports());

			try {
				File file = new File(path + "/wyciag"
						+ new SimpleDateFormat("yyyyMMdd").format(new Date())
						+ ".txt");
				BufferedWriter output = new BufferedWriter(new FileWriter(file));
				output.write(prepareFinancialSupport());
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			addMessage("Wyeksportowano " + toExportList.size() + " przelewów.");

			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String prepareFinancialSupport() {
		StringBuilder sb = new StringBuilder();
		for (FinancialSupport f : toExportList) {
			sb.append(getExtractForFinancialSupport(f));

			f.setIsExported(true);
			getFinancialSupportService().updateFinancialSupport(f);
		}

		return sb.toString();
	}

	public String getExtractForFinancialSupport(FinancialSupport fs) {

		String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
		Person person = fs.getApplication().getPerson();
		String personBankNr = person.getAccountNr();
		String personNameSurnameAdres = person.getPersonName() + " "
				+ person.getSurname() + "|" + person.getStreet() + " "
				+ String.valueOf(person.getHouseNr()) + "/"
				+ String.valueOf(person.getApartmentNr()) + "|"
				+ person.getZipCode() + " " + person.getCity();
		String title = "";

		String txt = "110,"
				+ date
				+ ",10000,AAAAAAAA,0,\"CCAAAAAAAABBBBBBBBBBBBBBB\",\""
				+ personBankNr
				+ "\","
				+ " \"Fundacja Kociarnia|ul. Pos³añców Kotów 15|123456 Warszawa\",\""
				+ personNameSurnameAdres + "\",0,"
				+ personBankNr.substring(2, 10) + ",\"" + title
				+ "\",\"\",\"\",\"51\",\"REF:Referencje\"\r\n";
		return txt;

	}

	public FinancialSupport getSelectedFinancialSupport() {
		return selectedFinancialSupport;
	}

	public void setSelectedFinancialSupport(
			FinancialSupport selectedFinancialSupport) {
		this.selectedFinancialSupport = selectedFinancialSupport;
	}

	public void onUserRowUnselect(UnselectEvent event) {
		setSelectedFinancialSupport(null);
	}

	public void onCompRowSelect(SelectEvent event) {
		setSelectedFinancialSupport((FinancialSupport) event.getObject());
	}

	public String addFinancialSupport() {
		try {
			getFinancialSupportService().addFinancialSupport(
					selectedFinancialSupport);
			reset();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String updateFinancialSupport(FinancialSupport FinancialSupport) {
		try {
			getFinancialSupportService().updateFinancialSupport(
					FinancialSupport);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public String deleteFinancialSupport(FinancialSupport financialSupport) {
		try {
			getFinancialSupportService().deleteFinancialSupport(
					financialSupport);
			financialSupportList = null;
			getFinancialSupportList();
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return ERROR;
	}

	public void onEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Edited");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		updateFinancialSupport((FinancialSupport) event.getObject());
	}

	public void onCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Item Cancelled");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void reset() {
		this.selectedFinancialSupport = new FinancialSupport();
	}

	public List<FinancialSupport> getFinancialSupportListForAnimal(long animalId) {
		financialSupportList = new ArrayList<FinancialSupport>();
		financialSupportList.addAll(getFinancialSupportService()
				.getFinancialSupportsForAnimal(animalId));
		return financialSupportList;
	}

	public FinancialSupportService getFinancialSupportService() {
		return financialSupportService;
	}

	public void setFinancialSupportService(
			FinancialSupportService FinancialSupportService) {
		this.financialSupportService = FinancialSupportService;
	}

	public void setFinancialSupportList(
			List<FinancialSupport> FinancialSupportList) {
		this.financialSupportList = FinancialSupportList;
	}

	public void addMessage(String summary) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				summary, null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<FinancialSupport> getToExportList() {
		return toExportList;
	}

	public void setToExportList(List<FinancialSupport> toExportList) {
		this.toExportList = toExportList;
	}

}