package com.classtest;

class fifteen
{
	int element()
	{
		int count=0;
		for(int i=50;i>=30;i--)
		{
			if(i%4==0)
			{
				count++;
			}
		}
		return count;
	}
}
public class pr16 {
	public static void main(String[] args) {
		fifteen obj=new fifteen();
		int val=obj.element();
		System.out.println(val);
	}
}