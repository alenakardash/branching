package com.company.training.branching;

/* Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной их суммы,
а большее — их удвоенным произведением.
*/

public class Task15 {
	
	public static void main(String[] args) {
		
		double x;
		double y;
		
		x = 5;
		y = 1;
		
		double resX;
		double resY;
		
		if (x > y) {
			
			resX = 2 * x * y;
			resY = (x + y) / 2;
			
		}
		
		else {
			resX = (x + y) / 2;
			resY = 2 * x * y;
		}
		
		System.out.print("x теперь = " + resX + ", а y = " + resY);
		
	}

}
