//IF A ABSTRACT CLASS CONTAIN STATIC BLOCK ALONE,WRITE A PROGRAM TO EXECUTE.
package com.abstaract;

abstract class college
{
	static String collname;
	static int collid;
	static String location;
	static
	{
		collname="GCEM";
		System.out.println("College Name :"+collname);
		collid=001;
		System.out.println("College Id :"+collid);
		location="WHTEFIELD";
		System.out.println("address :"+location);
	}
}
class subcollege extends college
{
	
}
public class exp2 {
	public static void main(String[] args) {
		college obj1=new subcollege();
	}
}