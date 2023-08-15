package com.udemy.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateDemo {

	/*
	 * predicate is basically used for conditions
	 */

	static Predicate<Integer> ageValidate = age -> age > 18;

	/*
	 * and, or - methods for chaining predicate, negate - for reversing result , test
	 * - to accept args and executer predicate statement
	 */

	public static void main(String[] args) {

		System.out.println(ageValidate.test(20));
	}

}
