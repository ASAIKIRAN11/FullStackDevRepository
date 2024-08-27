//THE METHOD HAS TO RETURN THE RESULT OF THE 7TH TABLE IN REVERSE ORDER.
package com.returnmethod;

class tableee
{
	String tablee(int num,int i)
	{
		return num+ "*" +i+ "=" + (num*i);
	}
}
public class progr8 {
	public static void main(String[] args) {
		int num=7;
		tableee obj1=new tableee();
		for(int i=10;i>=1;i--)
		{
			System.out.println(obj1.tablee(num,i));
		}
	}
}
