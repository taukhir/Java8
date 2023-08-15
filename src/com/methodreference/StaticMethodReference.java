package com.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;

interface Say {

	void sayable();
}

public class StaticMethodReference {

	public static int addition(int a, int b) {
		return a + b;
	}

	public static void greet() {
		System.out.println("Welcome to Static Method Reference Class");
	}

	public static void main(String[] args) {
		/*
		 * static method reference
		 * 
		 * If a lambda expression just call a static method of a class (args) ->
		 * Class.staticMethod(args)
		 * 
		 * Shorthand if a lambda expression just call a static method of a class
		 * Class::staticMethod
		 */

		/*
		 * 1. static method reference to a static method of a class
		 */
		BiFunction<Integer, Integer, Integer> addition = StaticMethodReference::addition;
		System.out.println(addition.apply(1, 2));

		/*
		 * 2. static method reference to inbuilt classes
		 */
		Function<Integer, Double> sqrt = Math::sqrt;
		System.out.println(sqrt.apply(2));

		/*
		 * 3. static method reference collecting with custom interface
		 */
		Say greetings = StaticMethodReference::greet;
		greetings.sayable();
	}

}
