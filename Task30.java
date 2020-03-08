package com.company.training.branching;

// Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.

public class Task30 {
	
	public static void main(String[] args) {
	
	 double a;
	 double b;
	 double c;
	
	 a = -3;
	 b = -4.5;
	 c = -10;
	
	if (a > b && b > c) {
		a *= 2;
		b *= 2;
		c *= 2;
	}
	
	else {
		if (a < 0) {
			a = - a;
		}
		else if (a == 0) {
			a = 0;
		}
		
		else {
		}
		
		if (b < 0) {
			b = - b;
		}
		else if (b == 0) {
			b = 0;
		}
		
		else {
		}
		
		if (c < 0) {
			c = - c;
		}
		else if (c == 0) {
			c = 0;
		}
		
		else {
		}
		
		
	}
	
	
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	System.out.println("c = " + c);
	
	}

}
