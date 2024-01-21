package com.demo.models;

import java.util.Date;


import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@MappedSuperclass

public abstract class AuditModel {
@Id
private long id;
@Temporal(TemporalType.TIMESTAMP)
private Date createdAt;
@Temporal(TemporalType.TIMESTAMP)
private Date updatedAt;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public Date getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}
public Date getUpdatedAt() {
	return updatedAt;
}
public void setUpdatedAt(Date updatedAt) {
	this.updatedAt = updatedAt;
}





}
