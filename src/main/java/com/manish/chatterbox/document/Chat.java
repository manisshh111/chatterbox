package com.manish.chatterbox.document;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Document(collection = "chats")
public class Chat {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private String id;
	  
	  private  List<String> participants;
	  
	  private List<Message> messages;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<String> getParticipants() {
		return participants;
	}

	public void setParticipants(List<String> participants) {
		this.participants = participants;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public Chat(String id, List<String> participants, List<Message> messages) {
		super();
		this.id = id;
		this.participants = participants;
		this.messages = messages;
	}

	public Chat() {
		super();
	}

	@Override
	public String toString() {
		return "Chat [id=" + id + ", participants=" + participants + ", messages=" + messages + "]";
	}
	  
	
	  
	  

}
