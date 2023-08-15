package com.methodreference;

import java.util.function.BiFunction;

@FunctionalInterface
interface VoterValidation {

	int voterAgeValidation();
}

interface Sayable {
	void saySometging();
}

public class InstanceMethodReference {

	void appInfo() {
		System.out.println("Voting Application");
	}

	int addition(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		/*
		 * 1. instance method within classes - Referring non-static method using
		 * reference
		 */

		InstanceMethodReference instanceReference = new InstanceMethodReference();
		Sayable appInfo = instanceReference::appInfo;
		appInfo.saySometging();

		/*
		 * 2. instance method within classes - Referring non-static method using
		 * anonymous object
		 */

		Sayable appInfoTwo = new InstanceMethodReference()::appInfo;
		appInfoTwo.saySometging();

		BiFunction<Integer, Integer, Integer> adding = new InstanceMethodReference()::addition;
		System.out.println(adding.apply(1, 2));
	}

}
