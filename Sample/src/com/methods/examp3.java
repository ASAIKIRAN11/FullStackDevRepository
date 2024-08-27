package com.methods;
class onedimen
{
	void arr(String a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]+"");
		}
	}
}
public class examp3 {
	public static void main(String[] args) {
		String a[]= {"apple","banana","mango","watermelo"};
		onedimen obj1=new onedimen();
		obj1.arr(a);
	}
}