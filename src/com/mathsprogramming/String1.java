package com.mathsprogramming;

public class String1 {
	public static void main(String[] args) {
		String S1 = "aabbbccq";
		StringBuffer S2 = new StringBuffer("");
		int count =1;
		for(int i=1;i<S1.length();i++) {
			if(S1.charAt(i)==S1.charAt(i-1)) {
				count++;
			}
			else {
				S2.append(S1.charAt(i-1)).append(count);
				count=1;
			}
			
		}
		S2.append(S1.charAt(S1.length()-1)).append(count);
		System.out.println(S2);
	}

}
