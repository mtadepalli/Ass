/*Write a program to count the number of words in a file.*/

package com.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {
	

	
	public int count(String filePath){
		
		int c =-1, count=0;
		
		File fpath = new File(filePath);
		
		if(fpath.length() == 0)
			
			return count;
		
		FileReader fread = null;
		
		StringBuffer sbuff = null;
		
		try {
			
			fread = new FileReader(fpath);		
			
			 sbuff = new StringBuffer();
			
			char[] line = new char[1024];
			
			while( (c = fread.read(line))  != -1){	
			
				sbuff.append(line);
			}
			
			String[] words = sbuff.toString().split(" ");			
						
			count = words.length;
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally{
			
			if(fread != null){
				
				try {
					
					fread.close();
					
				} catch (IOException e) {
			
					e.printStackTrace();
				}
				
			}
			
		}	
		
		return count;
	}
	
}
