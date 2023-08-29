package com.programsArray;

import java.util.Arrays;

public class AscendingDescending {
	public static void main(String[] args) {
		int[]a= {100,200,700,700,600};
		System.out.println(Arrays.toString(a));
		int c ;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) // Descending
				{
				c=a[i];
				a[i]=a[j];
				a[j]=c;	
				}
			}
			
		}
	
		System.out.println(Arrays.toString(a));

		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
