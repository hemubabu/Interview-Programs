package com.mathsprogramming;

public class ArraySplit {
	public static boolean containsDigit(int num,int digit) {
		while(num>0) {
			int currentdigit=num%10;
			if(currentdigit==digit) {
				return true;
			}
			num=num/10;
		}
		return false;
	}

	public static void main(String[] args) {
		int[]a= {525,636,878,965,872};
		boolean isPresent=true;
		for(int num:a) {
			if(containsDigit(num,5)) {
				isPresent=true;
				break;	
			}
		}
		if(isPresent) {
			System.out.println("5 is present in the array");
		}
		else {
			System.out.println("5 is not present in the array");
		}
		

		
		
//		 india -0
//		 is - 1
//		 my - 2
//		 country -3
//		
	
	
	}

	
}
