package com.rmendes.promwebhook.model;

import java.time.LocalDateTime;
import java.util.Map;

import com.rmendes.promwebhook.model.enums.Status;

public class Alert {
	
	private Status status;
	private LocalDateTime startsAt;
	private LocalDateTime endsAt;
	private String generatorURL;
	private Map<String, String> annotations;
	private Map<String, String> labels;
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public LocalDateTime getStartsAt() {
		return startsAt;
	}
	public void setStartsAt(LocalDateTime startsAt) {
		this.startsAt = startsAt;
	}
	public LocalDateTime getEndsAt() {
		return endsAt;
	}
	public void setEndsAt(LocalDateTime endsAt) {
		this.endsAt = endsAt;
	}
	public String getGeneratorURL() {
		return generatorURL;
	}
	public void setGeneratorURL(String generatorURL) {
		this.generatorURL = generatorURL;
	}
	public Map<String, String> getAnnotations() {
		return annotations;
	}
	public void setAnnotations(Map<String, String> annotations) {
		this.annotations = annotations;
	}
	public Map<String, String> getLabels() {
		return labels;
	}
	public void setLabels(Map<String, String> labels) {
		this.labels = labels;
	}
	
	

}
