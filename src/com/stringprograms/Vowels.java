package com.stringprograms;

import java.util.Scanner;

public class Vowels {
	
	public static int countVowels(String str ) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {	
			count++;						
			}
		}
		return count;
	
		
	}
	public static void main(String[] args) {
		String str1="Hemanthbabu";
		int countvowels=countVowels(str1);
		System.out.println("the number of vowels is"+countvowels);
		String S="Lokesh";
		int count=0;
		int count1=0;
		for(int i=0;i<S.length();i++) {
			char ch=S.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {	
			count++;						
			}
			else {
				count1++;
			}
	}
		System.out.println("the number of vowels is"+count);
		System.out.println("the number of non-vowels is"+count1);

		


}
	}
