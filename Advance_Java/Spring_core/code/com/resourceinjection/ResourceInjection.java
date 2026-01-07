package com.resoureinjection;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.core.io.Resource;

public class ResourceInjection {
	 private Resource file;

	public ResourceInjection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResourceInjection(Resource file) {
		super();
		this.file = file;
	}

	public Resource getFile() {
		return file;
	}

	public void setFile(Resource file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "ResourceInjection [file=" + file + "]";
	}
	
	//user deff method
	public void process() {  //method to process injected doc from the bean
		String path="src\\resume";
		            //this is the destination location of the what we paste from the SRC
		//get the stream of bytes
		try {                
		InputStream is=file.getInputStream();//point to the particular file
		OutputStream os=new FileOutputStream(path+file.getFilename());//take file name from the bean
		int c;                       
		//writing the contents of the file from the bean to the destination file
		while((c = is.read()) != -1)//-1 ref end of the file
			os.write(c);//this write for our destination location 
	}catch(Exception e) {
		e.printStackTrace(); 
		
	}

	 }
	
}
