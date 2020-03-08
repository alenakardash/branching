package com.company.training.branching;

/* Вычислить значение функции:

 F(x) = x², если 0 <= x <= 3
 
 F(x) = 4,  если x > 3 и x < 0
 */

public class Task38 {
	
	public static void main(String[] args) {
		
		double x;
		x = 1;
		
		double f;
		
		if(x >= 0 && x <= 3) {
			f = Math.pow(x, 2);
		}
		else {
			f = 4;
		}
		
		System.out.print("f = " + f);
	}

}
