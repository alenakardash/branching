package com.company.training.branching;

// Написать программу нахождения суммы большего и меньшего из трех чисел.

public class Task26 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		a = 3;
		b = 100;
		c = 1;
		
		int max;
		int min;
		
		if (a == b && b == c) {
			System.out.print("Числа равны");
			System.exit(0);
		}
		
		if (a > b && a > c) {
			max = a;
		}
		
		else if (b > c && b > a) {
			max = b;
		}
		
		else {
			max = c;
		}
		
		
		if (a < b && a < c) {
			min = a;
		}
		
		else if (b < c && b < a) {
			min = b;
		}
		
		else {
			min = c;
		}
		
		int result;
		
		result = max + min;
		
		System.out.print("result = " + result);
		
	}

}
