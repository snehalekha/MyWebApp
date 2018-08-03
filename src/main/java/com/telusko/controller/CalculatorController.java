package com.telusko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.telusko.service.CalculatorService;

@Controller
public class CalculatorController {
	
	@Autowired
	private CalculatorService calculatorService;
	
	@RequestMapping("home")
	//@ResponseBody
	public String home() {
		return "home.jsp";
	}

	@RequestMapping(value="/add")
	@ResponseBody
	public int addition(@RequestParam("a") int a,@RequestParam("b") int b) {
		return calculatorService.addition(a, b);
	}
}
