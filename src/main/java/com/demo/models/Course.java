package com.demo.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Course extends AuditModel {
private String name;
private String description;
@ManyToMany
private List<Student> students;
}
