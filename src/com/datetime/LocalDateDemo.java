package com.datetime;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class LocalDateDemo {

	LocalDate getLocalDateUsingFactoryOfMethod(int year, int month, int dayOfMonth) {
		return LocalDate.of(year, month, dayOfMonth);
	}

	public static void main(String[] args) {

		/*
		 * Get current date or today's using this method.
		 */
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate); // 2023-01-05

		/*
		 * plusDays(int days) Get next day of today's or specific date using this
		 * method.
		 */
		System.out.println(localDate.plusDays(2)); // 2023-01-07

		/*
		 * minus(int days) Get previous day by passing specific date to this method.
		 */
		System.out.println(localDate.minusDays(2)); // 2023-01-03

		/*
		 * plusWeeks()
		 */
		System.out.println(localDate.plusWeeks(1)); // 2023-01-12

		/*
		 * minusWeeks()
		 */
		System.out.println(localDate.minusWeeks(1)); // 2022-12-29

		/*
		 * plusMonths(), plusYears(), minusMonths(), minusYears()
		 */

		/*
		 * getDayOfWeek() Get day of week using this method.
		 */
		System.out.println(localDate.getDayOfWeek()); // THURSDAY

		/*
		 * with(TemporalAdjusters.firstDayOfMonth()) Get first day of the month.
		 */
		System.out.println(localDate.with(TemporalAdjusters.firstDayOfMonth())); // 2023-01-01

		/*
		 * atStartOfDay() Get start of the day.
		 */
		System.out.println(localDate.atStartOfDay()); // 2023-01-05T00:00

	}
}
