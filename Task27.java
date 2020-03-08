package com.company.training.branching;

// Найти max{min(a, b), min(c, d)}.

public class Task27 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int d;
		int min1;
		int min2;
		int max;
		
		a = 1;
		b = 4;
		c = 6;
		d = 2;
		
		if (a == b) {
			min1  = a;
		}
		
		min1 = (a < b) ? a : b;
		
		if (c == d) {
			min2  = c;
		}
		
		min2 = (c < d) ? c : d;
		
		if (min1 == min2) {
			System.out.print("Минимальные значения функций равны");
			
		}
		
		max = (min1 > min2) ? min1 : min2;
		
		System.out.print(max + " - максимальное значение из минимальных значений двух функций");
		
		
	}

}
