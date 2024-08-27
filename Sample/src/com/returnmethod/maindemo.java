package com.returnmethod;

class Isprime
{
	boolean isprime(int num)
	{
		boolean flag=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true) return true;
		else
			return false;
	}
}
public class maindemo {
	public static void main(String[] args) {
		Isprime obj1=new Isprime();
		boolean val=obj1.isprime(9);
		System.out.println(val);
		System.out.println("------------------------------");
		
		//Display prime no in btw 50-100
		for(int j=50;j<=100;j++)
		{
			if(obj1.isprime(j)==true)
				System.out.print(j+ " ");
		}
		System.out.println("----------------------------------");
		
		//Display prime no btw 50-1
		for(int k=50;k>=2;k--)
		{
			if(obj1.isprime(k)==true)
				System.out.print(k+ " ");
		}
		System.out.println("----------------------------------");
		
		//Find the count of prime no btw 100-200
		int count=0;
		for(int i=100;i<=200;i++)
		{
			if(obj1.isprime(i)==true)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
