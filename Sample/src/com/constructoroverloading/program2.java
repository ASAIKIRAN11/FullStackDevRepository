package com.constructoroverloading;

class invoice
{
	invoice(String name)
	{
		System.out.println("name :" +name);
	}
	invoice(double gst)
	{
		this("harish");
		System.out.println("gst is :" +gst);
	}
	invoice(String type,int quantity)
	{
		this(12000);
		System.out.println("type is:" +type);
		System.out.println("quantity is :" +quantity);
	}
}

public class program2{
	public static void main(String args[]) {
		invoice obj1=new invoice("harishh");
		invoice obj2=new invoice(10000);
		invoice obj3=new invoice("electronics",99);
	}
}