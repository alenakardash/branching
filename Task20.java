package com.company.training.branching;

// Определить, делителем каких чисел а, b, с является число k.

public class Task20 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int k;
		
		a = 10;
		b = 22;
		c = 35;
		k = 5;
		
		if (k == 0) {
			System.out.print("На ноль делить нельзя!");
			System.exit(0);
		}
		
		
		if (a % k == 0) {
			System.out.println("k - делитель числа а");
		}
		
		if (b % k == 0) {
			System.out.println("k - делитель числа b");
		}
		
		if (c % k == 0) {
			System.out.print("k - делитель числа c");
		}
		
		if (!(a % k == 0 || b % k == 0 || c % k == 0)) {
			System.out.print("k не является делителем ни для одного числа");
		}
		
		

	}

}
