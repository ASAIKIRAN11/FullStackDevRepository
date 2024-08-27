package com.classtest;

class thirteen
{
	int average(int a,int b,int c)
	{
		return (a+b+c)/3;
	}
}
public class pr14{
	public static void main(String args[]) {
		thirteen obj=new thirteen();
		int val=obj.average(10,10,10);
		System.out.println(val);
	}
}