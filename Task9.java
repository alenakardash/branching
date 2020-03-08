package com.company.training.branching;

// Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.

public class Task9 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		a = 30;
		b = 30;
		c = 30;
		
		if (a > 0 && b > 0 && c > 0) {
			
			if (a < (b + c) && b < (a + c) && c < (a + b)) {
		
		if (a == b && a == c && c == b) {
			System.out.print("Треугольник равносторонний");
		}
		
		else {
			System.out.print("Треугольник не равносторонний");
		  }
		
			}
			
			else {
				System.out.println("Такого треугольника не существует");
			}
		}
		
		else {
			System.out.println("Не бывает треугольников с отрицательными сторонами или сторонами = 0");
		}
	}

}
