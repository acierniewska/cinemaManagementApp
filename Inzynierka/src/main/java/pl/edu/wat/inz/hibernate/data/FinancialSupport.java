package pl.edu.wat.inz.hibernate.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "financial_support")
public class FinancialSupport {
	@Column(name = "FINANCIAL_SUPPORT_ID", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long financialSupportId;

	@ManyToOne(targetEntity = Animal.class)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "ANIMAL_ID", referencedColumnName = "ANIMAL_ID") })
	private Animal animal;

	@ManyToOne(targetEntity = Application.class)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "APPLICATION_ID", referencedColumnName = "APPLICATION_ID") })
	private Application application;

	@Column(name = "AMOUNT", nullable = false)
	private float amount;

	@Column(name = "ACCOUNT_NR", nullable = false)
	private String accountNr;

	@Column(name = "TITLE", nullable = false)
	private String title;

	@Column(name = "IS_EXPORTED", nullable = true)
	private Boolean isExported;

	public long getFinancialSupportId() {
		return financialSupportId;
	}

	public void setFinancialSupportId(long financialSupportId) {
		this.financialSupportId = financialSupportId;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Boolean getIsExported() {
		return isExported;
	}

	public void setIsExported(Boolean isExported) {
		this.isExported = isExported;
	}

	public String getAccountNr() {
		return accountNr;
	}

	public void setAccountNr(String accountNr) {
		this.accountNr = accountNr;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
