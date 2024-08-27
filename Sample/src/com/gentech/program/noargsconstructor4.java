package com.gentech.program;

class product1
{
	String name;
	String brand;
	int price;
	product1()
	{
		name="jackets";
		brand="netplay";
		price=1000;
		System.out.println(name+" ");
		System.out.println(brand+" ");
		System.out.println(price+" ");
		System.out.println("*************************");
	}
}
class sales1
{
	String name;
	String discount;
	int price;
	sales1()
	{
		name="festival";
		discount="20% off";
		price=799;
		System.out.println(name+" ");
		System.out.println(discount+" ");
		System.out.println(price+" ");
		System.out.println("*************************");
	}
}
class order1{
	String type;
	String location;
	String paymentmode;
	order1()
	{
		type="online";
		location="home";
		paymentmode="gpay or creditcard";
		System.out.println(type+" ");
		System.out.println(location+" ");
		System.out.println(paymentmode+" ");
		System.out.println("*************************");
	}
}
class inventory1{
	String name;
	String location;
	String area;
	inventory1()
	{
		name="warehouse";
		location="VIJAYANAGARA";
		area="MG nagar";
		System.out.println(name+" ");
		System.out.println(location+" ");
		System.out.println(area+" ");
		System.out.println("*************************");
	}
}

public class noargsconstructor4 {
	public static void main(String[] args) {
		product1 obj1=new product1();
		sales1 obj2=new sales1();
		order1 obj3=new order1();
		inventory1 obj4=new inventory1();

	}
}
