package kiddom;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the slot database table.
 * 
 */
@Entity
@NamedQuery(name="Slot.findAll", query="SELECT s FROM Slot s")
public class Slot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="slot_id")
	private int slotId;

	private int availability;

	private int capacity;

	private String category;

	private int day;

	private int month;

	private int price;

	@Column(name="start_hour")
	private int startHour;

	@Column(name="start_minute")
	private int startMinute;

	private int year;

	public Slot() {
	}

	public int getSlotId() {
		return this.slotId;
	}

	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}

	public int getAvailability() {
		return this.availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStartHour() {
		return this.startHour;
	}

	public void setStartHour(int startHour) {
		this.startHour = startHour;
	}

	public int getStartMinute() {
		return this.startMinute;
	}

	public void setStartMinute(int startMinute) {
		this.startMinute = startMinute;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}