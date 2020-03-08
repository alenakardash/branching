package com.company.training.branching;

import java.util.Scanner;

// Составить программу: равны ли два числа а и b?

public class Task4 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		
		Scanner sc1 = new Scanner(System.in);
		
		Scanner sc2 = new Scanner(System.in);
		
		
		System.out.println("Введите первое число: ");
		
		
		while(!sc1.hasNextInt()) {
			
			System.out.println("Вы ввели не число. Введите число: ");
			sc1.next();
			
		}
		
		a = sc1.nextInt();
		
		sc1.close();
		
		System.out.println("Введите второе число: ");
		
		while(!sc2.hasNextInt()) {
			
			System.out.println("Вы ввели не число. Введите число: ");
			
			sc2.next();
			
		}
		
		b = sc2.nextInt();
		
		sc2.close();
		
		
		if (a == b) {
			System.out.println("Числа равны");
		}
		
		else {
			System.out.println("Числа не равны");
		}
		
		
		}

}
