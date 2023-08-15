package com.datetime;

public class DateTimeClasses {

	/*
	 * LocalDate YearMonth MonthDay Year
	 */

	/*
	 * Working with dates in Java used to be hard. The old date library provided by
	 * JDK included only three classes: java.util.Date, java.util.Calendar and
	 * java.util.Timezone.
	 * 
	 * Java 8 introduced a completely new Date Time API (java.util.time.*) that is
	 * loosely based on the popular Java library called JodaTime. This new API
	 * dramatically simplified date and time processing and fixed many shortcomings
	 * of the old date library.
	 */
	
	/*
	 * 6. Java 8 Date and Time API Guide
	 * ** 6.1 Java 8 Date and Time Overview
	 * ******Java 8 Date Classes with Example
	 * ****** Java 8 Date and Time Classes with Examples
	 * ****** Java 8 Date Parsing and Formatting with Examples
	 * ****** Java 8 Time Zone and Offset Classes with Examples
	 * ** 6.2. Java 8 Date & Time API Guide
	 * ****** Java 8 - LocalTime Class API Guide
	 * ****** Java 8 - LocalDate Class API Guide
	 * ****** Java 8 - LocalDateTime Class API Guide
	 * ****** Java 8 - ZonedDateTime Class API Guide
	 * ****** Java 8 - Duration Class API Guide
	 * ****** Java 8 - Instant Class API Guide
	 * ****** Java Clock Class Methods/APIs with Examples
	 * ****** Java Period Class Methods/APIs with Examples
	 * ****** Java Year Class Methods/APIs with Examples
	 * ****** Java DayOfWeek Enum Methods with Examples
	 * ****** Java Month Enum Methods/APIs with Examples
	 * ** 6.3 Utilities
	 * ****** Java 8 Date Utility Class
	 */
	
	/*
	 * The new API has many different time representations, each suitable for
	 * different use cases:
	 * 
	 * Instant – represents a point in time (timestamp) 
	 * LocalDate – represents a date (year, month, day) 
	 * LocalDateTime – same as LocalDate, but includes time with nanosecond precision 
	 * OffsetDateTime – same as LocalDateTime, but with time zone offset 
	 * LocalTime – time with nanosecond precision and without date information 
	 * ZonedDateTime – same as OffsetDateTime, but includes a time zoneID 
	 * OffsetLocalTime – same as LocalTime, but with time zone offset 
	 * MonthDay – month and day, without year or time 
	 * YearMonth – month and year, without day or time 
	 * Duration – amount of time represented in seconds, minutes and hours. Has nanosecond precision 
	 * Period – amount of time represented in days, months and years
	 */
	
	/*
	 *  Immutability and Thread-Safety
	 *  Another advantage is that all time representations in Java 8 Date Time API are immutable and thus thread-safe.
	 *  All mutating methods return a new copy instead of modifying state of the original object.
	 *  
	 */
	
	/*
	 *  Method Chaining
	 *  All mutating methods can be chained together, allowing to implement complex transformations in a single line of code.
	 */

}
