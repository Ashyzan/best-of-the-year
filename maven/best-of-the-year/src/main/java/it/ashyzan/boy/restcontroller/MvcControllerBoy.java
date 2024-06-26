package it.ashyzan.boy.restcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class MvcControllerBoy {
	
	@GetMapping ("/best")
	public String best(@RequestParam(name = "nome", required = false) 
	String nome, Model model) {
		
		model.addAttribute("name", nome);
		
		return "best";
		
	}


}
