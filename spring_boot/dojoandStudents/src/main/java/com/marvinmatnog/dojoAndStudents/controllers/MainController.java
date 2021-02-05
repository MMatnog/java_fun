package com.marvinmatnog.dojoAndStudents.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.marvinmatnog.dojoAndStudents.models.Dojo;
import com.marvinmatnog.dojoAndStudents.models.Ninja;
import com.marvinmatnog.dojoAndStudents.services.DojoServ;
import com.marvinmatnog.dojoAndStudents.services.NinjaServ;

@Controller
public class MainController {
	private final NinjaServ ninjaServ;
	private final DojoServ dojoServ;
	
	public MainController(NinjaServ ninjaServ, DojoServ dojoServ) {
		this.ninjaServ = ninjaServ;
		this.dojoServ = dojoServ;
	}
	
	@GetMapping("")
	public String index() {
		return "redirect:/dojos";
	}
	
	@GetMapping("/dojos")
	public String dojos(Model model) {
		List<Dojo> dojos = dojoServ.allDojo();
		model.addAttribute("dojos", dojos);
		return "index.jsp";
	}
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "newdojo.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "/dojos/new";
		} else {
			dojoServ.newDojo(dojo);
			return "redirect:/";
		}
	}
	
	@GetMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model, @ModelAttribute("dojo") Dojo dojo) {
		Dojo d = dojoServ.findDojo(id);
		if (d != null){
			model.addAttribute("ninjas", d.getNinjas());
			model.addAttribute("dojo", d);
			return "viewdojo.jsp";
		} else {
			return "redirect:/";
		}
	}
	
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = dojoServ.allDojo();
		model.addAttribute("dojos", dojos);
		return "newninja.jsp";
	};
	
	@PostMapping("/ninjas/new")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "/ninjas/new";
		} else {
			ninjaServ.createNinja(ninja);
			return "redirect:/";
		}
	}
}	
