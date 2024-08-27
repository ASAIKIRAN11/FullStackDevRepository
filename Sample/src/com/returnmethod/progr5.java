//THE METHOD HAS TO RETURN FACTORIAL OF A GIVEN NUMBER.
package com.returnmethod;

class factorial
{
	int fact(int num)
	{
		int fac=1;
		for(int i=num;i>1;i--)
		{
			fac=fac*i;
		}
		return fac;
	}
}
public class progr5 {
	public static void main(String[] args) {
		int num=5;
		factorial obj1=new factorial();
		int val=obj1.fact(num);
		System.out.print(val);
	}
}
