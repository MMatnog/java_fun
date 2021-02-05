package com.marvinmatnog.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.marvinmatnog.languages.models.Language;
import com.marvinmatnog.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository langRepo;
	
	public LanguageService(LanguageRepository langRepo) {
		this.langRepo = langRepo;
	}
	
	public List<Language> allLanguage(){
		return langRepo.findAll();
	}
	
	public Language createLanguage(Language lang) {
		return langRepo.save(lang);
	}
	
	public Language findLanguage(Long id) {
		Optional<Language> optionalLang = langRepo.findById(id);
		if (optionalLang.isPresent()) {
			return optionalLang.get();
		} else {
			return null;
		}
	}
	
	public Language updateLanguage(Long id, String name, String creator, double currentVersion) {
		Language lang = findLanguage(id);
		lang.setName(name);
		lang.setCreator(creator);
		lang.setCurrentVersion(currentVersion);
		return langRepo.save(lang);
	}
	
	public void delete(Long id) {
		Optional<Language> lang = langRepo.findById(id);
		if (lang.isPresent()) {
			langRepo.deleteById(id);
		}
	}
}
