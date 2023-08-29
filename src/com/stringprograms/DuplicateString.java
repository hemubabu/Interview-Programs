package com.stringprograms;

import java.util.*;

public class DuplicateString {
	public static void main(String[] args) {
		String S = "Hemanthbabu";
		String S1 ="";
		char[] C = S.toCharArray();
		int count = 1;
		Map<Character,Integer>M = new LinkedHashMap<>();
		System.out.println(C);
		for(int i=0;i<C.length;i++) {
			if(!M.containsKey(C[i])) {
				M.put(C[i],count);
			}
			else {
				M.put(C[i],M.get(C[i])+1);
			}
		}
		for(char X:M.keySet())
		{
			if(M.get(X)>1) {
				
				System.out.println("The Duplicate String is "+X+":"+M.get(X));
			}
		}
		for(char X:M.keySet())
		{
				S1=S1+X;
				System.out.println(X);	
		}
		System.out.println(S1);
		DuplicateString.Remove_Duplicate_Words("I am Hemanth Hemanth Babu Babu");
	}
	public static void Remove_Duplicate_Words(String S) {
		String S1 ="";
		String[] C = S.split(" ");
		int count = 1;
		Map<String,Integer>M = new LinkedHashMap<>();
		for(int i=0;i<C.length;i++) {
			if(!M.containsKey(C[i])) {
				M.put(C[i],count);
			}
			else {
				M.put(C[i],M.get(C[i])+1);
			}
		}
		for(String X:M.keySet())
		{
			if(M.get(X)>1) {
				
				System.out.println("The Duplicate String is "+X+":"+M.get(X));
			}
		}
		for(String X:M.keySet())
		{
				S1=S1+X+" ";
				System.out.println(X);	
		}
		System.out.println(S1);
		
		
	}
	
}
