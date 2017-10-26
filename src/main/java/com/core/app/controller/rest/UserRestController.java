package com.core.app.controller.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.primefaces.push.impl.JSONDecoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.core.app.model.User;
import com.core.app.service.LoginService;
import com.core.app.service.UserService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class UserRestController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = "application/json")
	public List<User> findAll() {
		// public ModelAndView loginProcess(@RequestParam("password") String password,
		// @RequestParam("username") String username) {
		List<User> model = new ArrayList<User>();
		try {
			System.out.println("masuk rest controller");
			model = userService.findAll();
			// ObjectMapper mapper = new ObjectMapper();
			// String jsonInString = mapper.writeValueAsString(model);
			// System.out.println("kan main = " + jsonInString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}

	@RequestMapping("/welcomeRest")
	public String welcome() {// Welcome page, non-rest
		return "Welcome to RestTemplate Example.";
	}

	@RequestMapping(value = "/userCoba", method = RequestMethod.POST, produces = "application/json")
	@JsonIgnore
	public User message(@RequestBody User user) {// REST Endpoint.
		// System.out.println("isi json = " + json);
		try {
			ObjectMapper mapper = new ObjectMapper();
			String jsonInString = mapper.writeValueAsString(user);
			System.out.println("isi json = " + jsonInString);
			// User user = new User();

			// user = mapper.readValue(json, User.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return user;
	}
}
