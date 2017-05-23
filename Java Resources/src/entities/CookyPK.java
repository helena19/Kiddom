package kiddom;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the cookies database table.
 * 
 */
@Embeddable
public class CookyPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="cookie_id")
	private int cookieId;

	@Column(name="parent_id", insertable=false, updatable=false)
	private int parentId;

	public CookyPK() {
	}
	public int getCookieId() {
		return this.cookieId;
	}
	public void setCookieId(int cookieId) {
		this.cookieId = cookieId;
	}
	public int getParentId() {
		return this.parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CookyPK)) {
			return false;
		}
		CookyPK castOther = (CookyPK)other;
		return 
			(this.cookieId == castOther.cookieId)
			&& (this.parentId == castOther.parentId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cookieId;
		hash = hash * prime + this.parentId;
		
		return hash;
	}
}