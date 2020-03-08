package com.company.training.branching;

/* Вычислить значение функции:

F(x) = -x² + x - 9, если x >= 8

F(x) = 1 / (x⁴ - 6), если x < 8
 */

public class Task39 {
	
	public static void main(String[] args) {
		
		double x;
	    x = 2;
	    
	    double f;
	    
	    if (x >= 8) {
	    	
	    	f = -Math.pow(x, 2) + x - 9;
	    }
	    
	    else {
	    	
	    	f = 1 / (Math.pow(x, 4) - 6);
	    }
	    
	    System.out.print("f = " + f);
	}

}
