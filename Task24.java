package com.company.training.branching;

/* Составить программу, определяющую результат гадания на ромашке — «любит—не любит», взяв за исходное данное 
количество лепестков n.
*/

public class Task24 {
	
	public static void main(String[] args) {
		
		int n;
		
		n = 10;
		
		if (n == 0) {
			
			System.out.print("Возьмите ромашку с лепестками");
			
			System.exit(0);
		}
		
	String result =	(n % 2 == 0) ? "любит" : "не любит";
	
	System.out.print(result);
	}

}
