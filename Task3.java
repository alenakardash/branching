package com.company.training.branching;

import java.util.Scanner;

/* Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», 
если число а меньше 3; если больше, то вывести слово «no».
*/

public class Task3 {
	
	public static void main(String[] args) {
		
		int x;
		
		x = 3;
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число: ");
	
		
		while (!sc.hasNextInt()) {
			
			System.out.println("Вы ввели не число. Введите число: ");
			sc.next();
			
		}
		
		
		if (sc.hasNextInt()) {
			
			a = sc.nextInt();
			
			if (a < x) {
				System.out.print("yes");
			}
			
			else {
				System.out.print("no");
			}
		}
		
		sc.close();
		
				
			}
		}

		
	


