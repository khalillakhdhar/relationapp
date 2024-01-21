package com.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Comment extends AuditModel{
	@Column(nullable = false)
	@NotBlank	
	private String text;
	@ManyToOne(optional = false,fetch = FetchType.LAZY)
	@JoinColumn(name = "post_id")
	private Post post;

}
