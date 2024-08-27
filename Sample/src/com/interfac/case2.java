//A SINGLE SUBCLASS IMPLEMENTS MORE THAN ONE INTERFACE.
package com.interfac;

interface Universit
{
	void showuniversityname(String name);
}
interface College
{
	void showcollegename(String name);
}
class gcemcolleg implements College,University
{
	@Override
	public void showuniversityname(String name)
	{
		System.out.println("university name:" +name);
	}
	@Override
	public void showcollegename(String name)
	{
		System.out.println("college name:" +name);
	}
	void displayaddress(String address)
	{
		System.out.println("address :" +address);
	}
}
public class case2 {
	public static void main(String[] args) {
		gcemcolleg obj=new gcemcolleg();
		obj.showuniversityname("VTU");
		obj.showcollegename("gopalan");
		obj.displayaddress("whitefield");
	}
}