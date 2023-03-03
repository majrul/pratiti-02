package com.pratiti.model;

public class RegistrationStatus {

	private boolean status;
	private String messageIfAny;
	private int registeredCustomerId;

	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMessageIfAny() {
		return messageIfAny;
	}
	public void setMessageIfAny(String messageIfAny) {
		this.messageIfAny = messageIfAny;
	}
	public int getRegisteredCustomerId() {
		return registeredCustomerId;
	}
	public void setRegisteredCustomerId(int registeredCustomerId) {
		this.registeredCustomerId = registeredCustomerId;
	}
	
	
}
