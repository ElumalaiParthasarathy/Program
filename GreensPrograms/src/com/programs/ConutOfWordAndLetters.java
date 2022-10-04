package com.programs;

import java.util.HashMap;
import java.util.Scanner;


public class ConutOfWordAndLetters {

	public static HashMap<Character,Integer> countOfLetter(String s) {

		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		char[] characters = s.replace(" ", "").toCharArray();
		for (char c : characters) {
			if (hashMap.containsKey(c)) {

				int x = hashMap.get(c);
				hashMap.put(c, x+1);

			}else {
				hashMap.put(c, 1);
			}

		}
		return hashMap;
	}



	public static HashMap<String, Integer> contOfEachWord(String s) {

		HashMap<String, Integer>hashMap = new HashMap<String, Integer>();
		String[] words = s.split(" ");
		for (String string : words) {
			if(hashMap.containsKey(string)) {

				int x = hashMap.get(string);
				hashMap.put(string, x+1);
			}else {
				hashMap.put(string, 1);
			}
		}

		return hashMap;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the String ");
		String input = scanner.nextLine();
		System.out.println(countOfLetter(input));
		System.out.println(contOfEachWord(input));
		scanner.close();
	}

}
