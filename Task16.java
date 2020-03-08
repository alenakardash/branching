package com.company.training.branching;

// На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком координатном угле).

public class Task16 {
	
	public static void main(String[] args) {
		
		int x;
		int y;
		
		x = 10;
		y = -20;
		
		if (x > 0) {
			if (y > 0) {
				System.out.print("Точка находится в первом координатном углу");
			}
			
			else if (y < 0) {
				System.out.print("Точка находится в четвертом координатном углу");
			}
			
			else {
				System.out.print("Точка находится на оси X");
			}
		}
		
		else if (x < 0) {
			if (y > 0) {
				System.out.print("Точка находится во втором координатном углу");
			}
			
			else if (y < 0) {
				System.out.print("Точка находится во третьем координатном углу");
			}
			
			else {
				System.out.print("Точка находится на оси X");
			}
		}
		
		else if (x == 0 && y == 0) {
			
			System.out.print("Точка находится в начале координат");
			}
		
		else {
			System.out.print("Точка находится на оси Y");
		}
	}

}
