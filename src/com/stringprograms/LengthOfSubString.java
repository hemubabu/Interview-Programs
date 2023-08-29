package com.stringprograms;

import java.util.*;

public class LengthOfSubString {
	public static void main(String[] args) {
		String S="abcabcbb";
		Set<Character>Set = new HashSet<>();
		int i=0;
		int j=0;
		int n = S.length();
		int maxlength=0;
		while(i<n && j<n) {
			if(!Set.contains(S.charAt(j))) {
				Set.add(S.charAt(j));
				j++;
				maxlength = Math.max(maxlength, j-i);	
				}
			else {
				Set.remove(S.charAt(i));
				i++;
			}
			}
		System.out.println("Length Of SubString  =" +" "+maxlength);
		}
		
	}


