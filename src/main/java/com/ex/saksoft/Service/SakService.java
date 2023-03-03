package com.ex.saksoft.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.saksoft.Model.SakModel;
import com.ex.saksoft.Repository.SakRepo;

import antlr.collections.impl.LList;

@Service
public class SakService {
	
	@Autowired
	private SakRepo repository;
	
	public SakModel saveSakModel(SakModel sakmodel) {
		return repository.save(sakmodel);
	}

	
	public List<SakModel> saveSakModel(List<SakModel> sakmodel) {
		return repository.saveAll(sakmodel);
	}

	
	public List<SakModel> getSakModel(){
		return repository.findAll();
	}
	
	
	public SakModel getSakModelById(int id){
		return repository.findById(id).orElse(null);
	}
	
	
	
	public SakModel getSakModelByFirstName(String firstName){
		return repository.findByFirstName(firstName);
		}
	
	
	
	
	public SakModel getSakModelByLastName(String lastName){
		return repository.findByLastName(lastName);
		}
	
	
	public String deletSakModel(int id) {
		repository.deleteById(id);
		return "product removed.."+ id;
	}
	
	
	public SakModel updateSakModel(SakModel sakModel) {
		SakModel existingSakModel = repository.findById(sakModel.getId()).orElse(null);
		existingSakModel.setAge(sakModel.getAge());
		existingSakModel.setFirstName(sakModel.getFirstName());
		existingSakModel.setLastName(sakModel.getLastName());
		existingSakModel.setEmail(sakModel.getEmail());
		return repository.save(existingSakModel);
	}
	
}
