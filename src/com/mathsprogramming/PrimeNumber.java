package com.mathsprogramming;

import java.util.Scanner;

public class PrimeNumber {
	public void prime1to100_usingForLoop() {
		int count=0;
		for(int num=2;num<=100;num++) {
			boolean prime = true;
		 
		for(int j=2;j<num;j++) {
			if(num%j==0) {
				prime = false;
				break;
			}
			
		}
		
		if(prime==true) {
			System.out.println(num+" = Prime number");
			count++;
		}
		else if(prime==false){
			System.out.println(num+" = Not Prime");
		}
		}
		System.out.println(count);
		
	}
	public void prime1to100() {
		int total=0;
		for(int n=2;n<100;n++) {
			boolean prime=true;
			int i=2;
			while(n>i) {	
				if(n%i==0) {
					prime=false;
					break;
				}
				i++;
			}
			if(prime==true) {
				total++;
				System.out.println(n+" ");
			}
		//	else if(prime==false){
		//		System.out.println(n+"Not Prime");
		//	}
		}
		System.out.println("Total prime numbers is"+total);
		
	}
	public void primeInput() {
		System.out.println("Enter the number");
		Scanner S = new Scanner(System.in);
		int num = S.nextInt();
		
		boolean prime = true;
		int i=2;
		while(i<num) {
			if(num%i==0) {
				prime=false;
				break;
			}
			i++;
			
		}
		if(prime==true) {
			System.out.println("Prime number");
		}
		else if(prime==false){
			System.out.println("Not Prime");
		}

	}

	public static void main(String[] args) {
		PrimeNumber P = new PrimeNumber();
		P.prime1to100();
		P.primeInput();
		P.prime1to100_usingForLoop();
	}
}
