package com.patternprograms;

public class PyramidUpDown {
	
	public static void main(String[] args) {
		int n=7;
		// Up Pyramind
		for(int row=1;row<=n;row++) {
			for(int col=row;col<=n;col++) {
				System.out.print  ("  ");
			}
			for(int col=1;col<row;col++) {
				System.out.print  ("* ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print  ("* ");
			}
			System.out.println();
		}
		
		
		//SPACES
		System.out.println();
		System.out.println();
		//SPACES
		
		// Down Pyramind
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print  ("  ");
			}
			for(int col=row;col<n;col++) {
				System.out.print  ("* ");
			}
			for(int col=row;col<=n;col++) {
				System.out.print  ("* ");
			}
			System.out.println();
		}
	}
	

}
