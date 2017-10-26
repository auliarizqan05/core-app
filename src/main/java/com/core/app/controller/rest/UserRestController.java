package com.core.app.controller.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.core.app.model.User;
import com.core.app.service.LoginService;
import com.core.app.service.UserService;

@RestController
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/findAll", 
//			produces = MediaType.APPLICATION_JSON,
			method = RequestMethod.GET,
			produces = "application/json")
	@ResponseBody
	public List<User> findAll() {
//	public ModelAndView loginProcess(@RequestParam("password") String password, @RequestParam("username") String username) {
		List<User> model = new ArrayList<User>();
		System.out.println("masuk rest controller");
		model = userService.findAll();

		return model;
	}

}
