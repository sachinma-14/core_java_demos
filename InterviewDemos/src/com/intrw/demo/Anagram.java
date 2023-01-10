package com.intrw.demo;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String ana1 = "Keep";
		String ana2 = "peek";
		
		char [] ana1Arr = ana1.toCharArray();
		char [] ana2Arr = ana2.toCharArray();
		
		Arrays.sort(ana1Arr);
		Arrays.sort(ana2Arr);
		
		if(Arrays.equals(ana1Arr, ana2Arr))
			System.out.println("Strings are Aanagram..");
		else
			System.out.println("Strings are NOT Aanagram..");
	}

}
