package com.main;

public class LargestNumber {
	
	public int findMax(int[] array){
		
		int max = array[0];
		
		int length = array.length;
		
		for(int i=0; i < length; i++){
		
			if(array[i] > max)
				max = array[i];			
		}
		
		return max;
	}

}
