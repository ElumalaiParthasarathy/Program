package com.programs;

public class RevereseAString {
	
	public static void isPanagram(String original) {
		String reverse="";
		
	int length=original.length();
	for (int i = length-1; i >=0; i--) {
		reverse = reverse+original.charAt(i);
		
	}
	if(reverse.equalsIgnoreCase(original)) {
		System.out.println("It is panagram");
	}else {
		System.out.println("It is not panagram");
	}
		
	}
	public static void removeSpecial(String s) {
		String removedSpecial = s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(removedSpecial);
		
	}
	
		public static void main(String[] args) {
			
			isPanagram("gig");
			removeSpecial("d");
		
	}
}
