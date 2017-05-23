package kiddom;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the areas database table.
 * 
 */
@Entity
@Table(name="areas")
@NamedQuery(name="Area.findAll", query="SELECT a FROM Area a")
public class Area implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AreaPK id;

	private String name;

	//bi-directional many-to-one association to Town
	@ManyToOne
	@JoinColumn(name="town_id")
	private Town town;

	public Area() {
	}

	public AreaPK getId() {
		return this.id;
	}

	public void setId(AreaPK id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Town getTown() {
		return this.town;
	}

	public void setTown(Town town) {
		this.town = town;
	}

}