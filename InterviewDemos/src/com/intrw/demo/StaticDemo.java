package com.intrw.demo;

public class StaticDemo {

	static int a;
	static int b;
	
	public String s ;
	
	static {
		
		System.out.println("Inside Static Block.");

		a = 10;
		b = 20;
	}

	public static void main(String[] args) {

		System.out.println("Inside main method.");

		System.out.println("Value of a = " + a);
		System.out.println("Value of b = " + b);
	}

}
