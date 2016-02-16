package com.main;

import java.io.File;

public class FileNames {
	
	public String[] getNames(String path){
		
		String[] fnames = null; 
		
		File f = new File(path);
		
		fnames = f.list();		
				
		return fnames;
	}
}
