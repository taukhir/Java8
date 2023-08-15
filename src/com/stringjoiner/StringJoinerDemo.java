package com.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {

		/*
		 * string with delimeter as comma
		 */
		StringJoiner stj = new StringJoiner(",");
		stj.add("ahmed");
		stj.add("welcome");

		System.out.println(stj);

		/*
		 * string with delimeter as pipe and with prefix and suffix as [,]
		 */
		StringJoiner stj2 = new StringJoiner("|", "[", "]");
		stj2.add("Apples");
		stj2.add("Mango");
		stj2.add("PineApple");
		stj2.add("Grapes");

		System.out.println(stj2);

		/*
		 * merging two strings
		 */
		StringJoiner stj3 = stj.merge(stj2);
		System.out.println(stj3);

	}
}
