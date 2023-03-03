package com.ex.saksoft.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ex.saksoft.Model.SakModel;
import com.ex.saksoft.Service.SakService;

@RestController
public class SakController {
	
	@Autowired
	private SakService service;
	
	
	@PostMapping("/addmodel")
	public SakModel addSakModel(@RequestBody SakModel sakModel) {
		return service.saveSakModel(sakModel);
	}
	
	
	@PostMapping("/addmodels")
	public List<SakModel>  addModels(@RequestBody List<SakModel> sakModels) {
		return service.saveSakModel(sakModels);
	}
	
	

	@GetMapping("/models")
	public List<SakModel> findAllSakModel(){
		return service.getSakModel();
		
	}
	
	
	
	@GetMapping("/modelbyid/{id}")
	public SakModel findSakModelById(@PathVariable int id) {
		return service.getSakModelById(id);
	}
	
	
	
	@GetMapping("/modelbyname/{firstName}")
	public SakModel findSakModelByFirstName(@PathVariable String firstName) {
		return service.getSakModelByFirstName(firstName);
	}
	
	
	
	@PutMapping("/update")
	public SakModel updateSakModel(@RequestBody SakModel sakModel) {
		return service.updateSakModel(sakModel);
	}
	
	
	@DeleteMapping("/delet/{id}")
	public String deletSakModel(@PathVariable int id) {
		return service.deletSakModel(id);
	}
	
}
