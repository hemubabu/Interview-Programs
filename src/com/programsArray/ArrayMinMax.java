
package com.programsArray;

import java.util.Arrays;

public class ArrayMinMax {
	public static void main(String[] args) {
		int[]a= {24,87,7,90,-67,32};
		
		int largest=a[0];
		int smallest=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
			else if(a[i]<smallest){
				smallest = a[i];
				
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("The largest element is "+largest);
		System.out.println("The smallest element is "+smallest);
	}

}
