package com.files;
import java.io.FileReader;

public class Charfilereaderdemo {
	public static void main(String[] args) {
		readcontent();
	}

	private static void readcontent() 
	{
		FileReader fr=null;
		int n=0;
		try
		{
			fr=new FileReader("D:\\Demo\\FirstFile.txt");
			while(true)
			{
				if(n==-1)
				{
					break;
				}
				char ch=(char)n;
				System.out.println(ch);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
