/*Write a program to find the missing number in a series of sorted numbers stored in an array.
  
  1. Complexity is O(n). Iterate through the array and compute the sum of all numbers. 
  2. Total =  N x (N+1)/2. 
  3. Missing number = total-sum
	
*/

package com.main;

public class MissingNumber {
	
	public int missingNumber(int[] array){
		
		int num = 0, sum = 0, index = -1;
		
		int length = array.length;
		
		for (int i = 0; i < length; i++)
		{
		    if (array[i] == 0)
		    {
		         index = i; 
		    }
		    else 
		    {
		         sum += array[i]; //Take sum of the given array.
		    }
		}

		// the total is calculated using formula n * (n+1)/2
		int total = (length + 1) * length / 2;

		//Subtract the sum from total number to get missing integer.
		num = total - sum;
		
		//System.out.println("missing number is: " + (total - sum) + " at index " + index);
	
		return num;
	}
}
