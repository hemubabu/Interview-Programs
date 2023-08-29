package com.mathsprogramming;

public class Armstrong {
	public static void main(String[] args) {
		int n=153,i,j=0;
		int a=n;
		while(a>0) {
			i=a%10;
			j=i*i*i+j;
			a=a/10;
		}
		System.out.println(j);
		if(j==n) {
			System.out.println(n+" "+"is a Armstrong number");
		}
		else {
			System.out.println(n+" "+"is not a Armstrong number");
		}
	}

}
