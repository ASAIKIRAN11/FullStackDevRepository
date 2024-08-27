//without using reverse method,reverse the given using charAt string. 

/*package com.strings;

public class second {
	public static void main(String[] args) {
		String s=new String("sai");
		String reverse=" ";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse+=s.charAt(i);
		}
		System.out.println(reverse);
	}
}*/


//using tocharArray.
/*package com.strings;

public class second {
	public static void main(String[] args) {
		String s=new String("sai");
		String reverse=" ";
		char[] c=s.toCharArray();
		
		for(int i=c.length-1;i>=0;i--)
		{
			reverse+=c[i];
		}
		System.out.println(reverse);
	}
}*/


//using substring.
package com.strings;

public class second {
	public static void main(String[] args) {
		String s=new String("sai");
		String reverse=" ";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse+=s.substring(i,i+1);
		}
		System.out.println(reverse);
	}
}