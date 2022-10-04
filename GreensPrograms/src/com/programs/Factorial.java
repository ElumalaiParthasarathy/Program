package com.programs;

import java.util.Scanner;

public class Factorial {
	public long factorial(long num) {
		int fact = 1;

		for (int i = 1; i <=num; i++) {
			fact *=i;
		}
		return fact;	
	}

	public static void main(String[] args) {
		String check;
		Scanner scanner = new Scanner(System.in);
		do{
			
		System.out.println("Enter the number to find factorial :");
		
		int a =scanner.nextInt();
		Factorial factorial = new Factorial();

		long result = factorial.factorial(a);
		System.out.println("The factorial of "+a+" is : "+result);

		System.out.println("Do you want to check  factorial for another number \ntype: yes/no");
		check=scanner.next();

		}while(check.equalsIgnoreCase("yes"));
		scanner.close();
		System.out.println("Thank you");
	}
}
