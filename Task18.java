package com.company.training.branching;

// Подсчитать количество отрицательных среди чисел а, b, с

public class Task18 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		a = 2;
		b = -7;
		c = -90;
		
		int negative;
		
		negative = 0;
		
		if (a < 0) {
			negative++;
		}
		
		if (b < 0) {
			negative++;
		}
		
		if (c < 0) {
			negative++;
		}
		
		System.out.print("Count of negative numbers is " + negative);
		
	}

}
