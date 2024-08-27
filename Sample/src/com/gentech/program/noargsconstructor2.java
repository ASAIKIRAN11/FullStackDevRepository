package com.gentech.program;

class twowheel{
	int wheels;
	String name;
	String brand;
	twowheel()
	{
		wheels=2;
		name="interceptor";
		brand="royal enfield";
		System.out.println(wheels+" ");
		System.out.println(name+" ");
		System.out.println(brand+" ");
		System.out.println("***************");
	}
}
class fourwheel{
	int wheels;
	String name;
	String brand;
	fourwheel()
	{
		wheels=4;
		name="fortuner";
		brand="toyota";
		System.out.println(wheels+" ");
		System.out.println(name+" ");
		System.out.println(brand+" ");
		System.out.println("***************");
	}
}
class heavyvehicle{
	int wheels;
	String name;
	String brand;
	heavyvehicle()
	{
		wheels=8;
		name="monster truck";
		brand="TATA";
		System.out.println(wheels+" ");
		System.out.println(name+" ");
		System.out.println(brand+" ");
		System.out.println("***************");
	}
}

public class noargsconstructor2 {
	public static void main(String[] args) {
		twowheel obj1=new twowheel();
		fourwheel obj2=new fourwheel();
		heavyvehicle obj3=new heavyvehicle();

	}
}
