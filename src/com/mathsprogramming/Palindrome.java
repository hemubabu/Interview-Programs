package com.mathsprogramming;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		String S = SC.nextLine();
		String Reverse="";
		for(int i=S.length()-1;i>=0;i--) {
			Reverse=Reverse+S.charAt(i);
		}
		if(S.equals(Reverse)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
		System.out.println("Loop Ended");
	}

}
