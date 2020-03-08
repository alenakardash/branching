package com.company.training.branching;

// Составить программу, которая определит площадь какого круга меньше.

public class Task10 {
	
	public static void main(String[] args) {
		
		double r1;
		double r2;
		
		r1 = 4;
		r2 = 5;
		
		double area1;
		double area2;
		
		if (r1 > 0 && r2 > 0) {
			
			area1 = Math.PI * Math.pow(r1, 2);
			area2 = Math.PI * Math.pow(r2, 2);
			
			if (area1 < area2) {
				System.out.print("Площадь первого круга меньше");
			}
			
			else if (area1 == area2) {
				System.out.print("Площади кругов равны");
			}
			else {
				System.out.print("Площадь второго круга меньше");
			}
		}
		else if (r1 <= 0){
			System.out.print("Круга с радиусом " + r1 + " не существует");
			
		}
		
		else {
			System.out.print("Круга с радиусом " + r2 + " не существует");
		}
	}

}
