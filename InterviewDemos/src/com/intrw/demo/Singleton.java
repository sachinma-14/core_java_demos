package com.intrw.demo;

public class Singleton {
	
	// static variable of type Singleton
	private static Singleton singleInst = null;
	
	public String s;
	
	// private constructor restricted to this class itself
	private Singleton() {
		s= "Hello I am a string part of Singleton class";
	}
	
	// static method to create instance of Singleton class
	public static Singleton getInstance() {
		if(singleInst == null)
			singleInst = new Singleton();
		
		//different microservice  
		// to check variable sesssion
		// cache variable to check session live or not
		// @ scheduler used to call every few seconds 
		
		return singleInst;
	}

}
