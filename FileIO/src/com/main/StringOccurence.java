/*Write a program to search for a string in a file and then return the count of number of occurrences of the string.*/

package com.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringOccurence {
	
public int count(String filePath, String key) {
		
		int count=0;
		
		File fpath = new File(filePath);
		
		if(fpath.length() == 0)
			return count;
		
		FileReader fr = null;
		
		BufferedReader br = null;
		
		String[] words = null;
		
		try {
			
			fr = new FileReader(fpath);
			
			br = new BufferedReader(fr);					
			
			String line = br.readLine();
			
			while(line != null){	
				
				words = line.split(" ");
				
				line = br.readLine();
			}
			
			for(int i = 0; i < words.length; i++){
			
				if(words[i].toLowerCase().trim().toString().equals(key.toLowerCase().trim())){
					
					count++;
				}
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally{
			
			if(br != null){
				
				try {
					br.close();
				} catch (IOException e) {

					e.printStackTrace();
				}								
			}
			
			if(fr != null){
				
				try {
					fr.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		}		
		return count;
	}

}
