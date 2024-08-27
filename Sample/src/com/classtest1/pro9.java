package com.classtest1;

abstract class internet
{
	abstract void sim();
}
class jio extends internet
{
	void sim()
	{
		System.out.println("mukesh ambani");
	}
}
class bsnl extends internet
{
	void sim()
	{
		System.out.println("Ratan TATA");
	}
}
class airtel extends internet
{
	void sim()
	{
		System.out.println("sunil mittal");
	}
}
public class pro9 {
	public static void main(String[] args) {
		internet net=null;
		jio obj=new jio();
		bsnl obj1=new bsnl();
		airtel obj2=new airtel();
		
		net=obj;
		net.sim();
		
		net=obj1;
		net.sim();
		
		net=obj2;
		net.sim();
	}
}