package com.company.training.branching;

/* Вычислить значение функции:
 * 
F(x) = -x² + 3x + 9, если x >= 3

F(x) = 1 / (x³ - 6), если x < 3
 */


public class Task37 {
	
public static void main(String[] args) {
		
		double x;
		x = 4;
		
		double f;
		
		
		if (x >= 3) {
			
			f = - Math.pow(x, 2) + 3 * x + 9;
			
		}
		
		else {
			
			f = 1 / (Math.pow(x, 3) - 6);
		}
		
		System.out.print("f = " + f);
	}

}
