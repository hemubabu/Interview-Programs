package com.stringprograms;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String S = "tops";
		String S1 = "stop";
		char[] C = S.toLowerCase().toCharArray();
		char[] C1 = S1.toLowerCase().toCharArray();
		Arrays.sort(C);
		// Ascending alphabetic order
		Arrays.sort(C1);
		System.out.println(C);
		System.out.println(C1);
		 if(Arrays.equals(C,C1)) {
			 System.out.println("Given string is Anagram");
		 }
		 else {
			 System.out.println("Given string is not Anagram");
		 }
		
		
		
	}

}
