package com.streams.demos;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
		
		Set<Integer> duplicate = intList.stream().filter(i -> Collections.frequency(intList, i) > 1).collect(Collectors.toSet());
		System.out.println(duplicate);
		
		//intList.stream().filter(i -> Collections.frequency(intList, i) > 1).forEach(x -> System.out.println(x));
		
		
	}
	
	

}
