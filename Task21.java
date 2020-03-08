package com.company.training.branching;

import java.util.Scanner;

/* Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». В зависимости от ответа на экране 
должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».
*/

public class Task21 {
	
	public static void main(String[] args) {
		
		String input;
		
		@SuppressWarnings("resource")
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Кто ты: мальчик или девочка? Введи Д или М: ");
		
		 
		input = sc.nextLine();
		
	
		while(!(input.equalsIgnoreCase("Д") || input.equalsIgnoreCase("М"))) {
			
			System.out.print("Допустимые значения - Д или М. Попробуй еще раз. Введи Д или М: ");
			
			input = sc.nextLine();
			
			}
	
		
		input = input.toLowerCase();
		
		
		switch(input) {
		
		case "д":
			System.out.print("Мне нравятся девочки!");
			break;
			
		case "м":
			System.out.print("Мне нравятся мальчики!");
			break;
			
		default:
			System.out.print("Введено неверное значение");
			
		}
		
		}

}
