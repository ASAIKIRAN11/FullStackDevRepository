package com.strings;

public class stringbuffer {
	public static void main(String[] args) {
		appenddemo();
		insertstring();
		deletestring();
		reversestring();
	}
	static void appenddemo()
	{
		StringBuffer s=new StringBuffer("java");
		s.append(" programming");
		System.out.println(s);
	}
	static void insertstring()
	{
		StringBuffer s1=new StringBuffer("it is a palace");
		s1.insert(8,"new ");
		System.out.println(s1);
	}
	static void deletestring()
	{
		StringBuffer s2=new StringBuffer("it is a new palace");
		s2.delete(12,18);
		System.out.println(s2);
	}
	static void reversestring()
	{
		StringBuffer s3=new StringBuffer("sai");
		s3.reverse();
		System.out.println(s3);
	}
}