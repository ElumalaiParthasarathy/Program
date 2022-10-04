package com.programs;

import java.util.Scanner;

public class VoteAgeCheckApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		VotingEligibilityImplementation eligibilityImplementation = new VotingEligibilityImplementation();
		String check ;
		
		do {
		System.out.println("Please enter your age to check your eligibility to vote");
		int age = sc.nextInt();
		eligibilityImplementation.isEligible(age);
		
		System.out.println("do you want to check another yes/no: ");
		
		check = sc.next();
		}
		
		while(check.equalsIgnoreCase("yes"));
		sc.close();
		System.out.println("Thank for using the App");
	}

}
