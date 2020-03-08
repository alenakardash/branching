package com.company.training.branching;

// Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d — c).

public class Task28 {
	
	public static void main(String[] args) {
		int a, b, c, d;
		
		a = 8;
		b = 6;
		c = 6;
		d = 7;
		
		if (a == d || b == d || c == d) {
			
			if (a == d) {
				System.out.println("a = d = " + d);
			}
			
			if (b == d) {
				System.out.println("b = d = " + d);
			}
			
			if (c == d) {
				System.out.println("c = d = " + d);
			}
		
				}
		
		else {
			
			int max;
			
			int temp1, temp2, temp3;
			
			temp1 = d - a;
			temp2 = d - b;
			temp3 = d - c;
			
			if (temp1 > temp2 && temp1 > temp3) {
				
				max = temp1;
			}
			
			else if (temp2 > temp1 && temp2 > temp3) {
				
				max = temp2;
			}
			
			else if (temp3 > temp1 && temp3 > temp2){
				
				max = temp3;
			}
			
			else if (temp1 == temp2){
				
					if (temp1 > temp3) {
						
						max = temp1;
					}
					
					else {
						
						max = temp3;
					}
				}
					
				else if (temp1 == temp3) {
					
						if (temp1 > temp2) {
							
							max = temp1;
						}
						
						else {
							max = temp2;
						}
				}
				 else {
					 
					if (temp2 > temp1) {
						
						max = temp2;
					}
					
					else {
						max = temp1;
					}
				}	
			
			
			System.out.print("max = " + max);
			
		}

	  }
	}
