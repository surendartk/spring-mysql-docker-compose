package com.suren.springdocker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Errors {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String topic;
    private String error;
    private String solution;
    
    
    
    
	public Errors() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Errors(Long id, String topic, String error, String solution) {
		super();
		this.id = id;
		this.topic = topic;
		this.error = error;
		this.solution = solution;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getSolution() {
		return solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}
    
    // Constructors, getters, and setters
}
