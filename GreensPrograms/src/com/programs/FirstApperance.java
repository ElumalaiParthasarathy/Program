package com.programs;


import java.util.Collections;
import java.util.HashSet;

public class FirstApperance {
	
	public static void first(String s) {
		
		char[] charArray = s.toLowerCase().toCharArray();
		
		HashSet<Character> characters = new HashSet<Character>();
		for (char character : charArray) {
			if(characters.contains(character)) {
				System.out.println("first repeating character is "+ character);
				break;
			}else {
				characters.add(character);
			}
			
		}
		System.out.println("No repeating character");
		
	}
	
	public static void main(String[] args) {
		first("zabcfza");
		
		
	}

}
