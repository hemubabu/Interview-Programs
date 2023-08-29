package com.patternprograms;

public class IncDecreasingTriangle {
	public static void main(String[] args) {
		
		int n=5;
		
		//Increasing Triangle
		
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//SPACES
		System.out.println();
		System.out.println();
		//SPACES
		
		//Decreasing Triangle
		
		for(int row=1;row<=n;row++) {
			for(int col=row;col<=n;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
