package com.company.training.branching;

// Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.

public class Task12 {
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		a = -2;
		b = 4;
		c = 0;
		
		double aResult;
		double bResult;
		double cResult;
		
		if (a > 0) {
			aResult = Math.pow(a, 2);
			
		}
		
		else if (a == 0) {
			aResult = 0;
		}
		
		else {
			aResult = Math.pow(a, 4);
		}
		
		System.out.println("a = " + aResult);
		
		
		if (b > 0) {
			bResult = Math.pow(b, 2);
			
		}
		
		else if (b == 0) {
			bResult = 0;
		}
		
		else {
			bResult = Math.pow(b, 4);
		}
		
		System.out.println("b = " + bResult);
		
		
		if (c > 0) {
			cResult = Math.pow(c, 2);
			
		}
		
		else if (c == 0) {
			cResult = 0;
		}
		
		else {
			cResult = Math.pow(c, 4);
		}
		
		System.out.println("c = " + cResult);
		
		
	}

}
