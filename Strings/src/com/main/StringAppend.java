/*Write a program which accepts a string like "This is nice" and converts it to a string like "This1 is2 nice3".*/
package com.main;

public class StringAppend {
	
	public String appendString(String str){
		
		String returnStr = null;
		
		String emptyStr = "";
		
		String[] strArray = str.split(" ");
		
		int length = strArray.length;
		
		StringBuffer buff = new StringBuffer();
		
		for(int i = 0; i < length ; i++){
			
			if(strArray[i].length() == 0) return emptyStr;
		
			buff.append(strArray[i]);
			
			buff.append(i+1);
			
			if(i != length-1 ){
				buff.append(" ");
			}
		}		
		
		returnStr = buff.toString();
		
		return returnStr;
	}	
}
