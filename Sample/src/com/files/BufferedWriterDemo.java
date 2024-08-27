package com.files;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		writecontent();
	}

	private static void writecontent() 
	{
		FileWriter fw=null;
		BufferedWriter bw=null;
		try
		{
			fw=new FileWriter("D:\\Demo\\FirstFile.txt",true);
			bw=new BufferedWriter(fw);
			
			bw.write("the children are playing in ground");
			bw.newLine();
			bw.write("virat is king of cricket");
			bw.newLine();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}