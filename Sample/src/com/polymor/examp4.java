package com.polymor;

abstract class internet
{
	abstract void sim();
}
class bsnl extends internet
{
	void sim()
	{
		System.out.println("BSNL bharat ka pride");
	}
}
class jio extends internet
{
	void sim()
	{
		System.out.println("jio fiber net");
	}
}
class airtel extends internet
{
	void sim()
	{
		System.out.println("airtel fiber");
	}
}
public class examp4 {
	public static void main(String[] args) {
		internet inter=null;
		bsnl obj=new bsnl();
		jio obj1=new jio();
		airtel obj2=new airtel();
		
		inter=obj;
		inter.sim();
		
		inter=obj1;
		inter.sim();
		
		inter=obj2;
		inter.sim();
	}
}