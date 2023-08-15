package com.udemy.lambdas;

import java.util.Comparator;

public class ComparatorLambdas {

	public static void main(String[] args) {

		/*
		 * prior to java8
		 */

		Comparator<Integer> comparator = new Comparator<Integer>() {

			/*
			 * o1==o2 == 0 o1>o2 == 1 o1<o2 ==-1
			 */
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		};

		System.out.println(comparator.compare(1, 2));

		/*
		 * using lambda
		 */
		Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
		System.out.println(comparatorLambda.compare(3, 2));

		/*
		 * using method reference
		 */
		Comparator<Integer> comparatorMethodRegerence = Integer::compareTo;
		System.out.println(comparatorMethodRegerence.compare(3, 2));

	}

}
