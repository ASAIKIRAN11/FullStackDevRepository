package com.classtest1;

interface University
{
	void showuniversityname(String name);
}
interface College extends University
{
	void showcollegename(String name);
}
class gcemcollege implements College
{
	@Override
	public void showuniversityname(String name)
	{
		System.out.println("university name is:" +name);
	}
	@Override
	public void showcollegename(String name)
	{
		System.out.println("college name is:" +name);
	}
	void displayaddress(String address)
	{
		System.out.println("address is:" +address);
	}
}
public class pro6{
	public static void main(String[] args){
		gcemcollege obj=new gcemcollege();
		obj.displayaddress("vijayanagara");
		obj.showcollegename("national");
		obj.showuniversityname("VTU");
	}
}