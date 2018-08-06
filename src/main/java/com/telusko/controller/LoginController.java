package com.telusko.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.telusko.demo.model.Login;
import com.telusko.demo.repository.LoginRepo;

@Controller
public class LoginController {

	@Autowired
	LoginRepo loginRepo;

	@RequestMapping("/login")
	public String login(Login loginEntity) {
		System.out.println(loginEntity.toString());
		loginRepo.save(loginEntity);
		return "home";
	}

	@RequestMapping("/getByName/{wildcard}")
	@ResponseBody
	public List<Login> getByName(@PathVariable("wildcard") String wildcard) {
		return loginRepo.findByWildCard(wildcard);
	}
}