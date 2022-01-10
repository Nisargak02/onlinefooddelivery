package com.cg.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.app.entity.Category;

public interface ICategoryRepository extends JpaRepository<Category,Integer>{
	
	public Category addCategory(Category cat);
	public Category updateCategory(Category cat);
	public Category removeCategory(Category cat);
	public Category viewCategory(Category cat);
	public List<Category> viewAllCategory();


}
