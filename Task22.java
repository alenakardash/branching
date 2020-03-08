package com.company.training.branching;

// Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.

public class Task22 {
	
	public static void main(String[] args) {
		
		int x = 40;
		int y = 100;
		
		int temp;
		
		temp = x;
		
		
		if (x < y) {
			x = y;
			y = temp;
		}
		

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}

}
