//WE CANT CREATE OBJECT OR INSTANCE FOR AN INTERFACE, BUT WE CAN PROVIE OBJECT REFERENCE.
package com.interfac;

interface Univers
{
	void showuniversityname(String name);
}
interface Coll
{
	void showcollegename(String name);
}
class gcemcol implements Univers,Coll
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
		System.out.println("address:" +address);
	}
}
public class case4 {
	public static void main(String[] args) {
		Univers obj=new gcemcol();
		Coll obj1=new gcemcol();
		gcemcol obj2=new gcemcol();
		obj2.displayaddress("myaskeri");
		obj1.showcollegename("guru");
		obj.showuniversityname("HAMPI");
	}
}