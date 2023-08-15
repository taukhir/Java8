package com.optional;

import java.util.Optional;

public class OrElseGet_OrElseThrow {

	public static void main(String[] args) {

		/*
		 * 
		 * ***** orElseGet() ******* orElseGet() -> The orElseGet() method of
		 * java.util.Optional class in Java is used to get the value of this Optional
		 * instance if present. If there is no value present in this Optional instance,
		 * then this method returns the value generated from the specified supplier.
		 * 
		 * This method returns the value of this Optional instance, if present. If there
		 * is no value present in this Optional instance, then this method returns the
		 * value generated from the specified supplier.
		 */
		String nullName = null;
		String name = Optional.ofNullable(nullName).orElseGet(() -> "ahmed");
		System.out.println(name);

		/*
		 * ***** orElseThrow() ***** The orElseThrow() method of java.util.Optional
		 * class in Java is used to get the value of this Optional instance if present.
		 * If there is no value present in this Optional instance, then this method
		 * throws the exception generated from the specified supplier.
		 * 
		 * This method returns the value of this Optional instance, if present. If there
		 * is no value present in this Optional instance, then this method throws the
		 * exception generated from the specified supplier.
		 */
		String fName = null;
		System.out.println(Optional.ofNullable(fName).orElseThrow(NullPointerException::new));

	}

}
