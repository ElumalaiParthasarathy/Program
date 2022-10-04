package com.programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOfEachWord {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The string : ");
		String s = scanner.nextLine();
		String[] split =s.split(" ");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		for (String string : split) {
			if(map.containsKey(string)) {
				Integer count = map.get(string);
				count++;
				map.put(string, count);
			}
			else {
				map.put(string, 1);

			}
		}
		System.out.println(map);
		
		
		System.out.println("Enter The string : ");
		
		String s1 = scanner.nextLine();
		s1=s1.replace(" ", "");
		Map<Character, Integer> map1 = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			char c =s1.charAt(i);
			if(map1.containsKey(c)) {
				Integer characterCount = map1.get(c);
				characterCount++;
				map1.put(c, characterCount);
			}else {
				map1.put(c, 1);
			}
		}
		System.out.println(map1);
		scanner.close();
		
		
	}

}
