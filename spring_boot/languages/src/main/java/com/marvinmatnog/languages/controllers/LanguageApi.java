package com.marvinmatnog.languages.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marvinmatnog.languages.models.Language;
import com.marvinmatnog.languages.services.LanguageService;

@RestController
public class LanguageApi {
	private final LanguageService langServ;
	
	public LanguageApi(LanguageService langServ) {
		this.langServ = langServ;
	}
	
	
	@RequestMapping("/api/languages")
	public List<Language> index() {
		return langServ.allLanguage();
	}
	
	@RequestMapping(value="/api/languages", method=RequestMethod.POST)
	public Language create(@RequestParam("name") String name, @RequestParam("creator") String creator, @RequestParam("currentVersion") double currentVersion) {
		Language lang = new Language(name, creator, currentVersion);
		return langServ.createLanguage(lang);
	}
	
	@RequestMapping("/api/languages/{id}")
	public Language findLanguage(@PathVariable("id") Long id) {
		Language lang = langServ.findLanguage(id);
		return lang;
	}
	
	@RequestMapping(value="/api/languages/{id}", method=RequestMethod.PUT)
	public Language update(@PathVariable("id") Long id, 
							@RequestParam("name") String name, 
							@RequestParam("creator") String creator, 
							@RequestParam("currentVersion") double currentVersion) {
		Language lang = langServ.updateLanguage(id, name, creator, currentVersion);
		return lang;
	}
	
	@RequestMapping(value="/api/languages/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		langServ.delete(id);
	}
}
