package com.classtest1;

abstract class test
{
	void m1()
	{
		System.out.println("it is an instance method");
	}
	static
	{
		System.out.println("it is a static block");
	}
}
class test2 extends test
{
	
}
public class pro3 {
	public static void main(String[] args) {
		test2 obj=new test2();
		obj.m1();
	}
}