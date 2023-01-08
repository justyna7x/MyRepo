package co2103.hw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co2103.hw2.repo.AdvisorsRepository;
import co2103.hw2.repo.CustomersRepository;
import co2103.hw2.repo.DepartmentRepository;
import co2103.hw2.repo.LoansRepository;
@Controller
public class DeleteController {
	@Autowired
	private AdvisorsRepository arepo;
	@Autowired
	private CustomersRepository crepo;
	@Autowired
	private DepartmentRepository drepo;
	@Autowired
	private LoansRepository lrepo;
	
	@RequestMapping("/deleteCustomers")
	public String deleteCustomer(@RequestParam int id, Model model) {    
		crepo.deleteById(id);
		
		return "redirect:/list";
		
	}
	@RequestMapping("/deleteAdvisors")
	public String deleteAdvisors(@RequestParam int id, Model model) {    
		arepo.deleteById(id);
		
		return "redirect:/list";


}
	
	@RequestMapping("/deleteDepartment")
	public String deleteDepartment(@RequestParam int id, Model model) {    
		drepo.deleteById(id);
		
		return "redirect:/list";


}	@RequestMapping("/deleteLoans")
public String deleteLoans(@RequestParam int id, Model model) {    
	lrepo.deleteById(id);
	
	return "redirect:/list";


}
}