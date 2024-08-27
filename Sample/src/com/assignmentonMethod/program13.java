package com.assignmentonMethod;

class sumprim
{
	void sumpri()
	{
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			int flag=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag++;
					break;
				}
			}
			if(flag==0)
			{
				sum+=i;
			}
		}
		System.out.println(sum+" ");
	 }
}
public class program13 {
	public static void main(String[] args) {
		sumprim obj1=new sumprim();
		obj1.sumpri();
	}
}
