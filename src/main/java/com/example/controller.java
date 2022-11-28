package com.example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class controller {
	
	@Autowired
	repo obj;
	
	@GetMapping("/sql")
	public List<entity> findAll() {
		return obj.findAll();
	}
	
	@GetMapping("/sql/{id}")
	public Optional<entity> findById(@PathVariable String id) {
		return obj.findById(Integer.parseInt(id));
	}
		
	
	@PostMapping("/sql")
	public entity addingNew(@RequestBody entity e1){
		obj.save(e1);
		System.out.print(e1);
		return e1;
	}
	
	@DeleteMapping("/sql/{id}")
	public void deleteById(@PathVariable String id) {
		obj.deleteById(Integer.parseInt(id));
	}
}
