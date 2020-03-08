package com.company.training.branching;

import java.util.Scanner;

/* Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер запрашивает стоимость книг, сумму денег, 
внесенную покупателем; если сдачи не требуется, печатает на экране «спасибо»; если денег внесено больше, чем необходимо, то печатает 
«возьмите сдачу» и указывает сумму сдачи; если денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
 */


public class Task34 {
	
	public static void main(String[] args) {
		
		int price;
		int sum;
		int change;
		int insufficient;
		
		price = 34;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Стоимость книги составляет " + price + "$. Внесите платеж: ");
		
		while(!sc.hasNextInt()) {
			
			System.out.println("Не нужно слов. Допустимы только цифровые денежные знаки. Внесите платеж: ");
			
			sc.next();
		}
		
		sum = sc.nextInt();
		
		if (sum > price) {
			
			change = sum - price;
			
			System.out.println("Возьмите сдачу " + change + "$");
		}
		
		else if (sum == price) {
			
			System.out.println("Спасибо");
		}
		
		else {
			insufficient = price - sum;
			
			System.out.println("Недостаточно средств. Внесите еще " + insufficient + "$");
			
		}
	}

}
