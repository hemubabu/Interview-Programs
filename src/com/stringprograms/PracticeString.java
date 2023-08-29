package com.stringprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class PracticeString {
	public static void main(String[] args) {
		 int arr[]={1,2,3,5,4,3,6,8,5};
	        for(int i=0;i<arr.length;i++){
	            for(int j=i;j<arr.length;j++){
	                if(arr[i]!=arr[j]){
	                	System.out.println(arr[i]);
	                	break;
	                }
	                
	            }
	        }
		        System.out.print(Arrays.toString(arr));
	    }
	}



