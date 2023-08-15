package com.foreach;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
	
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		List<Integer> asList = Arrays.asList(1,2,23,122,1222,433);
		
		
		/*
		 * forEach demo for list
		 */
		asList.forEach(System.out::println);	
		
		
		Map<Integer, String> namesMap = new HashMap<>();
		namesMap.put(1, "Larry");
		namesMap.put(2, "Steve");
		namesMap.put(3, "James");
		
		
		/*
		 * for Each demo for map
		 */
		namesMap.forEach((key, value) -> System.out.println(key + " " + value));
		
		System.out.println("Main Ended");
		
	}

}
