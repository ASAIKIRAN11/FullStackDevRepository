//ABSTRACT CLASS CONTAIN INSTANCE BLOCK ALONE,WRITE PRGRAM TO EXECUTE INSTANCE BLOCK ALONE.
package com.abstaract;

abstract class college1
{
	String collname;
	int collid;
	String address;
	
	{
		collname="national pu";
		System.out.println("college name:" +collname);
		collid=345;
		System.out.println("college id:" +collid);
		address="vijayanagara";
		System.out.println("address:" +address);
	}
}
class college2 extends college1
{
	
}
public class exp3 {
	public static void main(String[] args) {
		college2 ob1=new college2();
	}
}