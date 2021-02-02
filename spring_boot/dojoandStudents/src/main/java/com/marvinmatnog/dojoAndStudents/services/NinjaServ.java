package com.marvinmatnog.dojoAndStudents.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.marvinmatnog.dojoAndStudents.models.Ninja;
import com.marvinmatnog.dojoAndStudents.repos.NinjaRepo;

@Service
public class NinjaServ {
	private final NinjaRepo ninjaRepo;
	
	public NinjaServ(NinjaRepo ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	public List<Ninja> allNinja(){
		return ninjaRepo.findAll();
	}
	
	public Ninja findNinja(Long id) {
		Optional<Ninja> ninja = ninjaRepo.findById(id);
		if (ninja.isPresent()) {
			return ninja.get();
		} else {
			return null;
		}
	}
	
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	public Ninja updateNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	public void deleteNinja(Long id) {
		ninjaRepo.deleteById(id);
	}
}
