package com.pratiti.model;

public class LoginStatus {

	private boolean status;
	private String messageIfAny;
	private int id;
	private String name;

	//private Customer customer;
	
	
	public boolean isStatus() {
		return status;
	}
	public String getMessageIfAny() {
		return messageIfAny;
	}
	public void setMessageIfAny(String messageIfAny) {
		this.messageIfAny = messageIfAny;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
