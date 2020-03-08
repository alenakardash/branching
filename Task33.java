package com.company.training.branching;

import java.util.Scanner;

/* Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации в базе данных.
 Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа. Они имеют следующие пароли: 9583, 1747
  — доступны модули баз А, В, С; 3331, 7922 — доступны модули баз В, С; 9455, 8997 — доступен модуль базы С.
*/

public class Task33 {
	
	public static void main(String[] args) {
		
		int abc1 = 9583;
		int abc2 = 1747;
		int bc1 = 3331;
		int bc2 = 8997;
		int c1 = 9455;
		int c2 = 8997;
		
		int password;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите пароль: ");
		
		while(!sc.hasNextInt()) {
			
			System.out.println("Пароль включает только цифры. Введите пароль: ");
			
			sc.next();
		}
		
		password = sc.nextInt();
		
		if (password == abc1 | password == abc2) {
			System.out.println("Доступны модули баз А, В, С");
		}
		
		else if (password == bc1 | password == bc2) {
			System.out.println("Доступны модули баз В, С");
		}
		
		else if (password == c1 | password == c2) {
			System.out.println("Доступны модули базы С");
		}
		
		else {
			System.out.println("Введен неверный пароль. Модули баз недоступны.");
		}
		
		sc.close();
		
	}

}
