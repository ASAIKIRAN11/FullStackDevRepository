//CREATE AN INTERFACE & BASED SUBCLASS OBJECT EXECUTE ALL THE MEMBERS.
package com.interfac;

interface University
{
	void showuniversityname(String name);
}
class gcemcollege implements University
{
	public void showuniversityname(String name)
	{
		System.out.println("university name is:" +name);
	}
	void displayaddress(String address)
	{
		System.out.println("address is:" +address);
	}
}
public class case1 {
	public static void main(String[] args) {
		gcemcollege obj=new gcemcollege();
		obj.showuniversityname("VTU");
		obj.displayaddress("belegavi");
	}
}