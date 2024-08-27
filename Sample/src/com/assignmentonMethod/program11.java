package com.assignmentonMethod;

class prime
{
	void isprime()
	{
		for(int i=2;i<=50;i++)
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
				System.out.println(i);
		}
	}
}
public class program11 {
	public static void main(String[] args) {
		prime obj1=new prime();
		obj1.isprime();
	}
}
