package co2103.hw2.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Loans {
	@Id
	@GeneratedValue
	private int id;
	private int loan_borrowed;
	@JoinColumn
	@OneToOne(cascade = CascadeType.REMOVE)
	private Customers customer;

	


	


	@Override
	public String toString() {
		return "Loans [id=" + id + ", loan_borrowed=" + loan_borrowed + ", customer=" + customer.getFull_name() + "]";
	}



	public int getId() {
		return id;
	}
	
	

	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLoan_borrowed() {
		return loan_borrowed;
	}

	public void setLoan_borrowed(int loan_borrowed) {
		this.loan_borrowed = loan_borrowed;
	}

	
	
	
	
}
