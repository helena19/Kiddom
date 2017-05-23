package kiddom;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the subcategories database table.
 * 
 */
@Entity
@Table(name="subcategories")
@NamedQuery(name="Subcategory.findAll", query="SELECT s FROM Subcategory s")
public class Subcategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SubcategoryPK id;

	private String name;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="cat_id")
	private Category category;

	public Subcategory() {
	}

	public SubcategoryPK getId() {
		return this.id;
	}

	public void setId(SubcategoryPK id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}