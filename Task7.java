package com.company.training.branching;

// Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х

public class Task7 {
	
	public static void main(String[] args) {
	
	double a, b, c, x;
	
	a = -10;
	b = 2;
	c = 3;
	x = 4;
	
	double arg1, arg2, temp, result;
	
	arg1 = a * Math.pow(x, 2);
	
	arg2 = b * x;
	
	temp = arg1 + arg2 + c;
	
	if (temp >= 0) {
		
		result = temp;
		
	}
	
	else {
		
		result = Math.abs(temp);
	}
	
	System.out.println("Модуль выражения = " + result);
	
	}
}
