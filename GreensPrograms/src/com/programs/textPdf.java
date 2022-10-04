package com.programs;


import java.util.Scanner;



public class textPdf {
	
public static void isValidDate(String date) {
	
	try {
		String[] split = date.split("/");
		
		
		int Date = Integer.parseInt(split[0]);
		int month = Integer.parseInt(split[1]);
		int year = Integer.parseInt(split[2]);
		int flag=0;
		
		
			if(Date>00&&Date<=31&&month>00&&month<=12&&year>0000) {
				flag=1;
			}
			if (Date <=12) {
				if(month<=12) {
					flag=1;
				}
			}
		
		if (flag==1) {
			System.out.println("VALID DATE");
		}else {
			System.out.println("INVALID DATE");
		}
		
	}catch(Throwable ae){
		System.out.println("INVALID DATE");
		
	}
	 
	
	}

	
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the date: "+" in format   DD/MM/YYYY");
	String date = scanner.next();
	isValidDate(date);
	
	
	
	scanner.close();
}
}
