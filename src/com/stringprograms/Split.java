package com.stringprograms;

import java.util.ArrayList;
import java.util.List;

public class Split {
	public static void main(String[] args) {
		List<Integer>L=new ArrayList<>();
		String S ="Welcome to Java Session ";
		String[] S1=S.split(" ");
		String reverse="";
		String reverse1="";
				for(int i=S1[1].length()-1;i>=0;i--) {
					reverse=reverse+S1[1].charAt(i);
				}
				for(int i=S1[2].length()-1;i>=0;i--) {
					reverse1=reverse1+S1[2].charAt(i);
				}
				System.out.println(S1[0]+reverse+reverse1+S1[3]);		
	}

}
