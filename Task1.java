package com.company.training.branching;

// Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран цифру 7, в противном случае – цифру 8

public class Task1 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		
		a = 1; 
		b = 2;
		
		if (a < b) {
			System.out.print(7);
		}
		
		else {
			System.out.print(8);
			
		}
		
	}
}
