package com.classtest;

class seventeen
{
	static int num()
	{
		String num="12345678";
		return Integer.parseInt(num);
	}
}
public class pr18 {
    public static void main(String[] args) {
    	int val=seventeen.num();
    	System.out.println(val);
    }
}