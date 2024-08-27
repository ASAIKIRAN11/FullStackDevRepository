//WRITE A METHOD TO FIND THE SUM OF EACH DIGIT IN A GIVEN NUMBER.
package com.assignmentonMethod;

class sumofdigit
{
	void digit(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum+=rem;
			n/=10;
		}
		System.out.println(sum);
	}
}
public class program8 {
	public static void main(String[] args) {
		int n=56789;
		sumofdigit obj1=new sumofdigit();
		obj1.digit(n);
	}
}


/*class sumofdigit
{
	 int digit(int n)
	 {
		 int sum=0;
		 while(n>0)
		 {
			 int rem=n%10;
			 sum+=rem;
			 n/=10;
		 }
		 return sum;
	 }
}
public class program8{
	public static void main(String args[]) {
		int n=123456789;
		sumofdigit obj1=new sumofdigit();
		int val=obj1.digit(n);
		System.out.println(val);
	}
}*/