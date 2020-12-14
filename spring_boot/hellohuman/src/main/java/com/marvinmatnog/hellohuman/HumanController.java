package com.marvinmatnog.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@RequestMapping("/")
	public String hello(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "lastname", required = false) String lastName) {
		if (name == null && lastName == null) {
			return (
					"<h1>Hello Human</h1>"
					+ "<br>"
					+ "<h2>This is Springboot</h2>"
			);
		} else if (lastName == null) {
			return (
					"<h1>Hello " + name + "</h1>"
					+ "<br>"
					+ "<h2>This is Springboot</h2>"
			);
		} else if (name == null) {
			return (
					"<h1>Hello " + lastName + "</h1>"
					+ "<br>"
					+ "<h2>This is Springboot</h2>"
			);
		} else {
			return (
					"<h1>Hello " + name + " " + lastName + "</h1>"
					+ "<br>"
					+ "<h2>This is Springboot</h2>"
			);
		}
	}
}
