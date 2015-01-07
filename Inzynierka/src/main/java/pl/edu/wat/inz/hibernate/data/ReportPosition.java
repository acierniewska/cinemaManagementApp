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

import pl.edu.wat.inz.basic.enums.ReportPositionType;

@Entity
@Table(name = "report_position")
public class ReportPosition {
	@Column(name = "REPORT_POSITION_ID", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long reportPositionId;

	@ManyToOne(targetEntity = Report.class)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "REPORT_ID", referencedColumnName = "REPORT_ID", nullable = false) })
	private Report report;

	@Column(name = "REPORT_POSITION_TYPE", nullable = false, length = 11)
	private int reportPositionType;

	@Column(name = "STRING_VALUE", nullable = false)
	private String stringValue;

	@Column(name = "MONEY_VALUE", nullable = false)
	private float moneyValue;

	@Column(name = "ROW_NR", nullable = false, length = 11)
	private int rowNr;

	@Column(name = "BOOLEAN_VALUE", nullable = false)
	private boolean booleanValue;

	@Column(name = "COLUMN_NR", nullable = false, length = 11)
	private int columnNr;

	public long getReportPositionId() {
		return reportPositionId;
	}

	public void setReportPositionId(long reportPositionId) {
		this.reportPositionId = reportPositionId;
	}

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}

	public ReportPositionType getReportPositionTypeEnum() {
		return ReportPositionType.fromIntValue(reportPositionType);
	}

	public int getReportPositionType() {
		return reportPositionType;
	}

	public void setReportPositionType(int reportPositionType) {
		this.reportPositionType = reportPositionType;
	}

	public void setReportPositionType(ReportPositionType reportPositionType) {
		this.reportPositionType = reportPositionType.getIntValue();
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public float getMoneyValue() {
		return moneyValue;
	}

	public void setMoneyValue(float moneyValue) {
		this.moneyValue = moneyValue;
	}

	public int getRowNr() {
		return rowNr;
	}

	public void setRowNr(int rowNr) {
		this.rowNr = rowNr;
	}

	public boolean isBooleanValue() {
		return booleanValue;
	}

	public void setBooleanValue(boolean booleanValue) {
		this.booleanValue = booleanValue;
	}

	public int getColumnNr() {
		return columnNr;
	}

	public void setColumnNr(int columnNr) {
		this.columnNr = columnNr;
	}

}
