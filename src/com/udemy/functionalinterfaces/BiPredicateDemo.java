package com.udemy.functionalinterfaces;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
	
	
	/*
	 * similar to predicate only difference is predicate takes one input & \
	 * BiPridate takes 2 inputs
	 */
	
	
	static BiPredicate<Integer,Double> biPredicate = (marks,gpa) ->marks>40 && gpa >3.0;
	
	public static void main(String[] args) {
		
		if(biPredicate.test(30, 4.0)) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}
	}

}
