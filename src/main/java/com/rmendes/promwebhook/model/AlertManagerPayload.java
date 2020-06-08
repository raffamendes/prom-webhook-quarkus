package com.rmendes.promwebhook.model;

import java.util.List;
import java.util.Map;

public class AlertManagerPayload {
	
	
	private String version;
	private String receiver;
	private String status;
	private String externalURL;
	private List<Alert> alerts;
	private Map<String, String> groupLabels;
	private Map<String, String> commonAnnotations;
	private Map<String, String> commonLabels;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getExternalURL() {
		return externalURL;
	}
	public void setExternalURL(String externalURL) {
		this.externalURL = externalURL;
	}
	public List<Alert> getAlerts() {
		return alerts;
	}
	public void setAlerts(List<Alert> alerts) {
		this.alerts = alerts;
	}
	public Map<String, String> getGroupLabels() {
		return groupLabels;
	}
	public void setGroupLabels(Map<String, String> groupLabels) {
		this.groupLabels = groupLabels;
	}
	public Map<String, String> getCommonAnnotations() {
		return commonAnnotations;
	}
	public void setCommonAnnotations(Map<String, String> commonAnnotations) {
		this.commonAnnotations = commonAnnotations;
	}
	public Map<String, String> getCommonLabels() {
		return commonLabels;
	}
	public void setCommonLabels(Map<String, String> commonLabels) {
		this.commonLabels = commonLabels;
	}
	
	
	
	

}
