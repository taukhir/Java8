package com.streams;

@FunctionalInterface
interface VotingAllowed {

	boolean canVote(int age);

	static void votingInfo() {

		System.out.println("Citizens can cast vote only if he/she is over 18");

	}
	
	
	
}

interface DefaultMethodSample {

	default void defaultMethod() {
		System.out.println("Deault method sample");
	}
	
	

}


interface Lambda{
	
	void welcome();
}

public class StreamsDemo implements DefaultMethodSample {

	public static void main(String[] args) {
		
		System.out.println("==========================================");
		System.out.println("Lambda Non Parameterized");
		Lambda welcome2App = () -> System.out.println("Welcome to Stream's Demo App");
		welcome2App.welcome();
		System.out.println("==========================================");

		System.out.println("==========================================");
		System.out.println("Arrow Functions/Lambda Functions");
		VotingAllowed isValid = age -> age > 18;
		System.out.println(isValid.canVote(20));
		System.out.println("==========================================");
		
		
		System.out.println("==========================================");
		System.out.println("Static methods in interface");
		VotingAllowed.votingInfo();
		System.out.println("==========================================");
		
		
		System.out.println("==========================================");
		System.out.println("Default methods in interface");
		new StreamsDemo().defaultMethod();
		System.out.println("==========================================");

	}

}
