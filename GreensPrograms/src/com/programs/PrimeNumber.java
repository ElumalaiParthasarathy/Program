package com.programs;

public class PrimeNumber {
	
	public static void isPrimeNumber(int num) {
		int flag=0;
		for(int i=2;i<=num/2;i++) {
			if(num%i == 0) {
				flag=1;
			}
		}
		if (flag==0) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
		
		
		
	}

	public static void main(String[] args) {
		
		for (int i = 0; i <=15; i++) {
			isPrimeNumber(i);
		}
		
		
		

	}

}
