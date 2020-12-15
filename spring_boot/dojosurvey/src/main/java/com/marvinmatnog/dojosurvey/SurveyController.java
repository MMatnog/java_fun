package com.marvinmatnog.dojosurvey;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SurveyController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public String submit(@RequestParam("name") String name,
						@RequestParam("dojo") String dojo,
						@RequestParam("language") String language,
						@RequestParam(value = "comment", required = false) String comment,
						HttpSession session) {
		System.out.println(name);
		System.out.println(dojo.toString());
		System.out.println(language.toString());
		System.out.println(comment.toString());
		
		session.setAttribute("name", name);
		session.setAttribute("dojo", dojo);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		
		return "redirect:/result";
		
	}
	
	@RequestMapping("/result")
	public String result(Model model, HttpSession session) {
		model.addAttribute("name", session.getAttribute("name"));
		model.addAttribute("dojo", session.getAttribute("dojo"));
		model.addAttribute("language", session.getAttribute("language"));
		model.addAttribute("comment", session.getAttribute("comment"));
		
		return "results.jsp";
	}
}
