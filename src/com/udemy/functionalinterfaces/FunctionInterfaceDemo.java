package com.udemy.functionalinterfaces;

import java.util.function.Function;

public class FunctionInterfaceDemo {

	/*
	 * Function Interface
	 * 
	 * Abstract method - apply
	 * 
	 * andThen()
	 * Ex : function.andThen(addSomeString).apply("tauqeer") 
	 * Explanation : executes outer function first & then executes inner function
	 * output : TAUQEER welcome
	 * 
	 * compose()
	 * Ex: System.out.println(function.compose(addSomeString).apply("tauqeer"));
	 * Explanation : executes inner function first & then executes outer function
	 * output : TAUQEER WELCOME
	 * 
	 */

	static Function<String, String> function = (name) -> name.toUpperCase();
	
	static Function<String,String> addSomeString = (name) -> name.concat(" welcome");

	public static void main(String[] args) {
		
		System.out.println(function.apply("ahmed"));
		
		System.out.println(function.andThen(addSomeString).apply("tauqeer"));
		
		System.out.println(function.compose(addSomeString).apply("tauqeer"));
		
	}

}
