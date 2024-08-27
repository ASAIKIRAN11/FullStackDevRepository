package com.classtest;

class ten
{
	int fact(int n)
	{
		int fac=1;
		for(int i=n;i>1;i--)
		{
			fac=fac*i;
		}
		return fac;
	}
}
public class pr9 {
	public static void main(String[] args) {
		ten obj=new ten();
		int val=obj.fact(5);
		System.out.print(val);
	}
}