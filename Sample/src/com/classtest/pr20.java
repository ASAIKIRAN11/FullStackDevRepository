package com.classtest;

class twenty
{
	static char element()
	{
		char ch[]= {'x','y','w','q','u','d'};
		return ch[5];
	}
}
public class pr20 {
	public static void main(String[] args) {
		char val=twenty.element();
		System.out.print(val);
	}
}