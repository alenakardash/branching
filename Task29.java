package com.company.training.branching;

// 29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Task29 {
	
	public static void main(String[] args) {
		
		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;
		
		x1 = 5;
		x2 = 8;
		x3 = 10;
		y1 = 3;
		y2 = 5;
		y3 = 11;
		
		
		double ab;
		double ac;
		double bc;
		
		
		ab = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		
		ac = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
		
		bc = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		
		double semiperim;
		
		semiperim = (ab + ac + bc) / 2;
		
		double area;
		
		area = Math.sqrt(semiperim * (semiperim - ab) * (semiperim - ac) * (semiperim - bc));
		
		
		if (area == 0) {
			
			System.out.print("Точки лежат на одной линии");
		}
		
		else {
			
			System.out.print("Точки не лежат на одной линии");
			
		}
		
		
	}

}
