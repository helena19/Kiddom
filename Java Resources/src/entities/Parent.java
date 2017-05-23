package kiddom;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the parent database table.
 * 
 */
@Entity
@NamedQuery(name="Parent.findAll", query="SELECT p FROM Parent p")
public class Parent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_id")
	private int userId;

	private String area;

	@Column(name="avail_points")
	private int availPoints;

	private String email;

	private String name;

	@Lob
	private String photo;

	@Column(name="restr_points")
	private int restrPoints;

	private String surname;

	private String telephone;

	@Column(name="total_points")
	private int totalPoints;

	private String town;

	//bi-directional many-to-one association to Cooky
	@OneToMany(mappedBy="parent", cascade={CascadeType.PERSIST, CascadeType.MERGE})
	private List<Cooky> cookies;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="parentBean", cascade={CascadeType.PERSIST, CascadeType.MERGE})
	private List<Message> messages;

	//bi-directional one-to-one association to User
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;

	//bi-directional many-to-one association to ParentReport
	@OneToMany(mappedBy="parentBean", cascade={CascadeType.PERSIST, CascadeType.MERGE})
	private List<ParentReport> parentReports;

	public Parent() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getAvailPoints() {
		return this.availPoints;
	}

	public void setAvailPoints(int availPoints) {
		this.availPoints = availPoints;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getRestrPoints() {
		return this.restrPoints;
	}

	public void setRestrPoints(int restrPoints) {
		this.restrPoints = restrPoints;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getTotalPoints() {
		return this.totalPoints;
	}

	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}

	public String getTown() {
		return this.town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public List<Cooky> getCookies() {
		return this.cookies;
	}

	public void setCookies(List<Cooky> cookies) {
		this.cookies = cookies;
	}

	public Cooky addCooky(Cooky cooky) {
		getCookies().add(cooky);
		cooky.setParent(this);

		return cooky;
	}

	public Cooky removeCooky(Cooky cooky) {
		getCookies().remove(cooky);
		cooky.setParent(null);

		return cooky;
	}

	public List<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public Message addMessage(Message message) {
		getMessages().add(message);
		message.setParentBean(this);

		return message;
	}

	public Message removeMessage(Message message) {
		getMessages().remove(message);
		message.setParentBean(null);

		return message;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<ParentReport> getParentReports() {
		return this.parentReports;
	}

	public void setParentReports(List<ParentReport> parentReports) {
		this.parentReports = parentReports;
	}

	public ParentReport addParentReport(ParentReport parentReport) {
		getParentReports().add(parentReport);
		parentReport.setParentBean(this);

		return parentReport;
	}

	public ParentReport removeParentReport(ParentReport parentReport) {
		getParentReports().remove(parentReport);
		parentReport.setParentBean(null);

		return parentReport;
	}

}