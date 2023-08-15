package com.datetime;

import java.time.ZoneId;

public class ZoneIdDemo {

	public static void main(String[] args) {

		ZoneId.getAvailableZoneIds().forEach(System.out::println);
	}

}
