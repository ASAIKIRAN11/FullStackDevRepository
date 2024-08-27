package com.polymor;

abstract class geometricfigure
{
	abstract void area();
}
class square extends geometricfigure
{
	void area()
	{
		int side=4;
		System.out.println("area of square is:" +(side*side));
	}
}
class rectangle extends geometricfigure
{
	void area()
	{
		int length=12;
		int breadth=12;
		System.out.println("area of rectangle:" +(length*breadth));
	}
}
class circle extends geometricfigure
{
	void area()
	{
		double radius=3.5;
		System.out.println("area of circle:" +(3.14*radius*radius));
	}
}
public class examp1 {
	public static void main(String[] args) {
		geometricfigure figure=null;
		square obj=new square();
		rectangle obj1=new rectangle();
		circle obj2=new circle();
		
		figure=obj;
		figure.area();
		
		figure=obj1;
		figure.area();
		
		figure=obj2;
		figure.area();
	}
}