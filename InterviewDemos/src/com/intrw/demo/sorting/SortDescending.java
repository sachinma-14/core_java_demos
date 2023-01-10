package com.intrw.demo.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortDescending {

	public static void main(String[] args) {
		// Define an objects of ArrayList class
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Adding elements to the ArrayList
		list.add(410);
		list.add(250);
		list.add(144);
		list.add(967);
		list.add(289);
		list.add(315);

		// Printing the unsorted ArrayList
		System.out.println("Before Sorting : " + list);

		// Sorting ArrayList in descending Order
		Collections.sort(list, Collections.reverseOrder());

		// Printing the sorted ArrayList
		System.out.println("After Sorting : " + list);
	}

}
