package com.company.training.branching;

/* Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение 
«Пожароопасная ситуация », если температура в комнате превысила 60° С.
*/

public class Task25 {
	
	public static void main(String[] args) {
		
		double degrees;
		
		degrees = 61;
		
		String res = (degrees > 60) ? "Пожароопасная ситуация": "";
		
		System.out.print(res);
	}

}
