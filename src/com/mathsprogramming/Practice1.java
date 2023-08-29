package com.mathsprogramming;

import java.util.*;

public class Practice1 {
	public   void method(){
		try {
			System.out.println(4/0);
		}
		catch(Exception e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println();
		}
		finally{
			System.out.println("Exception");	
		}
		
	
		
	}
	public static void main(String[] args) throws Throwable {
		int n=3;
		Practice1 P = new Practice1();
		P.method();
		P.method();
		P.finalize();
		for(int row=1;row<=n;row++) {
			for(int col1=row;col1<n;col1++) {
				System.out.print("  ");
			}
			for(int col2=1;col2<=row;col2++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
		
		
	
		
		
		
		
		
	

	}
}
