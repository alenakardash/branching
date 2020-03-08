package com.company.training.branching;

/* Вычислить значение функции:
 
F(x) = -x³ + 9, если x <= 13

F(x) = - 3 / (x + 1), если x > 13
 */

public class Task40 {
	
	public static void main(String[] args) {
		
		double x;
		
		x = 29;
		
		double f;
		
		if (x <= 13) {
			
			f = -Math.pow(x, 3) + 9;
			
		}
		
		else {
			
			f = -3 / (x + 1);
		}
		
		System.out.print("f = " + f);
	}

}
