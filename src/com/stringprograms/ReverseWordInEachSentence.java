package com.stringprograms;

public class ReverseWordInEachSentence {
	public static void main(String[] args) {
		String S = "My name is Hemanth Babu";
		String[] s = S.split(" ");
		String result="";
		for(String word:s) {
			String reverseword="";
			int j = word.length()-1;
			while(j>=0) {
				char c = word.charAt(j);
				reverseword = reverseword+c;
				j--;
			}
			result=result+reverseword+" ";
		}
		
		System.out.println(result);
		
	}

}
