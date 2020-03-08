package com.company.training.branching;

// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.

public class Task31 {
	
	public static void main(String[] args) {
		
		int a;
		a = 10;
		
		int b;
		b = 5;
		
		int x;
		x = 8;
		
		int y;
		y = 6;
		
		int z;
		z = 4;
		
		
		if (a >= x && b >= z) {
			System.out.println("Кирпич пройдет");
		}
		
		else if (a >= y && b >= z) {
			System.out.println("Кирпич пройдет");
		}
		
		else if (a >= x && b >= y) {
			System.out.println("Кирпич пройдет");
		}
		
		else if (a >= y && b >= x) {
			System.out.println("Кирпич пройдет");
		}
		
		else if (a >= z && b >= y) {
			System.out.println("Кирпич пройдет");
		}
		
		else if (a >= z && b >= x) {
			System.out.println("Кирпич пройдет");
		}
		
		else {
			System.out.println("Кирпич не пройдет");
		}
		
		}

}
