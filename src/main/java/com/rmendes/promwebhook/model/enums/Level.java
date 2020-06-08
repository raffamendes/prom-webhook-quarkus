package com.rmendes.promwebhook.model.enums;

public enum Level {

	INFO("info"), WARNING("warning"), CRITICAL("critical");

	private String str;
	
	private Level(String str) {
		this.str = str;
	}
	
	@Override
	public String toString() {
		return this.str;
	}


}
