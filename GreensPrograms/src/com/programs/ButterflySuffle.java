package com.programs;

public class ButterflySuffle {
public static void main(String[] args) {
	 int arr[] = {1,2,3,4,5,6,7,8,9,10};
	 int len = arr.length/2;
	 for (int i = len-1; i >=0; i--) {
		 System.out.println(arr[i]+" ");
		
	}
	 for (int i = arr.length-1; i >=len; i--) {
		System.out.println(arr[i]+" ");
	}
}
}
