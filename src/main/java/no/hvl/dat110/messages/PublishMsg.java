package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	private String topic;
	private String message;
	// message sent from client to create publish a message on a topic 

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "PublishMsg [topic=" + topic + ", message=" + message + ", getMessage()=" + getMessage() + ", getType()="
				+ getType() + ", getUser()=" + getUser() + ", toString()=" + super.toString()  + "]";
	}

	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.message=message;
		this.topic=topic;
	}

	
	public String getMessage() {
		
		throw new UnsupportedOperationException(TODO.method());
	}
}
