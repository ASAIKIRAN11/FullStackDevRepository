package com.strings;

public class stringbulider {
	public static void main(String[] args) {
		appenddemo();
		insertstring();
		deletestring();
		reversestring();
	}
	static void appenddemo()
	{
		StringBuilder s=new StringBuilder("java");
		s.append(" programming");
		System.out.println(s);
	}
	static void insertstring()
	{
		StringBuilder s1=new StringBuilder("it is a palace");
		s1.insert(8,"new ");
		System.out.println(s1);
	}
	static void deletestring()
	{
		StringBuilder s2=new StringBuilder("it is a new palace");
		s2.delete(12,18);
		System.out.println(s2);
	}
	static void reversestring()
	{
		StringBuilder s3=new StringBuilder("sai");
		s3.reverse();
		System.out.println(s3);
	}
}