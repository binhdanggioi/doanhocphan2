package com.laptrinhjavaweb.service.impl;


import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.service.ICategoryService;

public class CategoryService implements ICategoryService {
	
	@Inject
	private ICategoryDAO categoryDao;
//	private ICategoryDAO categoryDao; // cách gọi tầng DAO theo kiểu thủ công C1
//	public CategoryService() {
//		categoryDao = new CategoryDAO();
//	}
	@Override
	public List<CategoryModel> findAll(){
		return categoryDao.findAll();
	}
}
