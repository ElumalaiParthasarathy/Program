package com.programs;

import java.util.Scanner;

public class DecendingSort {

	
	public static void main(String[] args) {
		//descending
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number of elements to sort");
		int arrl = sc.nextInt();
		int arr[] = new int [arrl];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Inserted elements : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		for (int j = 0; j < arr.length; j++) {
			for (int k = j+1; k < arr.length; k++) {
				if(arr[j]<arr[k]) {
					int swap = arr[k];
					arr[k] = arr[j];
					arr[j]=swap;
				}
			}
		}
		System.out.println("");
		System.out.print("Sorted elements : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		sc.close();

	}
}
