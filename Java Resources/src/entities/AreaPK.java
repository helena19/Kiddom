package kiddom;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the areas database table.
 * 
 */
@Embeddable
public class AreaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="area_id")
	private int areaId;

	@Column(name="town_id", insertable=false, updatable=false)
	private int townId;

	public AreaPK() {
	}
	public int getAreaId() {
		return this.areaId;
	}
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	public int getTownId() {
		return this.townId;
	}
	public void setTownId(int townId) {
		this.townId = townId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AreaPK)) {
			return false;
		}
		AreaPK castOther = (AreaPK)other;
		return 
			(this.areaId == castOther.areaId)
			&& (this.townId == castOther.townId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.areaId;
		hash = hash * prime + this.townId;
		
		return hash;
	}
}