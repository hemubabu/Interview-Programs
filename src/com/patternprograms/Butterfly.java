package com.patternprograms;

public class Butterfly {
	public static void main(String[] args) {
		int n=5;
		
		for(int row=1;row<n;row++) {  //one less column space to avoid uneven extra row *
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			for(int col=row;col<n;col++) { // one less column space to avoid uneven extra space
				System.out.print("  ");
			}
			for(int col=row;col<n;col++) {
				System.out.print("  ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for(int row=1;row<=n;row++) {
			for(int col=row;col<=n;col++) {
				System.out.print("* ");
			}
			for(int col=1;col<row;col++) {
				System.out.print("  ");
			}
			for(int col=1;col<row;col++) {
				System.out.print("  ");
			}
			for(int col=row;col<=n;col++) {
				System.out.print("* ");
			}
			
			System.out.println();

		}

		
		
	}

}
