package com.mathsprogramming;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Cmo {
	public static void main(String[] args) {
		String A = " Welcome to java language";
		String[] A1 = A.split(" ");
		for(int i=A1.length-1;i>0;i--) {
			String A2 = A1[i];
			System.out.println(A2);
		}
		StringBuffer SB = new StringBuffer("");
		for(int i=A.length()-1;i>0;i--) {
			char c = A.charAt(i);
			SB.append(c); 
		}
		System.out.println(SB);
		String S1 = "www.flipkart.com";
		String S2 = S1.substring(0,4);
		String S3 = S1.substring(4,S1.length()-4);
		String S4 = S1.substring(S1.length()-4,S1.length());
		System.out.println(S2);
		System.out.println(S3);
		System.out.println(S4);
		
		int count =1;
		Map<Character,Integer>M = new HashMap<>();
		String S = "hemanthbabu";
		char[] C = S.toCharArray();
		for(int i=0;i<C.length;i++) {
			if(!M.containsKey(C[i])) {
				M.put(C[i],count);
			}
			else {
				M.put(C[i],M.get(C[i])+1);
			}
		}
		for(char X:M.keySet()) {
			if(M.get(X)>1) {
				System.out.println("The Duplicate String is  "+X);
			}
		}
		int result = S.length()-S.replaceAll("a","").length();
		System.out.println(result);
	}

}
