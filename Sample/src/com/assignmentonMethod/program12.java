package com.assignmentonMethod;

class countpri
{
	void countpr()
	{
		int count=0;
		for(int i=50;i<=150;i++)
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
				count++;
			}
		}
		System.out.println(count+" ");
	}
}
public class program12 {
	public static void main(String[] args) {
		countpri obj1=new countpri();
		obj1.countpr();
	}
}
