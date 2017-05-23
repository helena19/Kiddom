package kiddom;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the parent_reports database table.
 * 
 */
@Entity
@Table(name="parent_reports")
@NamedQuery(name="ParentReport.findAll", query="SELECT p FROM ParentReport p")
public class ParentReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ParentReportPK id;

	private int provider;

	@Lob
	private String report;

	//bi-directional many-to-one association to Parent
	@ManyToOne
	@JoinColumn(name="parent")
	private Parent parentBean;

	public ParentReport() {
	}

	public ParentReportPK getId() {
		return this.id;
	}

	public void setId(ParentReportPK id) {
		this.id = id;
	}

	public int getProvider() {
		return this.provider;
	}

	public void setProvider(int provider) {
		this.provider = provider;
	}

	public String getReport() {
		return this.report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public Parent getParentBean() {
		return this.parentBean;
	}

	public void setParentBean(Parent parentBean) {
		this.parentBean = parentBean;
	}

}