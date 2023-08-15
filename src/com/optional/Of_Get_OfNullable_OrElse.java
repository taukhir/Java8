package com.optional;

import java.util.Optional;

public class Of_Get_OfNullable_OrElse {

	public static void main(String[] args) {

		/*
		 ******** Optional.of ***********
		 * Optional.of() -> The of() method of java.util.Optional class in Java is used
		 * to get an instance of this Optional class with the specified value of the
		 * specified type.
		 * 
		 * This method returns an instance of this Optional class with the specified
		 * value of the specified type.
		 */
		
		Optional<String> optVals = Optional.of("ahmed");
		
		/*
		 * ofNullable() & orElse()
		 * 
		 ****** ofNullable ********
		 * 
		 * ofNullable() -> The ofNullable() method of java.util.Optional class in Java
		 * is used to get an instance of this Optional class with the specified value of
		 * the specified type. If the specified value is null, then this method returns
		 * an empty instance of the Optional class.
		 * 
		 * This method returns an instance of this Optional class with the specified
		 * value of the specified type. If the specified value is null, then this method
		 * returns an empty instance of the Optional class.
		 * 
		 * 
		 ****** orElse *********
		 * 
		 * orElse() -> The orElse() method of java.util.Optional class in Java is used
		 * to get the value of this Optional instance, if present. If there is no value
		 * present in this Optional instance, then this method returns the specified
		 * value.
		 * 
		 * This method returns the value of this Optional instance, if present. If there
		 * is no value present in this Optional instance, then this method returns the
		 * specified value.
		 */
		System.out.println(Optional.ofNullable(optVals).orElse(Optional.of("default")));
		System.out.println(optVals.get());
	}

}
