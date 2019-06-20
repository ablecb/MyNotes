package com.ys.p2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class UploadAction {
	
	private File up;

	private String upFileName;
	
	private String upContentType;
	
	public void upload(){
		
		try {
			System.out.println(upFileName+"---------"+upContentType);
			FileInputStream fis = new FileInputStream(up);
			FileOutputStream fos = new FileOutputStream("d:/"+upFileName);
			
			int t =0;
			while((t = fis.read())!=-1){
				fos.write(t);
			}
			fos.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public void setUp(File up) {
		this.up = up;
	}



	public void setUpFileName(String upFileName) {
		this.upFileName = upFileName;
	}



	public void setUpContentType(String upContentType) {
		this.upContentType = upContentType;
	}
	
	
	
	
}
