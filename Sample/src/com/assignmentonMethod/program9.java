//FOR THE GIVEN NUMBER IT HAS TO DISPLAY COMPLETE TABLE.
package com.assignmentonMethod;

class tabl
{
	void tab(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+ "*" +i+ "=" +n*i);
		}
	}
}
public class program9 {
	public static void main(String[] args) {
		int n=5;
		tabl obj1=new tabl();
		obj1.tab(n);
	}
}

/*class tabl
{
	String tab(int n,int i)
	{
		return n+ "*" +i+ "=" +(n*i);
	}
}
public class program9{
	public static void main(String args[]){
	int n=6;
	tabl obj1=new tabl();
	for(int i=0;i<=10;i++)
	{
		System.out.println(obj1.tab(n,i));
	}
}
}*/