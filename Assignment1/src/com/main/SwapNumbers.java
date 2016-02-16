/* Write a program that swaps 2 given numbers. You need to have 2 separate functions in
   the program.
   --> One Function should swap the numbers without any third new variable.
   --> Second function should swap the numbers using a third variable.
*/

package com.main;

public class SwapNumbers {
		
	int x = 0 , y = 0, temp = 0;
		
	public void swapNumbers1(int[] array) {
			
			x = array[0];
			y = array[1];
			x = x + y;
			y = x - y;
			x = x - y;			
			array[0] = x;
			array[1] = y;
		
	}		
	
	public void swapNumbers2(int[] array) {	
		
		x = array[0];
		y = array[1];
		temp = x;
		x = y;
		y = temp;
		array[0] = x;
		array[1] = y;		
	}	
		
	public static void main(String[] args) {
		
		int[] array = {10,20};	
		
		if(array == null || array.length == 0)
		{
			try
			{
				throw new Exception();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		SwapNumbers swap = new SwapNumbers();				
		swap.swapNumbers1(array);
		swap.swapNumbers2(array);
	}
}
