package com.stringprograms;

import java.util.*;

public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
		String S = "swiss";
		int count =1;
		Map<Character,Integer>M = new LinkedHashMap<>();
		for(int i=0;i<S.length();i++) {
			if(!M.containsKey(S.charAt(i))) {
				M.put(S.charAt(i),count);
			}
			else {
				M.put(S.charAt(i),M.get(S.charAt(i))+1);
			}
		}
		for(char X:M.keySet()) {
			if(M.get(X)==1) {
				System.out.println(" The First NonRepeated Character is :"+" "+X);
				break;
			}
		}
	}

}
