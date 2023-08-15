package com.udemy.intro;

import java.util.Arrays;
import java.util.List;

public class ImperativeVsDeclarativeExample2 {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 1, 2, 2, 3, 2, 1, 4, 5, 6, 7, 4, 3);

		asList.stream().parallel().distinct().forEach(System.out::println);

	}

}
