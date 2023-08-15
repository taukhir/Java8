package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Classwork {

	public static void main(String[] args) {

		System.out.println("---------------- Main Started -- ahmed ------------------");

		LocalDateTime current_time = LocalDateTime.now();
		System.out.println("current time : " + current_time);

		LocalDate localDate = current_time.toLocalDate();
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("Local Date Formatted : " + localDate.format(ofPattern));
		System.out.println("Date - " + localDate.getDayOfMonth() + " ,Month : " + localDate.getMonthValue() + " Year : "
				+ localDate.getYear());

		LocalTime localTime = current_time.toLocalTime();
		System.out.println("current time : " + localTime);
		System.out.println("hour - " + current_time.getHour() + " ,minute - " + current_time.getMinute()
				+ " ,seconds - " + current_time.getSecond());

		LocalTime lt1 = LocalTime.now(ZoneId.of("Singapore"));
		System.out.println("current time in singapore : " + lt1);

		LocalTime lt2 = LocalTime.now(ZoneId.of("America/Panama"));
		System.out.println("current time in America : " + lt2);

		System.out.println("--------------  Main Ended -- ahmed -----------");
	}

}
