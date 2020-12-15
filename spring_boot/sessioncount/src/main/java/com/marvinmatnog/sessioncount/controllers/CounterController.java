package com.marvinmatnog.sessioncount.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("")
	public String index(HttpSession session) {
		Object sessionCount = session.getAttribute("count");
		if (sessionCount == null) {
			session.setAttribute("count", 0);
		}
		session.setAttribute("count", (Integer) session.getAttribute("count") + 1);
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String showCounter(Model model, HttpSession session) {
		Object sessionCount = session.getAttribute("count");
		if (sessionCount == null) {
			session.setAttribute("count", 0);
		}
		model.addAttribute("count", session.getAttribute("count"));
		return "counter.jsp";
	}
	
	@RequestMapping("/count2")
	public String addTwo(HttpSession session) {
		Object sessionCount = session.getAttribute("count");
		if (sessionCount == null) {
			session.setAttribute("count", 0);
		}
		session.setAttribute("count", (Integer) session.getAttribute("count") + 1);
		return "redirect:/counter";
	}
	
	@RequestMapping("/clear")
	public String clear(HttpSession session) {
		session.setAttribute("count", 0);
		return "redirect:/";
	}
}
