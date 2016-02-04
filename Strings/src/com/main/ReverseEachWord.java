package com.main;

public class ReverseEachWord {
	
	public String reverse(String inputStr){
		
		String returnStr = null;
		
		String emptyStr = "";
		
		String[] strArray = inputStr.split(" ");
		
		int length = strArray.length;
		
		StringBuffer buff = new StringBuffer();
		
		for(int i = 0; i < length ; i++){
			
			if(strArray[i].length() == 0) return emptyStr;
			
			//Using reverse function from ReverseString class
			ReverseString rev = new ReverseString();			
		
			buff.append(rev.reverse(strArray[i]));
			
			if(i != length-1 ){
				buff.append(" ");
			}
		}		
		
		returnStr = buff.toString();
		return returnStr;
	}

}
