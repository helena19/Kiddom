package kiddom;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the provider_reports database table.
 * 
 */
@Embeddable
public class ProviderReportPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="report_id")
	private int reportId;

	@Column(insertable=false, updatable=false)
	private int provider;

	public ProviderReportPK() {
	}
	public int getReportId() {
		return this.reportId;
	}
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	public int getProvider() {
		return this.provider;
	}
	public void setProvider(int provider) {
		this.provider = provider;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProviderReportPK)) {
			return false;
		}
		ProviderReportPK castOther = (ProviderReportPK)other;
		return 
			(this.reportId == castOther.reportId)
			&& (this.provider == castOther.provider);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.reportId;
		hash = hash * prime + this.provider;
		
		return hash;
	}
}