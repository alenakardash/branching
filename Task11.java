package com.company.training.branching;

// Составить программу, которая определит площадь какого треугольника больше.

public class Task11 {
	
	public static void main(String[] args) {
		
// Предположим, что у нас два треугольника и мы знаем только длины их сторон
		
		double a1, b1, c1;
		
		a1 = 10;
		b1 = 10;
		c1 = 5;
		
		double a2, b2, c2;
		
		a2 = 30;
		b2 = 30;
		c2 = 15;
		
		if (a1 <= 0 || b1 <= 0 || c1 <= 0) {
			System.out.print("Первого треугольника не существует");
			System.exit(0);
		}
		
		if (a2<= 0 || b2 <= 0 || c2 <= 0) {
			System.out.print("Второго треугольника не существует");
			System.exit(0);
		}
		
		if (a1 >= (b1 + c1) || b1 >= (a1 + c1) || c1 >= (a1 + b1)) {
			System.out.print("Первого треугольника не существует");
			System.exit(0);
		}
		
		if (a2 >= (b2 + c2) || b2 >= (a2 + c2) || c2 >= (a2 + b2)) {
			System.out.print("Второго треугольника не существует");
			System.exit(0);
		}
		
		double perim1;
		double perim2;
		
		double semiperim1;
		double semiperim2;
		
		double area1, area2;
		
		
		perim1 = a1 + b1 + c1;
	    
		semiperim1 = perim1 / 2;
		
		area1 = Math.sqrt(semiperim1 * (semiperim1 - a1) * (semiperim1 - b1) * (semiperim1 - c1));
		
		
	    
		perim2 = a2 + b2 + c2;
		
		semiperim2 = perim2 / 2;
		
		area2 = Math.sqrt(semiperim2 * (semiperim2 - a2) * (semiperim2 - b2) * (semiperim2 - c2));
		
		
	    if (area1 > area2) {
	    	System.out.print("Площадь первого треугольника больше");
	    }
	    
	    else if (area1 == area2) {
	    	System.out.print("Площади треугольников равны");
	    }
	    
	    else {
	    	System.out.print("Площадь второго треугольника больше");
	    }
	    
		
	}

}
