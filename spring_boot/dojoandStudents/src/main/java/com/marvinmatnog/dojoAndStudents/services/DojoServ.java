package com.marvinmatnog.dojoAndStudents.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.marvinmatnog.dojoAndStudents.models.Dojo;
import com.marvinmatnog.dojoAndStudents.repos.DojoRepo;

@Service
public class DojoServ {
	private final DojoRepo dojoRepo;
	
	public DojoServ(DojoRepo dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	public List<Dojo> allDojo(){
		return dojoRepo.findAll();
	}
	
	public Dojo findDojo(Long id) {
		Optional<Dojo> dojo = dojoRepo.findById(id);
		if (dojo.isPresent()) {
			return dojo.get();
		} else {
			return null;
		}
	}
	
	public Dojo newDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	public Dojo updateDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	public void deleteDojo(Long id) {
		dojoRepo.deleteById(id);
	}
}
