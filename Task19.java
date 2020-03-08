package com.company.training.branching;

// Подсчитать количество положительных среди чисел а, b, с.

public class Task19 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		a = 2;
		b = -7;
		c = 90;
		
		int positive;
		
		positive = 0;
		
		if (a > 0) {
			positive++;
		}
		
		if (b > 0) {
			positive++;
		}
		
		if (c > 0) {
			positive++;
		}
		
		System.out.print("Count of positive numbers is " + positive);
		
	}

}

