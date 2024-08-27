package com.constructoroverloading;

class profile
{
	profile(String firstname,String lastname)
	{
		System.out.println("firstname :" +firstname);
		System.out.println("lastname :" +lastname);
	}
	profile(int age)
	{
		this("sai","kiran");
		System.out.println("age :" +age);
	}
	profile(String emailid)
	{
		this(21);
		System.out.println("emailid :" +emailid);
	}
}
public class program1{
	public static void main(String args[]) {
		profile obj1=new profile("sai","kiran");
		profile obj2=new profile(21);
		profile obj3=new profile("sai@gmail");
	}
}