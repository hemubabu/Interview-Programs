package com.programsArray;

import java.util.Arrays;

public class ArrayDuplicates {
	public static void main(String[] args) {
		int[] A={55,35,96,56,45};
		int[] B={55,35,87,56,78};
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<B.length;j++) {
				if(A[i]==B[j]) {
					int c = A[i];
					System.out.println(c);
				}
			}
			
		}
		
	}
	

}
