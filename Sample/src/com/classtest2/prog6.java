//9th
package com.classtest2;

class instance1
{
	void mul(int a,int b)
	{
		int res=a*b;
		System.out.println("Multiply result :"+res);
	}
	static void add(int a,int b)
	{
		int res=a+b;
		System.out.println("Addition result :"+res);
	}
	static
	{
		instance1 obj=new instance1();
		obj.mul(9,10);
		instance1.add(10, 100);
	}
}
public class prog6 {
	public static void main(String[] args) {
		instance1 obj1=new instance1();
	}
}