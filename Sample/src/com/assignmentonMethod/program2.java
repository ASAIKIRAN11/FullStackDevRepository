//GIVEN INTEGER 1D ARRAY, FIND THE SUM OF ALL ELEMENTS.
package com.assignmentonMethod;

class onedinteger
{
	void arr(int a[])
	{
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum+=a[i];
		}
		System.out.print(sum);
	}
}
public class program2 {
	public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	onedinteger obj1=new onedinteger();
	obj1.arr(a);
	}
}



/*class onedinteger {
    int arr(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}

public class program2 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        onedinteger obj1 = new onedinteger();
        int sum = obj1.arr(a);
        System.out.println("Sum: " + sum);
    }
}*/