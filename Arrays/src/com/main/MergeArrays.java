/*Write a program to merge 2 arrays.*/

package com.main;

public class MergeArrays {
	
	public int[] performMerge(int array1[], int array2[]){
		
		int[] mergedArray;
		
		int length1 = array1.length;
		
		int length2 = array2.length;

		int length = length1 + length2; 
		
		mergedArray = new int[length];
		
		for(int i=0, j=0; j < array1.length; i++, j++){
				
			mergedArray[i] = array1[j];
		}
		
		for(int i= length1, k=0; k < array2.length; i++, k++){
			
			mergedArray[i] = array2[k];
		}		
		return mergedArray;
	}

}
