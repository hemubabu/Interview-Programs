package com.stringprograms;

public class Concurrence {
	public static void main(String[] args) {
		String S = "a3b4c2";//Output:aaabbbcc
		StringBuilder output = new StringBuilder();
		for(int i=0;i<S.length();i++) {
			char c = S.charAt(i);
			if(Character.isLetter(c)) {
				output.append(c);
			}
			else if(Character.isDigit(c)) {
				int count = Character.getNumericValue(c);
				char ch = output.charAt(output.length()-1);
			for(int j=0;j<count-1;j++) {
				output.append(ch);
			}
			}
			
		}
		System.out.println(output);
		
		
		
		
		String S1="aaaabbbccq";
		StringBuilder S2 = new StringBuilder();
		int count =1;
		for(int i=1;i<S1.length();i++) {
			if(S1.charAt(i)==S1.charAt(i-1)) {
				
				count++;
			}
			else {
				S2.append(S1.charAt(i-1)).append(count);
				count =1;
			}
		}
		S2.append(S1.charAt(S1.length()-1)).append(count);
		System.out.println(S2);
		
	}

}
