//7th
package com.classtest2;

class student
{
	{
		String name="sai";
		System.out.println("name:" +name);
	}
	static
	{
		System.out.println("static block");
	}
}
class city
{
	String cityname;
	String statename;
	city(String cityname,String statename)
	{
		student obj=new student();
		this.cityname=cityname;
		this.statename=statename;
		System.out.println("cityname:" +cityname);
		System.out.println("statename:" +statename);
	}
}
public class prog5{
	public static void main(String[] args) {
		city obj1= new city("hospet","karnataka");
	}
}