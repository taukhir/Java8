package com.datetime;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeDemo {

	/*
	 * https://www.javaguides.net/2018/08/java-8-localtime-class-api-guide.html
	 */

	public static void main(String[] args) {

		/*
		 * currentTime
		 */

		LocalTime localTime = LocalTime.now();
		System.out.println(localTime); // 14:39:26.083405700

		// Specific Time
		LocalTime localTime2 = LocalTime.of(4, 30, 45);
		System.out.println(localTime2); // 04:30:45

		LocalTime localTime3 = LocalTime.now(Clock.systemDefaultZone());
		System.out.println(localTime3); /// 14:40:09.307354300

		LocalTime localTime4 = LocalTime.now(Clock.system(ZoneId.of("Indian/Cocos")));
		System.out.println(localTime4); // 15:40:35.630248100

		/*
		 * ***** LocalTime Methods get Hour, Minute, Second from LocalTime ******
		 * LocalTime class provides below APIs to get Hour, Minute, Second from
		 * LocalTime. 
		 * ******************** 1. int getHour() - Gets the hour-of-day field. 
		 * ******************** 2. int getMinute() - Gets the minute-of-hour field. 
		 * ******************** 3. int getNano() - Gets the nano-of-second field. 
		 * ******************** 4. int getSecond() - Gets the second-of-minute field.
		 */
		System.out.println("Gets the hour-of-day field : " + localTime.getHour());
		System.out.println("Gets the minute-of-hour field : " + localTime.getMinute());
		System.out.println("Gets the second-of-minute field : " + localTime.getSecond());
		System.out.println("Gets the nano-of-second field : " + localTime.getNano());

		/*
		 * LocalTime Methods to add or subtract hours, minutes and seconds to LocalTime
		 * LocalTime class provides below APIs to add or subtract hours, minutes and
		 * seconds to LocalTime. 
		 * ***************************** 1. LocalTime plusHours(long hoursToAdd) 
		 * ***************************** 2. LocalTime plusMinutes(long minutesToAdd) 
		 * ***************************** 3. LocalTime plusNanos(long nanosToAdd)
		 * ***************************** 4. LocalTime plusSeconds(long secondstoAdd)
		 * ***************************** 5. LocalTime minusHours(long hoursToSubtract) 
		 * ***************************** 6. LocalTime minusMinutes(long minutesToSubtract)  
		 * ***************************** 7. LocalTime minusNanos(long nanosToSubtract)
		 * ***************************** 8. LocalTime minusSeconds(long secondsToSubtract) 
		 */
		
		 // LocalTime's plus methods
        System.out.println("Addition of Hours : " + localTime.plusHours(2));
        System.out.println("Addition of Minutes : " + localTime.plusMinutes(30));
        System.out.println("Addition of Seconds : " + localTime.plusSeconds(20));
        System.out.println("Addition of Nanos : " + localTime.plusNanos(60000));

        // LocalTime's minus methods
        System.out.println("Subtraction  of Hours : " + localTime.minusHours(2));
        System.out.println("Subtraction  of Minutes : " + localTime.minusMinutes(30));
        System.out.println("Subtraction  of Seconds : " + localTime.minusSeconds(20));
        System.out.println("Subtraction  of Nanos : " + localTime.minusNanos(60000));
        
        
        /*
         * LocalTime Methods to compare LocalTime objects in Java	
         * 1. int compareTo(LocalTime other) - Compares this time to another time.
         * 2. boolean isAfter(LocalTime other) - Checks if this time is after the specified time.
         * 3. boolean isBefore(LocalTime other) - Checks if this time is before the specified time.
         */
        
        
        /*
         * ---
         */

	}

}
