//DISPLAY THE COMPLETE TABLE.
package com.assignmentonMethod;

class table
{
	void tablee(int n)
	{
		while(n<=20)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(n+ "*" +i+ "=" +n*i);
			}
			System.out.println("--------------------------------------------");
			n++;
		}
	}
}
public class program6 {
	public static void main(String[] args) {
		int n=1;
		table obj1=new table();
		obj1.tablee(n);
	}
}
