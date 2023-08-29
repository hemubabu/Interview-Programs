package com.stringprograms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		boolean isPalindrome =true;
		System.out.println("Enter a String");
		Scanner Sc = new Scanner(System.in);
		String S = Sc.nextLine().toLowerCase();
		
		int start=0;
		int end =S.length()-1;
		while(start<end) {
			if(!(S.charAt(start)==S.charAt(end))) {
				isPalindrome = false;
				break;
			}
			start++;
			end--;
		}
		if(isPalindrome) {
			System.out.println("The given String is Palindrome");
		}
		else {
			System.out.println("The given String is not a Palindrome");
		}
	}

}
