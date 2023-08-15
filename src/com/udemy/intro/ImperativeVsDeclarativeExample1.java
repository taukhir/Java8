package com.udemy.intro;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/*
		 * imperative Way
		 */
		long startTime = System.currentTimeMillis();
		int sum = 0;
		for (int i = 0; i < 10000; i++) {
			sum += i;
		}

		System.out.println("execution time 1: " + (System.currentTimeMillis() - startTime));

		/*
		 * declarative
		 */
		startTime = System.currentTimeMillis();
		int sum2 = IntStream.range(0, 10000).parallel().sum();
		System.out.println("execution time 2: " + (System.currentTimeMillis() - startTime));
	}

}
