package com.core.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import com.core.app.dao.UserDao;
import com.core.app.model.User;

public class LoginService {

	@Autowired
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public ModelAndView loginProcess(User user) {
		ModelAndView model = new ModelAndView();
		System.out.println(user.getUsername() + " - " + user.getPassword());
		try {
			User userExist = userDao.findByUsernameAndPassword(user.getUsername(), user.getPassword());
			
//			List<User> userExists =  (List<User>) userDAO.findAll();
//			User userContent = null;
//			System.out.println("size = " + userExists.size());
//			for(User userExist: userExists) {
//				System.out.println("masuk for");
//				if(userExist.getPassword().equalsIgnoreCase(user.getPassword()) &&
//						userExist.getUsername().equalsIgnoreCase(user.getUsername())) {
//					System.out.println("masuk");
//					userContent = userExist;
//					break;
//				}
//			}
			if (userExist != null) {
				System.out.println("hhhahaha");
				model.addObject("user", user.getUsername());
				model.setViewName("welcome");
			}else {
				model.addObject("user", user.getUsername());
				model.setViewName("loginFailed");
			}

		} catch (Exception e) {
			e.printStackTrace();
			model.addObject("user", user.getUsername());
			model.setViewName("loginFailed");
		}
		return model;
	}
}
