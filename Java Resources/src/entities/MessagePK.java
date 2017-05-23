package kiddom;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the message database table.
 * 
 */
@Embeddable
public class MessagePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="message_id")
	private int messageId;

	@Column(insertable=false, updatable=false)
	private int provider;

	@Column(insertable=false, updatable=false)
	private int parent;

	public MessagePK() {
	}
	public int getMessageId() {
		return this.messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public int getProvider() {
		return this.provider;
	}
	public void setProvider(int provider) {
		this.provider = provider;
	}
	public int getParent() {
		return this.parent;
	}
	public void setParent(int parent) {
		this.parent = parent;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MessagePK)) {
			return false;
		}
		MessagePK castOther = (MessagePK)other;
		return 
			(this.messageId == castOther.messageId)
			&& (this.provider == castOther.provider)
			&& (this.parent == castOther.parent);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.messageId;
		hash = hash * prime + this.provider;
		hash = hash * prime + this.parent;
		
		return hash;
	}
}