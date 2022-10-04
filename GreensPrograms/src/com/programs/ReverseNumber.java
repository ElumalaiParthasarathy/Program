package com.programs;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i,a,j=0;
		System.out.println("Enter the number to reverse :");
		int n = scanner.nextInt();
		a=n;
		while(a>0) {
			i = a%10; 
			j= (j*10)+i;
			a = a/10;
		}
		System.out.println("Reversed number is :"+j);
		scanner.close();
		
		if (j==n) {
			System.out.println(j +" is a palindrome ");
		}
		else {
			System.out.println(j+" its not a palindrome");
		}
		System.out.println(4%2+" " +4/2);
	}
	

}
