package com.telusko.dao;

import org.springframework.stereotype.Component;

@Component
public class CalculateDAO {

	private int num1;
	private int num2;
	private String operand;
	private int result;
	
	@Override
	public String toString() {
		return "CalculateDAO [operand=" + operand + ", num1=" + num1 + ", num2=" + num2 + ", result=" + result + "]";
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public String getOperand() {
		return operand;
	}
	public void setOperand(String operand) {
		this.operand = operand;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
}
