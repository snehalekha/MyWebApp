package com.telusko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.service.CalculatorService;

@Controller
public class CalculatorController {
	
	@Autowired
	private CalculatorService calculatorService;
	
	@RequestMapping("/")
	//@ResponseBody
	public String home() {
		return "home";
	}

	@RequestMapping(value="/calculate")
	@ResponseBody
	public ModelAndView addition(@RequestParam("Submit") String operand,@RequestParam("a") int a,@RequestParam("b") int b) {
		int res;
		ModelAndView mv = new ModelAndView();
		if(operand.equals("Add")) {
			res = calculatorService.addition(a, b);
			mv.addObject("operand", "+");
		}else if(operand.equals("Subtract")) {
			res = calculatorService.subtraction(a, b);
			mv.addObject("operand", "-");
		}else {
			res = calculatorService.multiplication(a, b);
			mv.addObject("operand", "*");
		}
		mv.addObject("a", a);
		mv.addObject("b", b);
		mv.addObject("result", res);
		mv.setViewName("calculate");
		return mv;
	}
}
