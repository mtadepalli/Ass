/*
 * Write a program to locate and swap only 2 elements which are not sorted in a given sorted array. 
 * For example given an array {1,2,5,6,4} locate 5 and 4 and then swap them as they are not as per 
 * sorted order.
 * The idea is to traverse from rightmost side and find the first out of order element (element which
 * is smaller than previous element).Once first element is found, find the other our of order element 
 * by traversing the array toward left side.
 */
package com.main;

import java.util.Arrays;

public class SwapElements {
	
	public int[] performSwap(int[] arr){
		
		int length = arr.length;
		
		// Traverse the given array from rightmost side
	    for (int i = length-1; i > 0; i--)
	    {
	        // Check if arr[i] is not in order
	       
	    	if (arr[i] < arr[i-1])
	        {
	            // Find the other element to be
	            // swapped with arr[i]
	            int j = i-1;
	            while (j>=0 && arr[i] < arr[j]){
	            	//System.out.println(" elements : "+ arr[i] +" , "+ arr[j]);
	                j--;
	            }
	 
	            //System.out.println("Swap elements : "+ arr[i] +" , "+ arr[j+1]);
	            
	            // Swap the pair
	            int temp = arr[i];
	            
	            arr[i] = arr[j+1];
	            
	            arr[j+1] = temp;
	            
	            break;
	        }
	    }	 
	    //System.out.println(Arrays.toString(arr));
		return arr;
	}
}
