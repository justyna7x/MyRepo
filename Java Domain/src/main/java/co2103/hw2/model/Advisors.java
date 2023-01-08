package co2103.hw2.model;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Advisors {
	@Id
	@GeneratedValue
	private int id;
	private String full_name1;
	@OneToMany(orphanRemoval = true)
	
	private List<Customers> customer;
	@ManyToMany()
	
	private List<Department> departments;

	

	@Override
	public String toString() {
		return "Advisors [id=" + id + ", full_name1=" + full_name1 + ", customer=" + customer + ", departments="
				+  "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getFull_name1() {
		return full_name1;
	}

	public void setFull_name1(String full_name1) {
		this.full_name1 = full_name1;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}



	public List<Customers> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customers> customer) {
		this.customer = customer;
	}

}
