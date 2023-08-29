package com.mathsprogramming;

public class FibonacciSeries // Sum of last two numbers
{
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c;
		System.out.print(a+" ");
		System.out.print(b+ " ");
		for(int i=0;i<=6;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
			
		}
		
	}

}
