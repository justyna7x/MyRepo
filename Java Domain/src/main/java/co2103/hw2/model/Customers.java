package co2103.hw2.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Customers {
	@Id
	@GeneratedValue
	private int id;
	private String full_name;
	
	@ManyToOne
	private Advisors advisor;
	@OneToOne(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, mappedBy = "customer")
	private Loans loan;
	
	
	
	@Override
	public String toString() {
		return "Customers [id=" + id + ", full_name=" + full_name + ", advisor=" + advisor.getFull_name1() + ", loan=" + loan + "]";
	}

	public Advisors getAdvisor() {
		return advisor;
	}

	public void setAdvisor(Advisors advisor) {
		this.advisor = advisor;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public Loans getLoan() {
		return loan;
	}

	public void setLoan(Loans loan) {
		this.loan = loan;
	}
	
	
	

}

