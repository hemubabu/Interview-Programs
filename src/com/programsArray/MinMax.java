package com.programsArray;

public class MinMax {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8};
		int largest=a[0];
		int smallest=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
			else {
				if(a[i]<smallest) {
					smallest=a[i];
				}
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
	}

}
