package com.mathsprogramming;

public class Reverse {
	public static void main(String[] args) {
		int a;
		int count =0;
		for(int i=0;i<=100;i++) {
		a = i;
		int b=0;
		int reverse=0;
		while(a>0) {
			b=a%10;// 6,5
			reverse=reverse*10+b; //65
			a=a/10;	//12345			
		}
		if(reverse==i) {
			count++;
			System.out.println(i+" is Palindrome");
		}
	}
		System.out.println("Palindrome count is"+count);
		
		
		
		
	
	}

}
