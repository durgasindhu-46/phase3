package com.example;

import javax.annotation.Generated;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan @org.springframework.data.relational.core.mapping.Table(name="feedback")
public class FeedbackEntity {
	@org.springframework.data.annotation.Id @Generated(value = { "" })
	private int id;
	private String name;
	private String email;
	private String feedback;
	public FeedbackEntity(String name, String email, String feedback) {
		super();
		this.name = name;
		this.email = email;
		this.feedback = feedback;
	}
	
	//getters and setters
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", name=" + name + ", email=" + email + ", feedback=" + feedback + "]";
	}
}