package com.programs;


import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public void isAnagram(String s, String s1) {

		char arr[] = s.toCharArray();
		char arr1[] = s1.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr);



		boolean	status = Arrays.equals(arr, arr1);


		if (status) {
			System.out.println("it is anagram");
		}
		else {
			System.out.println("not anagram");
		}


	}
	public static void main(String[] args) {
		Anagram anagram = new Anagram();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the first word : ");
		String s1 =  scanner.next();
		System.out.println("Enter the second word : ");
		String s2 =  scanner.next();
		
		anagram.isAnagram(s1, s2);
		
		scanner.close();
	}



}
