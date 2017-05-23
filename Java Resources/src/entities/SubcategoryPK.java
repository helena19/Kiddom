package kiddom;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the subcategories database table.
 * 
 */
@Embeddable
public class SubcategoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="sub_id")
	private int subId;

	@Column(name="cat_id", insertable=false, updatable=false)
	private int catId;

	public SubcategoryPK() {
	}
	public int getSubId() {
		return this.subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public int getCatId() {
		return this.catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SubcategoryPK)) {
			return false;
		}
		SubcategoryPK castOther = (SubcategoryPK)other;
		return 
			(this.subId == castOther.subId)
			&& (this.catId == castOther.catId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.subId;
		hash = hash * prime + this.catId;
		
		return hash;
	}
}