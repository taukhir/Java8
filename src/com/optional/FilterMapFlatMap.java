package com.optional;

import java.util.Optional;

public class FilterMapFlatMap {

	public static void main(String[] args) {

		Optional<String> nonEmptyGender = Optional.of("MALE");
		Optional<String> emptyGender = Optional.empty();

		/*
		 * Map on Optional
		 */
		System.out.println("Non-Empty Optional:: " + nonEmptyGender.map(String::toUpperCase));
		System.out.println("Empty Optional    :: " + emptyGender.map(String::toUpperCase));

		Optional<Optional<String>> nonEmptyOtionalGender = Optional.of(Optional.of("male"));
		System.out.println("Optional value   :: " + nonEmptyOtionalGender);
		System.out
				.println("Optional.map     :: " + nonEmptyOtionalGender.map(gender -> gender.map(String::toUpperCase)));
		System.out.println(
				"Optional.flatMap :: " + nonEmptyOtionalGender.flatMap(gender -> gender.map(String::toUpperCase)));

		/*
		 * Filter on Optional
		 */
		System.out.println(nonEmptyGender.filter(g -> g.equals("male"))); // Optional.empty
		System.out.println(nonEmptyGender.filter(g -> g.equalsIgnoreCase("MALE"))); // Optional[MALE]
		System.out.println(emptyGender.filter(g -> g.equalsIgnoreCase("MALE"))); // Optional.empty

	}

}
