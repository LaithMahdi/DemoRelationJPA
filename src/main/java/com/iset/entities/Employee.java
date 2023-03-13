package com.iset.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@ManyToOne
	@JoinColumn (name="DEPT_ID")
	private Department dept;
	
	@ManyToMany
	@JoinTable(name = "EMP_PROJ",
	joinColumns = @JoinColumn(name = "EMP_ID"),
	inverseJoinColumns = @JoinColumn(name = "PROJ_ID") )
	private List<Projet> projets;
	
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
	public Department getDept() {
		return dept;
	}
	public void setDept(Department d) {
		this.dept = d;
	}

	public List<Projet> getProjets() {
		return projets;
	}
	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}
	
}
