package com.classtest1;

abstract class Test1
{	
	 abstract void m1();
}
interface I1
{	
	void m2();
}
interface I2
{	
	void m3();
}
class SubClass extends Test1 implements I1,I2
{
	@Override
	public void m3() 
	{
		System.out.println("m3 from Interface 2");
	}
	@Override
	public void m2() 
	{
		System.out.println("m2 from Interface 1");
	}
	@Override
	public void m1() 
	{
		System.out.println("m1 from abstract class-Test");
	}
}
public class pro2 {
	public static void main(String[] args) {
		SubClass obj=new SubClass();
		obj.m1();
		obj.m2();
		obj.m3();
	}
}