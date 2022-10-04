package com.programs;

import java.util.Scanner;

public class IndexOfTargetSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the array size");
		int arrl = sc.nextInt();
		System.out.println("Please enter the target value");
		int targetValue = sc.nextInt();
		int arr[] = new int [arrl];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if((arr[i]+arr[j])==targetValue) {
					System.out.println("index of sum values is "+ i + " "+(j));
				}
			}
			sc.close();
		}
		
	}

}
