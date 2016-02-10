/*The bubble sort repeatedly compares adjacent elements of an array. 
 The first and second elements are compared and swapped if out of order.  
 Then the second and third elements are compared and swapped if out of order.  
 This sorting process continues until the last two elements of the array are compared
 and swapped if out of order.
 
 When this first pass through the array is complete, the bubble sort returns to elements 
 one and two and starts the process all over again.   
 The bubble sort knows that it is finished when it examines the entire array and no "swaps" are 
 needed (thus the list is in proper order).
 */ 

package com.main;

import java.util.Arrays;

public class SortArray {
	
	public int[] performSort(int[] array){
				
		int temp;
		
		for(int i=0; i<array.length; i++){
			
			for(int j=i+1; j < array.length; j++){
		
				if(array[i] > array[j]){
	
					temp = array[i];
			
					array[i] = array[j];
			
					array[j] = temp;
				}
				//System.out.println("inner for loop :  "+Arrays.toString(array));
			}			
			//System.out.println("outer for loop :  "+Arrays.toString(array));
			//System.out.println("***********");
		}
		
		//System.out.println(Arrays.toString(array));
		
		return array;
	}	
	
}
