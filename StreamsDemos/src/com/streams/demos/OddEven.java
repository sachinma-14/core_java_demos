package com.streams.demos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddEven {

	public static void main(String[] args) {
		
		
		List<Integer> intList = Arrays.asList(9,8,12,18,2,3,4,5,6,7,8,9,1,3,5);
		
		HashSet<Integer> hashSet = new HashSet<Integer>(intList);
		System.out.println("Using HashSet");
		System.out.println(hashSet);
		
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>(intList);
		System.out.println("Using TreeSet");
		System.out.println(treeSet);
		
		
//		List<Integer> even = intList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//		System.out.println(even);
//		System.out.println("");
//		
//		//intList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()).forEach(x -> System.out.println(x));
//		
//		IntStream.range(2, 10).filter(i -> i % 2 != 0).limit(2).forEach(x -> System.out.println(x));
		
		
//		List<Integer> odd = intList.stream().filter(i -> i %2 != 0).collect(Collectors.toList());
//		System.out.println(odd);
		
		
//		Map<Boolean, List<Integer>> partitions = intList.stream().collect(Collectors.partitioningBy(i -> i%2 == 0));
//		List<Integer> even = partitions.get(true);
//		List<Integer> odd = partitions.get(false);
//		
//		System.out.println(even);
//		System.out.println(odd);

	}

}
