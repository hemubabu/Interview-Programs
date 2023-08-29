package com.stringprograms;

import java.util.HashMap;
import java.util.*;

public class Program1 {
	public static void main(String[] args) {
		String s = "I am learning learning java java java Programming";
		StringBuffer SB = new StringBuffer("");
		String[] S = s.split(" ");
		int count = 1;
		Map<String,Integer>M = new LinkedHashMap<>();
		for(int i=0;i<S.length;i++) {
			if(!M.containsKey(S[i])) {
				M.put(S[i],count);
			}
			else {
				M.put(S[i],M.get(S[i])+1);
			}
			
		}
		for(String X:M.keySet()) {
			
			
			SB.append(X+" ");
			
		}
		System.out.println(M.keySet());
		
		System.out.println(SB);
		
		
	}
	

}
