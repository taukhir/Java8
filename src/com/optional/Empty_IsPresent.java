package com.optional;

import java.util.Optional;

public class Empty_IsPresent {

	public static void main(String[] args) {

		/*
		 * 
		 * ****** empty() **********
		 * Optional.empty() -> The empty() method of java.util.Optional class in Java is
		 * used to get an empty instance of this Optional class. This instance do not
		 * contain any value.
		 * 
		 * This method returns an empty instance of this Optional class.
		 */
		Optional<String> opt = Optional.empty();

		/*
		 * 
		 * ****** isPresent() ********
		 * isPresent() -> The isPresent() method of java.util.Optional class in Java is
		 * used to find out if there is a value present in this Optional instance. If
		 * there is no value present in this Optional instance, then this method returns
		 * false, else true.
		 * 
		 * This method returns a boolean value stating whether if there is a value
		 * present in this Optional instance.
		 */
		System.out.println(opt.isPresent());
	}

}
