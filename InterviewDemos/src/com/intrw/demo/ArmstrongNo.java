package com.intrw.demo;

public class ArmstrongNo {

	public static void main(String[] args) {
		  
		int no = 153;
		int sum = 0;
		int sum1 = 0;
		int lastDigit = 0;
		
		while(no != 0) {
			
			lastDigit = no%10;
			sum1 = sum1+(lastDigit*lastDigit*lastDigit);
			no = no/10;
		}
		
		System.out.println("Sum1 "+sum1);
		
		if(sum == no)
			System.out.println("No is Armstrong");
		else 
			System.out.println("No is NOT Armstrong");
		

	}

}
