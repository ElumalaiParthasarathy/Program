package com.programs;

import java.util.Scanner;

public class OddEvenFinderInRange {

	public static void main(String[] args) {
		int evenCount =0;
		int oddCount=0;
		int sumOdd=0;
		int sumEven=0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the limit to find odd and even numbers in between :");
		int n = sc.nextInt();

		for(int i=1; i<=n;i++) {
			if(i%2==0) {
				System.out.print("Even number : "+i+"|");
				evenCount++;
				sumEven+=i;
			}
			else {
				System.out.println(" odd number : "+i+"|");
				oddCount++;
				sumOdd+=i;
			}
		}
		System.out.println();	
		System.out.println("Total number of even numbers :"+evenCount+"\nSum of Even numbers :"+sumEven);
		System.out.println();
		System.out.println("Total number of odd numbers :"+oddCount+"\nSum of Odd numbers :"+sumOdd);
		sc.close();
		
		
		
		
	}

}
