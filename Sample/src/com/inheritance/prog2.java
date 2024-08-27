//WAP IN HYBRID INHERITANCE
package com.inheritance;

class read1
{
	void sub(int x,int y)
	{
		System.out.println("result :" +(x-y));
	}
}
class read2 extends read1
{
	void div(int a,int b)
	{
		System.out.println("result :" +(a/b));
	}
}
class read3 extends read1
{
	void mul(int a,int b)
	{
		System.out.println("result :" +(a*b));
	}
}
class read4 extends read3
{
	void add(int a,int b)
	{
		System.out.println("result :" +(a+b));
	}
}
public class prog2 {
	public static void main(String args[]) {
		read4 obj1=new read4();
		obj1.add(5, 5);
		obj1.mul(5, 5);
		read2 obj2=new read2();
		obj2.sub(5,1);
		obj2.div(12, 12);
	}
}
		