package com.udemy.functionalinterfaces;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {

		/*
		 * BiConsumer taking two arguments
		 */
		BiConsumer<String, String> fullName = (fName, lName) -> System.out.println("Full Name :" + fName + lName);

		fullName.accept("tauqeer", "ahmed");

		/*
		 * andThen can be used to chain BiConsumers
		 */

	}
}
