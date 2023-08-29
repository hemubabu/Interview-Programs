package com.stringprograms;

import java.util.Arrays;

public class ManipulateArray {
	public static void main(String[] args) {
		String[] arr = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		System.out.println(Arrays.toString(arr));
		String[] arr1 = new String[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i].substring(0,3);
		}
		System.out.println(Arrays.toString(arr1));
	}

}
