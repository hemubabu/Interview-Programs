package com.programsArray;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class DuplicateArray {
	public static void main(String[] args) {
		int[]a= {24,87,7,90,-67,32,24,85,7};
		Arrays.sort(a); // It will print the duplicates next
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length-1;i++) {
			
				if(a[i]==a[i+1]) {
					System.out.println("The Duplicate array is "+a[i]);
				
			}
		}
		DuplicateArray.find_Duplicates_Using_HashSet(a);
		DuplicateArray.findDuplicatesUsingMap(a);
		
		
		
			
	}
	private static void find_Duplicates_Using_HashSet(int[] arr) {
		Set<Integer> S = new HashSet<>();
		for(Integer X:arr) {
			if(!S.add(X)) {
				System.out.println("The Duplicate element present in the array is "+X);
			}
		}
		
	}
	private static void findDuplicatesUsingMap(int[] arr) {
		Map<Integer,Integer> M = new HashMap<>();
		int count=1;
		for(Integer X:arr) {
			if(!M.containsKey(X)) {
				M.put(X, count);
			}
			else {
				M.put(X,M.get(X)+1);
			}
		}
		for(Integer X1:M.keySet()) {
			if(M.get(X1)>1) {
				System.out.println("The Duplicate element present in the array is "+X1);
			}
		}
		
	}

}
