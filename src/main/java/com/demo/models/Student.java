package com.demo.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Student extends AuditModel{

	 private String name;
	 @ManyToMany(mappedBy = "students")
	 private List<Course> courses;

}
