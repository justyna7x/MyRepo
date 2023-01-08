package co2103.hw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co2103.hw2.repo.AdvisorsRepository;
import co2103.hw2.repo.CustomersRepository;
import co2103.hw2.repo.DepartmentRepository;
import co2103.hw2.repo.LoansRepository;


@Controller
public class ListController {
	
	@Autowired
	private AdvisorsRepository arepo;
	@Autowired
	private CustomersRepository crepo;
	@Autowired
	private DepartmentRepository drepo;
	@Autowired
	private LoansRepository lrepo;
	
	
	
	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("customers", crepo.findAll());
		model.addAttribute("advisors", arepo.findAll());
		model.addAttribute("loans", lrepo.findAll());
		model.addAttribute("department", drepo.findAll());
		return "list";
	}


}
