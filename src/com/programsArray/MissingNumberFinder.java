package com.programsArray;

public class MissingNumberFinder {
	public static void main(String[] args) {
		int[] a= {1,3,4,5,6,7,8,9,10};
		int ActualSum=0;
		int ExpectedSum=0;
		for(int i=0;i<a.length;i++) {
			ActualSum = ActualSum+a[i];
		}
		for(int i=0;i<=10;i++) {
			
			ExpectedSum = ExpectedSum+i;
		}
		System.out.println(ExpectedSum);
		System.out.println(ActualSum);
		System.out.println("The missing number is "+(ExpectedSum-ActualSum));
	}

}
