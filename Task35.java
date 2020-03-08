package com.company.training.branching;

// Вычислить число и месяц в невисокосном году по номеру дня.

public class Task35 {
	
	public static void main(String[] args) {
		
		int x;
		x = 365;
		
		String month;
		int day;
		
		month = "";
		day = 0;
		
		if (x >= 1 && x <= 31) {
			month = "Январь";
			day = x;
		}
		
		else if (x >= 32 && x <= 59) {
			month = "Февраль";
			day = x - 31;
		}
		
		else if (x >= 60 && x <= 90) {
			month = "Март";
			day = x - 59;
		}
		
		else if (x >= 91 && x <= 120) {
			month = "Апрель";
			day = x - 90;
		}
		
		else if (x >= 121 && x <= 151) {
			month = "Май";
			day = x - 120;
		}
		
		else if (x >= 152 && x <= 182) {
			month = "Июнь";
			day = x - 151;
		}
		
		else if (x >= 183 && x <= 213) {
			month = "Июль";
			day = x - 182;
		}
		
		else if (x >= 214 && x <= 244) {
			month = "Август";
			day = x - 213;
		}
		
		else if (x >= 245 && x <= 274) {
			month = "Сентябрь";
			day = x - 244;
		}
		
		else if (x >= 275 && x <= 304) {
			month = "Октябрь";
			day = x - 274;
		}
		
		else if (x >= 305 && x <= 334) {
			month = "Ноябрь";
			day = x - 304;
		}
		
		else if (x >= 335 && x <= 365) {
			month = "Декабрь";
			day = x - 334;
		}
		
		else {
			System.out.print("Введен неверный день. День может быть от 1 до 365");
		}
		
		System.out.println("месяц - " + month);
		System.out.println("день - " + day);
		
	}

}
