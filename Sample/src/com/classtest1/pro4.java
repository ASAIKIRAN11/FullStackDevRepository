package com.classtest1;

class callbyreference
{
	int a,b;
	void calculation(callbyreference O)
	{
		O.a+=100;
		O.b*=9;
		System.out.println("in method a value is:" +O.a);
		System.out.println("in method b value is:" +O.b);
	}
}
public class pro4{
		public static void main(String args[]){
			callbyreference O=new callbyreference();
			O.a=100;
			O.b=50;
			System.out.println("the value of a:" +O.a);
			System.out.println("the value of b:" +O.b);
			O.calculation(O);
			System.out.println("after method,a is:" +O.a);
			System.out.println("after method,b is:" +O.b);
	}
}