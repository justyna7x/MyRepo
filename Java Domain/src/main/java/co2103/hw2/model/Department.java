package co2103.hw2.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Department {
	
	@GeneratedValue
	@Id
	private int id;
	private String name;
	@ManyToMany
	private List<Advisors> worksIn;
	
	
	

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", worksIn=" + worksIn + "]";
	}

	public List<Advisors> getWorksIn() {
		return worksIn;
	}

	public void setWorksIn(List<Advisors> worksIn) {
		this.worksIn = worksIn;
	}

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

	

}

