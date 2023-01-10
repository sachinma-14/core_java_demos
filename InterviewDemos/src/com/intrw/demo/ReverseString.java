package com.intrw.demo;

public class ReverseString {
	
	public static void main(String[] args)
    {
        String input = "Geek For Geeks";
 
        // convert String to character array
        // by using toCharArray
        char [] chArr = input.toCharArray();
        
        for (int i = chArr.length - 1; i >= 0; i--)
            System.out.print(chArr[i]);
        
        System.out.println("\n Using char At");
        
        for (int i = input.length() - 1; i >= 0; i--)
            System.out.print(input.charAt(i));
    }

}
