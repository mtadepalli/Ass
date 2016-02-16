package com.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SearchAndReplace {
	
	public boolean performSearchReplace(String path, String keyStr, String replaceStr){
		
		boolean ret = false;
		
		File file = new File(path);
		
		FileReader fr = null;
		
		BufferedReader br = null;	
		
		try {
			
			fr = new FileReader(file);
			
			br = new BufferedReader(fr);					
			
			String line = br.readLine();
			
			StringBuffer buff = new StringBuffer();
			
			while(line != null){				
				
				line = line.replaceAll(keyStr, replaceStr);		
								
				if(line.indexOf(replaceStr) >= 0)
					ret = true;
			
				buff.append(line);
				
				line = br.readLine();
			}					
			
			FileWriter fwrite = new FileWriter(file);
			
			BufferedWriter bw = new BufferedWriter(fwrite);
			
			bw.write(buff.toString());
			
			bw.close();
			
			fwrite.close();			
			
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
		return ret;
	}
}
