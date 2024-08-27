package com.files;
import java.io.FileWriter;

public class Charfilewriterdemo {
	public static void main(String[] args) {
		writecontent();
	}

	private static void writecontent() 
	{
		FileWriter fw=null;
		try
		{
			fw=new FileWriter("D:\\Demo\\FirstFile.txt",true);
			
			String str="there are apples in basket and those";
			str+="apples are riped";
			
			char ch[]=str.toCharArray();
			fw.write(ch);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fw.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}