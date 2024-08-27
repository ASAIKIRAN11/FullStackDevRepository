//THE METHOD HAS TO RETURN SQUARE OF EACH NUMBER FROM 1-10.
package com.returnmethod;

class square
{
	int squar(int num)
	{
		return num*num;
	}
}
public class progr6 {
	public static void main(String[] args) {
		square obj1=new square();
		for(int i=1;i<=10;i++)
		{
			System.out.println(obj1.squar(i));
		}
	}
}