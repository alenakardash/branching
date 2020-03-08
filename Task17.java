package com.company.training.branching;

/* Даны целые числа m, n. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему из исходных, 
а если равны, то заменить числа нулями.
*/

public class Task17 {
	
	public static void main(String[] args) {
		
		int m = 15;
		int n = 5;
		
		if (m == n) {
			m = 0;
			n = 0;
		}
		
		else {
			if (m > n) {
				n = m;
			}
			
			else {
				m = n;
			}
		}
		
		System.out.println("m = " + m);
		
		System.out.println("n = " + n);
	}

}
