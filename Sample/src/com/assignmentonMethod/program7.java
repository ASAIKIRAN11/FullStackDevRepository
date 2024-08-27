//WRITE A METHOD TO FIND THE NUMBER OF DIGITS IN A GIVEN INTEGER.
package com.assignmentonMethod;

class noofdigit
{
	void totaldigit(int n)
	{
		int c=0;
		while(n>0)
		{
			c++;
			n/=10;
		}
		System.out.println(c);
	}
}
public class program7 {
	public static void main(String[] args) {
		int n=12345;
		noofdigit obj1=new noofdigit();
		obj1.totaldigit(n);
	}
}


/*class noofdigit {
    int totaldigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}

public class program7 {
    public static void main(String[] args) {
        int n = 12345;
        noofdigit obj1 = new noofdigit();
        int numberOfDigits = obj1.totaldigit(n);
        System.out.println("Number of digits: " + numberOfDigits);
    }
}*/