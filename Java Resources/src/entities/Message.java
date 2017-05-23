package kiddom;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the message database table.
 * 
 */
@Entity
@NamedQuery(name="Message.findAll", query="SELECT m FROM Message m")
public class Message implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MessagePK id;

	@Lob
	private String message;

	//bi-directional many-to-one association to Parent
	@ManyToOne
	@JoinColumn(name="parent")
	private Parent parentBean;

	//bi-directional many-to-one association to Provider
	@ManyToOne
	@JoinColumn(name="provider")
	private Provider providerBean;

	public Message() {
	}

	public MessagePK getId() {
		return this.id;
	}

	public void setId(MessagePK id) {
		this.id = id;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Parent getParentBean() {
		return this.parentBean;
	}

	public void setParentBean(Parent parentBean) {
		this.parentBean = parentBean;
	}

	public Provider getProviderBean() {
		return this.providerBean;
	}

	public void setProviderBean(Provider providerBean) {
		this.providerBean = providerBean;
	}

}