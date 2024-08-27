package com.classtest1;

class stringvalidation
{
	static int count(String str) throws Exception
	{
		if(str==null)
		{
			throw new Exception("give a valid input");
		}
		return str.length();
	}
}
public class pro7 {
	public static void main(String[] args) {
		try
		{
			int val=stringvalidation.count("saikiran");
			System.out.println(val);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}