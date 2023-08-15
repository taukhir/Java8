package com.optional;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Optional.of() -> The of() method of java.util.Optional class in Java is used
		 * to get an instance of this Optional class with the specified value of the
		 * specified type.
		 * 
		 * This method returns an instance of this Optional class with the specified
		 * value of the specified type.
		 */
		Optional<String> gender = Optional.of("male");
		String op1 = "Yes";
		String op2 = null;

		System.out.println("Non-Empty Optional:" + gender);

		/*
		 * get() -> The get() method of java.util.Optional class in Java is used to get
		 * the value of this Optional instance. If there is no value present in this
		 * Optional instance, then this method throws NullPointerException.
		 * 
		 * This method returns the value of this instance of the Optional class.
		 */
		System.out.println("Non-Empty Optional: Gender value : " + gender.get());

		/*
		 * ofNullable() -> The ofNullable() method of java.util.Optional class in Java
		 * is used to get an instance of this Optional class with the specified value of
		 * the specified type. If the specified value is null, then this method returns
		 * an empty instance of the Optional class.
		 * 
		 * This method returns an instance of this Optional class with the specified
		 * value of the specified type. If the specified value is null, then this method
		 * returns an empty instance of the Optional class.
		 */
		System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(op1));
		System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(op2));

		/*
		 * Optional.empty() -> The empty() method of java.util.Optional class in Java is
		 * used to get an empty instance of this Optional class. This instance do not
		 * contain any value.
		 * 
		 * This method returns an empty instance of this Optional class.
		 */
		Optional<String> opt = Optional.empty();

		/*
		 * isPresent() -> The isPresent() method of java.util.Optional class in Java is
		 * used to find out if there is a value present in this Optional instance. If
		 * there is no value present in this Optional instance, then this method returns
		 * false, else true.
		 * 
		 * This method returns a boolean value stating whether if there is a value
		 * present in this Optional instance.
		 */
		System.out.println(opt.isPresent());

		/*
		 * ifPersent() -> The ifPresent API enables us to run some code on the wrapped
		 * value if it is found to be non-null.
		 */
		Optional<String> ifPresentDemo = Optional.of("ahmed");
		ifPresentDemo.ifPresent(val -> {
			/*
			 * some logic
			 */
			System.out.println("ifPresent<Consumer> : " + val);
		});

		/*
		 * orElse() -> The orElse() method of java.util.Optional class in Java is used
		 * to get the value of this Optional instance, if present. If there is no value
		 * present in this Optional instance, then this method returns the specified
		 * value.
		 * 
		 * This method returns the value of this Optional instance, if present. If there
		 * is no value present in this Optional instance, then this method returns the
		 * specified value.
		 */
		OptionalInt intDemoOne = OptionalInt.of(30);
		OptionalInt intDemoTwo = OptionalInt.empty();
		System.out.println("orElse() if Optional is empty" + intDemoOne.orElse(0));
		System.out.println("orElse() if Optional is non-empty" + intDemoTwo.orElse(20));

		/*
		 * orElseGet() -> The orElseGet() method of java.util.Optional class in Java is
		 * used to get the value of this Optional instance if present. If there is no
		 * value present in this Optional instance, then this method returns the value
		 * generated from the specified supplier.
		 * 
		 * This method returns the value of this Optional instance, if present. If there
		 * is no value present in this Optional instance, then this method returns the
		 * value generated from the specified supplier.
		 */
		String nullName = null;
		String name = Optional.ofNullable(nullName).orElseGet(() -> "Ramesh");
		System.out.println(name);
		
		/*
		 * 
		 */
	}

}
