/*Write a program to copy content of file into another file.*/

package com.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public long performCopy(String source, String dest){
		
		long count = -1;
		
		File sfile = new File(source);	
		
		File dfile = new File(dest);
		
		if(sfile.length() == 0)
			return count;
		
		try {
			dfile.createNewFile();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
		FileReader fr = null;
		
		BufferedReader br = null;	
		
		FileWriter fw = null;
		
		BufferedWriter bw = null;
		
		try {
			
			fr = new FileReader(sfile);
			
			br = new BufferedReader(fr);
			
			fw = new FileWriter(dfile);
			
			bw = new BufferedWriter(fw);
			
			String line = br.readLine();			
						
			while(line != null){				
				
				bw.write(line);
				
				line = br.readLine();
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
			
			if(bw != null){
			
				try {
					bw.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}			
			}
			
			if(fw != null){
				
				try {					
					fw.close();
				} catch (IOException e) {					
					e.printStackTrace();
				}
			}
			
			count = dfile.length();			
		}		
		return count;		
	}	
}
