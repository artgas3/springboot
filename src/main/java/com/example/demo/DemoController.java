package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DemoController {
    
	@Autowired
	DemoRepositry repo;
	
	@RequestMapping(value = "/products/" , method = RequestMethod.GET)
	public List<DemoEntity> getProduct() {
		return repo.findAll();
	}
	
	@RequestMapping(value = "/products/" ,method = RequestMethod.POST)
	public DemoEntity createProduct(@RequestBody DemoEntity product) {
		return repo.save(product);
	}
	
	@RequestMapping(value = "/products/" ,method = RequestMethod.PUT)
	public DemoEntity updateProduct(@RequestBody DemoEntity product) {
		return repo.save(product);
	}
	
	@RequestMapping(value = "/products/{id}" ,method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id") int id) {
		 repo.deleteById(id);
	}
}
