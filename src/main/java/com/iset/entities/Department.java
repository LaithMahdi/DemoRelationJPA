package com.iset.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
    @Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	private String dname;
	
	@OneToMany (mappedBy="dept") //sans (mappedBy="d") une table interm�diare 
	//departement_employee sera cr��e
	private List<Employee> emps;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<Employee> getEmps() {
		return emps;
	}
	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	
	
}
