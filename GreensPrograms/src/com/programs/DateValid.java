package com.programs;

public class DateValid {
	//08/12/2020
	
	public static void isValidDate(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j <0; j++) {
				System.out.print(" ");
				
			}
			for(int k =1;k<=5;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		
		
	}
	public static void main(String[] args) {
		isValidDate(5);
	}

}
