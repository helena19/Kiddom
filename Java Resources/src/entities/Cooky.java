package kiddom;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cookies database table.
 * 
 */
@Entity
@Table(name="cookies")
@NamedQuery(name="Cooky.findAll", query="SELECT c FROM Cooky c")
public class Cooky implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CookyPK id;

	private String category;

	private String price;

	private String subcat1;

	private String subcat2;

	private String subcat3;

	//bi-directional many-to-one association to Parent
	@ManyToOne
	@JoinColumn(name="parent_id")
	private Parent parent;

	public Cooky() {
	}

	public CookyPK getId() {
		return this.id;
	}

	public void setId(CookyPK id) {
		this.id = id;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSubcat1() {
		return this.subcat1;
	}

	public void setSubcat1(String subcat1) {
		this.subcat1 = subcat1;
	}

	public String getSubcat2() {
		return this.subcat2;
	}

	public void setSubcat2(String subcat2) {
		this.subcat2 = subcat2;
	}

	public String getSubcat3() {
		return this.subcat3;
	}

	public void setSubcat3(String subcat3) {
		this.subcat3 = subcat3;
	}

	public Parent getParent() {
		return this.parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

}