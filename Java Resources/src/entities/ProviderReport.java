package kiddom;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the provider_reports database table.
 * 
 */
@Entity
@Table(name="provider_reports")
@NamedQuery(name="ProviderReport.findAll", query="SELECT p FROM ProviderReport p")
public class ProviderReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProviderReportPK id;

	@Lob
	private String report;

	@Column(name="user_id")
	private int userId;

	//bi-directional many-to-one association to Provider
	@ManyToOne
	@JoinColumn(name="provider")
	private Provider providerBean;

	public ProviderReport() {
	}

	public ProviderReportPK getId() {
		return this.id;
	}

	public void setId(ProviderReportPK id) {
		this.id = id;
	}

	public String getReport() {
		return this.report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Provider getProviderBean() {
		return this.providerBean;
	}

	public void setProviderBean(Provider providerBean) {
		this.providerBean = providerBean;
	}

}