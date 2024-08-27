package com.classtest1;

class animal
{
	void sound()
	{
		System.out.println("the animal makes a sound");
	}
}
class lion extends animal
{
	void sound()
	{
		System.out.println("the lion roars");
	}
}
class dog extends animal
{
	void sound()
	{
		System.out.println("the dog barks ");
	}
}
public class pro10 {
	public static void main(String[] args) {
		lion obj=new lion();
		obj.sound();
		animal obj1=new animal();
		obj1.sound();
		dog obj2=new dog();
		obj2.sound();
	}
}