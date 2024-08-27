package com.files;
import java.io.FileOutputStream;

public class fileoutputstreamdemo {
	public static void main(String[] args) {
		writecontent();
	}

	private static void writecontent() 
	{
		FileOutputStream fout=null;
		try
		{
			fout=new FileOutputStream("D:\\Demo\\FirstFile.txt",true);
			String str="there are mangoes in basket, and those";
			str+="mangoes are riped";
			
			byte b[]=str.getBytes();
			fout.write(b);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}