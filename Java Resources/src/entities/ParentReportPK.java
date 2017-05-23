package kiddom;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the parent_reports database table.
 * 
 */
@Embeddable
public class ParentReportPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="report_id")
	private int reportId;

	@Column(insertable=false, updatable=false)
	private int parent;

	public ParentReportPK() {
	}
	public int getReportId() {
		return this.reportId;
	}
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	public int getParent() {
		return this.parent;
	}
	public void setParent(int parent) {
		this.parent = parent;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ParentReportPK)) {
			return false;
		}
		ParentReportPK castOther = (ParentReportPK)other;
		return 
			(this.reportId == castOther.reportId)
			&& (this.parent == castOther.parent);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.reportId;
		hash = hash * prime + this.parent;
		
		return hash;
	}
}