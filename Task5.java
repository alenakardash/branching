package com.company.training.branching;

// Составить программу: определения наименьшего из двух чисел а и b.

public class Task5 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		
		a = -50;
		b = 50;
		
		if (a < b) {
		System.out.print(a + " - наименьшее число");
		}
		
		else if (a == b) {
			System.out.print("Числа равны");
		}
		
		else {
			System.out.print(b + " - наименьшее число");
		}
	}

}
