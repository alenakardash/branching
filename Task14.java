package com.company.training.branching;

// Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

public class Task14 {
	
	public static void main(String[] args) {
		
		int abc;
		int bac;
		int bca;
		
		
		abc = 30;		
		bac = 90;
		
		int sum;
		
		sum = abc + bac;
		
		if (sum < 180) {
			
			System.out.print("Треугольник существует");
			
			bca = 180 - sum;
			
			if (abc == 90 | bac == 90 | bca == 90) {
				
				System.out.print(", он прямоугольный");
			}
			
			else {
				System.out.print(", но он не прямоугольный");
			}
			
		}
		
		else {
			System.out.print("Треугольник не существует");
		}
		
	}


}
