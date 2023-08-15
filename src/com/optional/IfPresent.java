package com.optional;

import java.util.Optional;

public class IfPresent {

	public static void main(String[] args) {

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
	}

}
