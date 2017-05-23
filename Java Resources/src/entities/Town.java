package kiddom;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the towns database table.
 * 
 */
@Entity
@Table(name="towns")
@NamedQuery(name="Town.findAll", query="SELECT t FROM Town t")
public class Town implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="town_id")
	private int townId;

	private String name;

	//bi-directional many-to-one association to Area
	@OneToMany(mappedBy="town", cascade={CascadeType.PERSIST, CascadeType.MERGE})
	private List<Area> areas;

	public Town() {
	}

	public int getTownId() {
		return this.townId;
	}

	public void setTownId(int townId) {
		this.townId = townId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Area> getAreas() {
		return this.areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	public Area addArea(Area area) {
		getAreas().add(area);
		area.setTown(this);

		return area;
	}

	public Area removeArea(Area area) {
		getAreas().remove(area);
		area.setTown(null);

		return area;
	}

}