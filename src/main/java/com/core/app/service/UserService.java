package com.core.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import com.core.app.dao.UserDao;
import com.core.app.model.User;

public class UserService {

	@Autowired
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public List<User> findAll() {
		List<User> model = new ArrayList<User>();
		System.out.println("msauk sini");
		model = (List<User>) userDao.findAll();
		
		return model;
	}
}
