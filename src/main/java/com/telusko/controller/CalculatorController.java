package com.telusko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.dao.CalculateDAO;
import com.telusko.service.CalculatorService;

@Controller
public class CalculatorController {
	
	@Autowired
	private CalculatorService calculatorService;
	
	@RequestMapping("/")
	public String home() {
		return "login";
	}

	@RequestMapping(value="/calculate")
	@ResponseBody
	public ModelAndView addition(CalculateDAO calDAO) {
		ModelAndView mv = new ModelAndView();
		int a = calDAO.getNum1(), b = calDAO.getNum2();
		if(calDAO.getOperand().equals("Add")) {
			calDAO.setResult(calculatorService.addition(a, b));
			calDAO.setOperand("+");
		}else if(calDAO.getOperand().equals("Subtract")) {
			calDAO.setResult(calculatorService.subtraction(a, b));
			calDAO.setOperand("-");
		}else {
			calDAO.setResult(calculatorService.multiplication(a, b));
			calDAO.setOperand("*");
		}
		mv.addObject("obj", calDAO);
		mv.setViewName("calculate");
		return mv;
	}
}
