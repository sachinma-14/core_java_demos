package com.intrw.demo.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class ArrayListMain {

	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<Book>();
		
		
		List<String> list = new ArrayList<String>();
		list.add("aabbaa");
		list.add("aabbccc");
		list.add("aabbcccdddd");
		list.add("aabbcccddddeeeee");
		list.add("aabbcccddddeeeeeffffff");
		
		List<Book> book1 = new ArrayList<Book>();
		
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add(0, "Spring");
		arrList.add(1, "Boot");
		
//		BiPredicate<List, ArrayList> listSize = (list1, arrlist2) -> {
//			return true;
//		};
		
//		ArrayList<String> arrList1 = (ArrayList<String>) arrList.stream().filter(list1 -> list1.length() > 0)
//				.filter(list1 -> list1.equalsIgnoreCase("")).collect(Collectors.toList()));

		for(int i  = 0; i < arrList.size(); i++) {
			
			
		}

	}

}
