/*Write a program to find the common number in any given two arrays.*/

package com.main;

public class CommonNumber {
	
	public int findCommon(int[] arr1, int[] arr2){
		
		int num = -1;
		
		int k=0;
		
		for(int i=0; i < arr1.length; i++){
			
			for(int j=0; j < arr2.length; j++){				
				
				if(arr1[i] == arr2[j]){
					
					num = arr1[i];
					
					return num;					
				}				
			}//end for		
		}//end for		
		return num;
	}
}
