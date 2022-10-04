package com.programs;

import java.awt.List;
import java.util.LinkedList;

public class Vowels {

	public static void removeVowels(String s) {
		System.out.println("Original String :\n"+s);
		String[] split = s.toLowerCase().split(" ");
		String rev="";
		String vowels="";

		for (int i = 0; i < split.length; i++) {
			String t= split[i];
			for (int j = t.length()-1; j >=0; j--) {
				char ch= t.charAt(j);
				rev=rev+ch;
			}
			rev=rev+" ";
		}

		vowels=rev.replaceAll("[a,e,i,o,u]", "");
		System.out.println("After reversing each word in string : \n"+rev);
		System.out.println("After removing Vowels : \n"+vowels);
		

	}



	public static void main(String[] args) {
		removeVowels("There is a vowel remove it");
		
	}
}
