package com.telusko.service;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

	public int addition(int a,int b) {
		return a+b;
	}

	public int subtraction(int a, int b) {
		return a-b;
	}

	public int multiplication(int a, int b) {
		return a*b;
	}
}
