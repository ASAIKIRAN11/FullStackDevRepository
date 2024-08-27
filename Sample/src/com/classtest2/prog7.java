//10th
package com.classtest2;

class instance2
{
	void mul(int x,int y)
	{
		int res=x*y;
		System.out.println("Multiply result:"+res);
	}
	static void add(int x,int y)
	{
		int res=x+y;
		System.out.println("Addition result:"+res);
	}
	instance2()
	{
		mul(20,20);
		instance2.add(100,100);
	}
}
public class prog7{
	public static void main(String[] args) {
		instance2 obj=new instance2();
	}
}