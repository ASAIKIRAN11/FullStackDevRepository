//COMPLETE TABLE FROM GIVEN INPUT NUMBER.
package com.returnmethod;

class tabl
{
	String tab(int num,int i)
	{
		return num+ "*" +i+ "=" +(num*i);
	}
}
public class progr9 {
	public static void main(String[] args) {
		int num=17;
		tabl obj1=new tabl();
		for(int i=1;i<=10;i++)
		{
			System.out.println(obj1.tab(num,i));
		}
	}
}