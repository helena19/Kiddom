package kiddom;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the spot_has_slot database table.
 * 
 */
@Entity
@Table(name="spot_has_slot")
@NamedQuery(name="SpotHasSlot.findAll", query="SELECT s FROM SpotHasSlot s")
public class SpotHasSlot implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpotHasSlotPK id;

	public SpotHasSlot() {
	}

	public SpotHasSlotPK getId() {
		return this.id;
	}

	public void setId(SpotHasSlotPK id) {
		this.id = id;
	}

}