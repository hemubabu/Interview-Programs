package com.mathsprogramming;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		
		int evencount =0;
		int oddcount =0;
		
		for(int i=1;i<=10;i++) {
		if(i%2==0) {
			//System.out.println(i+" "+"is Even number");
			evencount = evencount+i;
			//System.out.println("Even Count is "+count);
		}
		else {
			//System.out.println(i+" "+"is Odd number");
			oddcount = oddcount+i;
			//System.out.println("Odd count is "+count);

		}
		
		
	} 
		System.out.println("Even Count is "+evencount);
		System.out.println("Odd Count is "+oddcount);
		
	}
	

}
