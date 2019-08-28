package com.laptrinhjavaweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.INewDAO;
import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.service.INewService;

public class NewService implements INewService {
	@Inject
	private INewDAO newDAO;

	@Override
	public List<NewModel> findByCategoryId(Long categoryId) {
		return newDAO.findByCategoryId(categoryId);
	}

	@Override
	public NewModel save(NewModel newModel) {
		Long newId = newDAO.save(newModel);
		System.out.println(newId);
		return null;
	}

	@Override
	public NewModel update(NewModel Newmodel) {

		return null;
	}

	@Override
	public NewModel delete(NewModel newmodel) {
		Long categoryId = newDAO.delete(newmodel);
		System.out.println(categoryId);
		return null;
	}
}
