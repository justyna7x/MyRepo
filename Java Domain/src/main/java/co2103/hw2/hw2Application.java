package co2103.hw2;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import co2103.hw2.model.Advisors;
import co2103.hw2.model.Customers;
import co2103.hw2.model.Department;
import co2103.hw2.model.Loans;
import co2103.hw2.repo.AdvisorsRepository;
import co2103.hw2.repo.CustomersRepository;
import co2103.hw2.repo.DepartmentRepository;
import co2103.hw2.repo.LoansRepository;

@SpringBootApplication
public class hw2Application implements ApplicationRunner{
	
	@Autowired
	private AdvisorsRepository arepo;
	@Autowired
	private CustomersRepository crepo;
	@Autowired
	private DepartmentRepository drepo;
	@Autowired
	private LoansRepository lrepo;

	public static void main(String[] args) {
		SpringApplication.run(hw2Application.class, args);
	}
	@Override
	@Transactional
	public void run(ApplicationArguments args) throws Exception {
		Customers a = new Customers();
		a.setFull_name("Sophie Williams");
		a = crepo.save(a);
		
		Advisors b = new Advisors();
		b.setFull_name1("Michelle Rockefeller");
		b= arepo.save(b);
		
		Department c= new Department();
		c.setName("Mortgage Loans Department");
		c=drepo.save(c);
		
		Loans d = new Loans();
		d.setLoan_borrowed(12000);
		d=lrepo.save(d);
		
		a.setAdvisor(b);
		b.setCustomer(new ArrayList<>());
		b.getCustomer().add(a);	
		a = crepo.save(a);
		
		b.setDepartments(new ArrayList<>());
		b.getDepartments().add(c);
		b = arepo.save(b);
		
		c.setWorksIn(new ArrayList<>());
		c.getWorksIn().add(b);
		c=drepo.save(c);
		
		d.setCustomer(a);
		d=lrepo.save(d);
		a.setLoan(d);
		a=crepo.save(a);
	}
}
