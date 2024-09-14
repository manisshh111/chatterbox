package com.manish.chatterbox.document;

import java.time.LocalDateTime;

public class Message {
	
	private String senderId;
	private String text;
	private LocalDateTime timeStamp;
	private String status;
	public String getSenderId() {
		return senderId;
	}
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Message(String senderId, String text, LocalDateTime timeStamp, String status) {
		super();
		this.senderId = senderId;
		this.text = text;
		this.timeStamp = timeStamp;
		this.status = status;
	}
	public Message() {
		super();
	}
	@Override
	public String toString() {
		return "Message [senderId=" + senderId + ", text=" + text + ", timeStamp=" + timeStamp + ", status=" + status
				+ "]";
	}
	
	

}
