package com.methods;
class twodim
{
	void arr(char a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[1][i]+"");
			}
		}
	}
}
public class examp4 {
	public static void main(String[] args) {
		char a[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		twodim obj1=new twodim();
		obj1.arr(a);
	}
}
