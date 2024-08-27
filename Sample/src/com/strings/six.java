//verify the given string is palindrome?
package com.strings;

public class six{
	public static void main(String[] args) {
		String s="GADAG";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		
		if(rev.equals(s))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}