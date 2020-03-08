package com.company.training.branching;

// Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.

public class Task13 {
	
	public static void main(String[] args) {
		
		double x1, x2;
		
		x1 = 10;
		x2 = 15;
		
		double y1;
		double y2;
		
		y1 = 20;
		y2 = 40;
		
		double hypoten1;
		double hypoten2;
		
		hypoten1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		
		hypoten2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
		
		
		if (hypoten1 < hypoten2) {
			System.out.print("Точка А находится ближе к началу координат");
		}
		
		else if (hypoten1 == hypoten2) {
			System.out.print("Точки находятся на одинаковом расстоянии от начала координат");
		}
		
		else {
			System.out.print("Точка B находится ближе к началу координат");
		}
	}

}
