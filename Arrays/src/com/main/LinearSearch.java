/*Write a program to perform a linear search on any given array.Linear search is the basic 
 search where you look for the element to be searched in a sequential way. */

package com.main;

public class LinearSearch {
	
	public boolean performSearch(int key, int[] array){
		
		boolean ret = false;
		
		int length = array.length;
		
		for(int i=0; i < length; i++){
			
			if(array[i] == key){
				
				ret = true;
				
				break;
			}		
		}		
		return ret;
	}
	
	

}
