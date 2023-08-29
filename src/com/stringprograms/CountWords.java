package com.stringprograms;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
	public static void main(String[] args) {
		int count =1;
		
		String S = "Welcome to java to java Program to";
		Map<String,Integer>M = new HashMap<>();
		String[] S1=S.split(" ");
		for(int i=0;i<S1.length;i++) {
			String s =S1[i];
			if(!M.containsKey(s)) {
				M.put(s,count);
			}
			else {
				M.put(s,M.get(s)+1);
			}
		}
		for(String X:M.keySet()) {
			System.out.println(X+"="+M.get(X));
			
		}
		

		       
		        		    }
		


}
