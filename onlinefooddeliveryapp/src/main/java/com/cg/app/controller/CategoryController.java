package com.cg.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.app.entity.Category;

import com.cg.app.service.ICategoryService;

public class CategoryController {
	
	@Autowired
	ICategoryService categoryService;
	
	@PostMapping("/register")
	public ResponseEntity<Category> addCustomer(@RequestBody Category category) {
	
		Category cat = categoryService.addCategory(category);
		
		return new ResponseEntity<Category>(cat,HttpStatus.OK);
		
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Category> updateCategory(@RequestBody Category category){
	
		Category cat = categoryService.updateCategory(category);
		 
			return new ResponseEntity<Category>(cat,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/remove/{catName}")
	public Category removeCategory(@PathVariable("catName") String catName) {
		
		return  categoryService.removeCategory(catName);
		
	}
	
	@GetMapping("/view/{catName}")
	public ResponseEntity<Category> viewCategory(@PathVariable("catName") String catName){
		
		Category category= categoryService.viewCategory(catName);
		 
			return new ResponseEntity<Category>(category,HttpStatus.OK);
		
	}
	

	@GetMapping("/viewall")
	public List<Category> viewAllCategory(){
		
		return categoryService.viewAllCategory();
		
		
	}
	
	
	
	

}
