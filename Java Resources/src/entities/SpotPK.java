package kiddom;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the spot database table.
 * 
 */
@Embeddable
public class SpotPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="spot_id")
	private int spotId;

	@Column(name="provider_id", insertable=false, updatable=false)
	private int providerId;

	@Column(name="daily_event_id")
	private int dailyEventId;

	public SpotPK() {
	}
	public int getSpotId() {
		return this.spotId;
	}
	public void setSpotId(int spotId) {
		this.spotId = spotId;
	}
	public int getProviderId() {
		return this.providerId;
	}
	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}
	public int getDailyEventId() {
		return this.dailyEventId;
	}
	public void setDailyEventId(int dailyEventId) {
		this.dailyEventId = dailyEventId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpotPK)) {
			return false;
		}
		SpotPK castOther = (SpotPK)other;
		return 
			(this.spotId == castOther.spotId)
			&& (this.providerId == castOther.providerId)
			&& (this.dailyEventId == castOther.dailyEventId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.spotId;
		hash = hash * prime + this.providerId;
		hash = hash * prime + this.dailyEventId;
		
		return hash;
	}
}