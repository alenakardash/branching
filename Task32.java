package com.company.training.branching;

// Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них положительной.

public class Task32 {
	
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		a = -5;
		b = 7;
		c = -8;
		
		if(a + b > 0 || a + c > 0 || b + c > 0) {
			
		if(a + b > 0) {
			System.out.println("Сумма a и b - положительна");
		}
		
		if(a + c > 0) {
			System.out.println("Сумма a и с - положительна");
		}
		
		if(c + b > 0) {
			System.out.println("Сумма с и b - положительна");
		}
	 }
		else {
			System.out.println("Сумма пар чисел отрицательна или равна 0");
		}
	}

}
