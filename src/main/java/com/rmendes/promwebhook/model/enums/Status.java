package com.rmendes.promwebhook.model.enums;

public enum Status {
	
	FIRING("firing"), SOLVED("solved");
	
	private String str;
	
	private Status(String str) {
		this.str = str;
	}
	
	
	@Override
	public String toString() {
		return str;
	}
	
	
	

}
