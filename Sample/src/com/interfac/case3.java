//AN INTERFACE EXTENDS ANOTHER INTERFACE AT ANY LEVEL.
package com.interfac;

interface Universi
{
	void showuniversityname(String name);
}
interface Colle extends Universi
{
	void showcollegename(String name);
}
class gcemcolle implements Colle
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
public class case3 {
	public static void main(String[] args) {
		gcemcolle obj=new gcemcolle();
		obj.displayaddress("vijayanagara");
		obj.showcollegename("national");
		obj.showuniversityname("JCI");
	}
}