package kiddom;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the provider database table.
 * 
 */
@Entity
@NamedQuery(name="Provider.findAll", query="SELECT p FROM Provider p")
public class Provider implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="provider_id")
	private int providerId;

	private String email;

	@Column(name="gotten_points")
	private int gottenPoints;

	private String name;

	@Column(name="owed_points")
	private int owedPoints;

	private String surname;

	private String telephone;

	@Column(name="total_points")
	private int totalPoints;

	private String tr;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="providerBean", cascade={CascadeType.PERSIST, CascadeType.MERGE})
	private List<Message> messages;

	//bi-directional one-to-one association to User
	@OneToOne
	@JoinColumn(name="provider_id")
	private User user;

	//bi-directional many-to-one association to ProviderReport
	@OneToMany(mappedBy="providerBean", cascade={CascadeType.PERSIST, CascadeType.MERGE})
	private List<ProviderReport> providerReports;

	//bi-directional many-to-one association to Spot
	@OneToMany(mappedBy="provider", cascade={CascadeType.PERSIST, CascadeType.MERGE})
	private List<Spot> spots;

	public Provider() {
	}

	public int getProviderId() {
		return this.providerId;
	}

	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGottenPoints() {
		return this.gottenPoints;
	}

	public void setGottenPoints(int gottenPoints) {
		this.gottenPoints = gottenPoints;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOwedPoints() {
		return this.owedPoints;
	}

	public void setOwedPoints(int owedPoints) {
		this.owedPoints = owedPoints;
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

	public String getTr() {
		return this.tr;
	}

	public void setTr(String tr) {
		this.tr = tr;
	}

	public List<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public Message addMessage(Message message) {
		getMessages().add(message);
		message.setProviderBean(this);

		return message;
	}

	public Message removeMessage(Message message) {
		getMessages().remove(message);
		message.setProviderBean(null);

		return message;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<ProviderReport> getProviderReports() {
		return this.providerReports;
	}

	public void setProviderReports(List<ProviderReport> providerReports) {
		this.providerReports = providerReports;
	}

	public ProviderReport addProviderReport(ProviderReport providerReport) {
		getProviderReports().add(providerReport);
		providerReport.setProviderBean(this);

		return providerReport;
	}

	public ProviderReport removeProviderReport(ProviderReport providerReport) {
		getProviderReports().remove(providerReport);
		providerReport.setProviderBean(null);

		return providerReport;
	}

	public List<Spot> getSpots() {
		return this.spots;
	}

	public void setSpots(List<Spot> spots) {
		this.spots = spots;
	}

	public Spot addSpot(Spot spot) {
		getSpots().add(spot);
		spot.setProvider(this);

		return spot;
	}

	public Spot removeSpot(Spot spot) {
		getSpots().remove(spot);
		spot.setProvider(null);

		return spot;
	}

}