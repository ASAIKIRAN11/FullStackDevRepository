//without using length method,find no of chars in given string.
package com.strings;

public class first {
	public static void main(String[] args) {
		int count=0;
		String s=new String("saikiran");
		
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			count++;
		}
		System.out.println(count);
	}
}