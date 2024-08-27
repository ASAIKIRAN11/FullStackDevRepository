package com.files;
import java.io.File;
import java.io.IOException;

public class Fileoperationsdemo {
	public static void main(String[] args) {
		//createFile();
		//renameFile();
		//deleteFile();
		filecollections();
	}

	/*private static void createFile() 
	{
		try
		{
			File f1=new File("D:\\Demo\\FirstFile.txt");
			boolean v1=f1.createNewFile();
			System.out.println(v1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	private static void renameFile()
	{
		File f1=new File("D:\\Demo\\FirstFile.txt");
		File f2=new File("D:\\Demo\\SecondFile.txt");
		boolean v1=f1.renameTo(f2);
		System.out.println(v1);
	}
	
	private static void deleteFile()
	{
		File f2=new File("D:\\Demo\\SecondFile.txt");
		boolean v1=f2.delete();
		System.out.println(v1);
	}*/
	
	private static void filecollections()
	{
		File f1=new File("D:\\Demo");
		File f[]=f1.listFiles();
		for(int i=0;i<f.length;i++)
		{
			if(f[i].isFile()==true)
			{
				String path=f[i].getAbsolutePath();
				System.out.println(path);
			}
		}
	}
}