package com.company.training.branching;

// Составить программу: определения наибольшего из двух чисел а и b.

public class Task6 {
	
	public static void main(String[] args) {
	
	 int a = -8;
	 int b = -89;
	
	 if (a > b) {
		 System.out.print(a + " - наибольшее число");
	 }
	
	 else if (a == b) {
		 System.out.print("Числа равны");
	 }
	 else {
		 System.out.print(b + " - наибольшее число");
	 }
	
   }

}
