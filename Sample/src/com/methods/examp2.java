package com.methods;

class Divide
{
	void six()
	{
		int count=0;
		for(int i=50;i<=150;i++)
		{
			if(i%6==0)
			{
				count++;
			}
		}
		System.out.println(count+"");
	}
}
public class examp2 {
	public static void main(String[] args) {
		Divide obj1=new Divide();
		obj1.six();
	}
}
