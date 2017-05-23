package kiddom;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the spot database table.
 * 
 */
@Entity
@NamedQuery(name="Spot.findAll", query="SELECT s FROM Spot s")
public class Spot implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpotPK id;

	private String address;

	private String area;

	private int number;

	@Lob
	private String photos;

	private String postcode;

	private float rating;

	private String town;

	//bi-directional many-to-one association to Provider
	@ManyToOne
	@JoinColumn(name="provider_id")
	private Provider provider;

	public Spot() {
	}

	public SpotPK getId() {
		return this.id;
	}

	public void setId(SpotPK id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getPhotos() {
		return this.photos;
	}

	public void setPhotos(String photos) {
		this.photos = photos;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public float getRating() {
		return this.rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getTown() {
		return this.town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public Provider getProvider() {
		return this.provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

}