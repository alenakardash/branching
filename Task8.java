package com.company.training.branching;

// Составить программу нахождения наименьшего из квадратов двух чисел а и b.

public class Task8 {
	
	public static void main(String[] args) {
		
		double a;
		double b;
		
		a = 4;
		b = 5;
		
		double squaredA;
		double squaredB;
		
		squaredA = Math.pow(a, 2);
		squaredB = Math.pow(b, 2);
		
		if (squaredA < squaredB) {
			System.out.print(squaredA + " - наименьшее из квадратов двух чисел");
		}
		
		else if (squaredA == squaredB) {
			System.out.print("Квадраты чисел равны" + squaredA);
		}
		
		else {
			System.out.print(squaredB + " - наименьшее из квадратов двух чисел");
		}
	}

}
