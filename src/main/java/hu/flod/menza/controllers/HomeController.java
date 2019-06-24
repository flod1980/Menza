package hu.flod.menza.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import hu.flod.menza.service.ProductsService;
import hu.flod.menza.service.WorkersService;

@Controller
public class HomeController {
	
	@Autowired
	ProductsService productsService;
	@Autowired
	WorkersService workersService;
	
	@GetMapping("/")
	public String index(Model md) {
		md.addAttribute("list_products", productsService.findAllProducts());
		md.addAttribute("list_workers", workersService.findAllWorkers());
		return "cash_register";
		
	}
	


}
