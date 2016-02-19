/*Write a program containing a function which is expected to throw any kind of exception say NullPointerException or 
 * ArithmeticException etc and then handle this function in the parent function which calls this function.
 *  
 */

package com.main;

public class ThrowsClauseExample {
	
	public int numberOperations(String opr, int num1, int num2){
		
		int result = 0;
		
		if(opr.equals("/"))	{
			
			try{
		
			result = divideNumbers(num1, num2);
			
			}
			catch(ArithmeticException ex){
				
				System.out.println("An exception occurred. ");
				ex.printStackTrace();
			}
		}		
		return result;
	}
	
	public int divideNumbers(int num1, int num2) throws ArithmeticException{
		
		int result = 0;
		
		result = num1/num2;	
		
		return result;
	}	
}
