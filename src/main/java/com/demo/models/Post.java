package com.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Post extends AuditModel {

	@Column(nullable = false)
	private String content,description,title;
	

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
