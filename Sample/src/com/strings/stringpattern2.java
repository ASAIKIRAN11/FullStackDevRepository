package com.strings;

public class stringpattern2 {
	public static void main(String[] args) {
		String s="program";
		
		for(int i=1;i<=s.length();i++)
		{
			System.out.println(s.substring(0,i));
		}
		for(int i=s.length()-1;i>1;i--)
		{
			System.out.println(s.substring(0,i));
		}
		System.out.println();
	}
}