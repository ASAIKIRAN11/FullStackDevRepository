package com.strings;

public class stringpattern1 {
	public static void main(String[] args) {
		String s="program";
		
		for(int i=1;i<=s.length();i++)
		{
			System.out.println(s.substring(0,i));
		}
		System.out.println();
	}
}