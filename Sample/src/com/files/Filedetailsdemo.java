package com.files;
import java.io.File;

public class Filedetailsdemo {
	public static void main(String[] args) {
		File f1=new File("D:\\Demo\\FirstFile.txt");
		
		//DISPLAY NAME OF THE FILE
		String name=f1.getName();
		System.out.println("filename is:" +name);
		
		//DISPLAY FILEPATH
		File f=f1.getAbsoluteFile();
		System.out.println("file path is:" +f);
		
		//DISPLAY FILEPATH	
		String path=f1.getAbsolutePath();
		System.out.println("file path :" +path);
		
		//VERIFY THAT "WHETHER IT IS FILE"
		boolean v1=f1.isFile();
		System.out.println("it is a file?:" +v1);
		
		//VERIFY THAT "WHETHER IT IS A FOLDER"
		boolean v2=f1.isDirectory();
		System.out.println("it is a folder?:" +v2);
		
		//DISPLAY PARENT FOLDER PATH
		String path1=f1.getParent();
		System.out.println("parent folder path is:" +path1);
		
		//VERIFY IT IS A READABLE?
		boolean v3=f1.canRead();
		System.out.println("it is readable?:" +v3);
		
		//VERIFY IT IS WRITABLE?
		boolean v4=f1.canWrite();
		System.out.println("it is writable?:" +v4);
		
		//VERIFY IT IS EXECUTABLE?
		boolean v5=f1.canExecute();
		System.out.println("it is executable?:" +v5);
	}
}