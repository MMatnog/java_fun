package com.marvinmatnog.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marvinmatnog.languages.models.Language;
import com.marvinmatnog.languages.services.LanguageService;

@Controller
public class LanguageController {
	
	private final LanguageService langServ;
	
	public LanguageController(LanguageService langServ) {
		this.langServ = langServ;
	}
	
	@RequestMapping("/languages")
	public String index(Model model, @ModelAttribute("language") Language language) {
		List<Language> languages = langServ.allLanguage();
		model.addAttribute("languages", languages);
		return "/languages/index.jsp";
	}
	
	@RequestMapping(value="/languages", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("language") Language language, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<Language> languages = langServ.allLanguage();
			model.addAttribute("languages", languages);
			return "/languages/index.jsp";
		} else {
			langServ.createLanguage(language);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping("/languages/{id}")
	public String show(@PathVariable("id")Long id, Model model) {
		Language lang = langServ.findLanguage(id);
		model.addAttribute("language", lang);
		return "/languages/show.jsp";
	}
	
	@RequestMapping("/languages/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Language language = langServ.findLanguage(id);
		model.addAttribute("language", language);
		return "/languages/edit.jsp";
	}
	
	@RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("language") Language lang, BindingResult result) {
		if (result.hasErrors()) {
			return "/languages/edit.jsp";
		} else {
			langServ.createLanguage(lang);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping("/languages/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		langServ.delete(id);
		return "redirect:/languages";
	}
	
	@RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
	public String deleteLang(@PathVariable("id")Long id) {
		langServ.delete(id);
		return "redirect:/languages";
	}
}
