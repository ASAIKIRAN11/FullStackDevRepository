package com.files;
import java.io.File;

public class Folderoperationsdemo {
	public static void main(String[] args) {
		//createfolder();
		//createnestedfolder();
		//renamefolder();
		//deletefolder();
		foldercollections();
	}
	
	/*private static void createfolder()
	{
		File f1=new File("D:\\Demo\\hello");
		boolean v1=f1.mkdir();
		System.out.println("whether folder?:" +v1);
	}
	
	private static void createnestedfolder()
	{
		File f1=new File("D:\\Demo\\dev1\\dev2\\dev3\\dev4");
		boolean v2=f1.mkdirs();
		System.out.println("whether nested folder:" +v2);
	}
	
	private static void renamefolder()
	{
		File f1=new File("D:\\Demo\\hello");
		File f2=new File("D:\\Demo\\helloworld");
		boolean v3=f1.renameTo(f2);
		System.out.println("folder has renamed:" +v3);
	}
	
	private static void deletefolder()
	{
		File f2=new File("D:\\Demo\\helloworld");
		boolean v4=f2.delete();
		System.out.println("folder has deleted?:" +v4);
	}*/
	
	private static void foldercollections()
	{
		File f1=new File("D:\\Demo");
		File f[]=f1.listFiles();
		for(int i=0;i<f.length;i++)
		{
			if((f[i].isDirectory())==true)
			{
				String path=f[i].getAbsolutePath();
				System.out.println(path);
			}
		}
	}
}