package com.programs;

public class VotingEligibilityImplementation implements VotingEligibility {

	@Override
	public void isEligible(int age) {
		if(age>= 18) {
			System.out.println("You're eligilble for voting");
		}
		else {
			System.out.println("You're not eligible for voting. \nPlease wait for "+(18-age)+" years");
		}
	}

}
