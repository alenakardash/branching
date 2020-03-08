package com.company.training.branching;

import java.util.Scanner;

/* Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). Если введены 
некорректные данные, то сообщить об этом.
*/

public class Task23 {
	
	public static void main(String[] args) {
		
		int day;
		int month;
		
		int error;
		error = 0;
		
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		
	    System.out.println("Введите день: ");
	    
		while(!sc1.hasNextInt()) {
			
			System.out.println("Вы ввели не число. Введите число: ");
			
			sc1.next();
			
		}
	    
	    day = sc1.nextInt();
	    
	    if (day < 1  || day > 31) {
	    	
	    System.out.println("Дата неправильная. Число не может быть больше 31 или меньше 1");
	    error++;
	    }
	    
	    @SuppressWarnings("resource")
        Scanner sc2 = new Scanner(System.in);
		
	    System.out.println("Введите месяц: ");
	    
		while(!sc2.hasNextInt()) {
			
			System.out.println("Вы ввели не число. Введите число: ");
			
			sc2.next();
			
		}
	    
	    month = sc2.nextInt();
	    
	    
	    if (month < 1 || month > 12) {	    	
	    	System.out.println("Дата неправильная. Месяц не может быть больше 12 или меньше 1");
	    	error++;
	    	}
	    
	    
	    if (day == 31 && (month == 4 || month == 6 || month == 9 || month == 11)) {
	    	System.out.println("Дата неправильная. В " + month + " месяце 30 дней");
	    	error++;
	    }
	    	
	    if (month == 2 && (day == 30 | day == 31)) {
	    	System.out.println("Дата неправильная. В " + month + " месяце не может быть больше 29 дней");
	    	error++;
	    }
	    	
	    if (error == 0) {
	    	System.out.print("Введенная дата - правильная");
	    	
	    }
	    
	    
	    }
	    	
}


