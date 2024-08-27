package com.methods;
class Addition
{
	void tot()
	{
		int sum=0;
		for(int i=0;i<=50;i++)
		{
			sum+=i;
		}
		System.out.println(sum+ " ");
	}
}
public class examplewithnoparameters {
	public static void main(String[] args) {
		Addition obj1=new Addition();
		obj1.tot();
	}
}