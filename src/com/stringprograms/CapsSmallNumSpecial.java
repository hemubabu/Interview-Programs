package com.stringprograms;

public class CapsSmallNumSpecial {
	public static void main(String[] args) {
		String S = "WelcometoHomeSession@123*";
		int Smallcount = 0;
		int Capscount = 0;
		int Digitcount = 0;
		int Specialcount = 0;

		for(int i=0;i<S.length();i++) {
			char ch=S.charAt(i);
			if(ch>='a' && ch<='z' ) {
			//if(Character.isLowerCase(ch)) {
				Smallcount++;
			}
			else if(ch>='A' && ch<='Z') {

			//else if(Character.isUpperCase(ch)) {
				Capscount++;
			}
			else if(ch>='0' && ch<='9') {

			//else if(Character.isDigit(ch)) {
				Digitcount++;
			}
			else {
				Specialcount++;
			}
		}
		System.out.println("The count of Lowercase characters is "+Smallcount);
		System.out.println("The count of Uppercase characters is "+Capscount);
		System.out.println("The count of Digits is "+Digitcount);
		System.out.println("The count of Special characters is "+Specialcount);

		
	}

}
