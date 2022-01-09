package com.cg.app.repository;

import java.util.List;

import com.cg.app.entity.Category;

public interface ICategoryRepository {
	
	public Category addCategory(Category cat);
	public Category updateCategory(Category cat);
	public Category removeCategory(Category cat);
	public Category viewCategory(Category cat);
	public List<Category> viewAllCategory();


}
