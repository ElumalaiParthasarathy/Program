package com.programs;

import java.util.Scanner;

public class Palindrome {

	public static String isPalindromeWord(String original) {
		String reverse = "";

		int length = original.length();
		for (int i = length-1; i >=0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if (original.equalsIgnoreCase(reverse)) {
			return "It is palindrome";
		}else {
			return "It is not palindrome";
		}


	}
	public static String isPalindromeNumber(int n) {
		int i,a,j=0;
		a=n;
		while(a>0) {
			i = a%10; 
			j= (j*10)+i;
			a = a/10;
		}

		if(n==j) {
			return " It is palindrome";
		}else {
			return "It is not palindrome";
		}

	}

	public static void main(String[] args) {
		String c;
		Scanner scanner = new Scanner(System.in);
		do {
			
			System.out.println("Enter the number or word to check wheather it's palindrome or Not!");
			String check = 	scanner.nextLine();
			System.out.println(isPalindromeWord(check));
			System.out.println("if you want to check another then type Y \n If want to  close  type N");
			c =scanner.nextLine();
		} while (c.equalsIgnoreCase("Y"));
		System.out.println("Thank You for using");
		scanner.close();
		
		
	}
}
