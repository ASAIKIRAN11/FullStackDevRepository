//GIVEN 2D DOUBLE ARRAY,FIND THE SUM OF 2ND ROW OF THE ELEMENT.
package com.assignmentonMethod;

class twoddouble
{
	void arr(double a[][])
	{
		double sum=0.0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[1][i];
		}
		System.out.println(sum);
	}
}
public class program5 {
	public static void main(String[] args) {
		double a[][]= {{1.1,2.2,3.3},{4.4,5.5,6.6},{7.7,8.8,9.9}};
		twoddouble obj1=new twoddouble();
		obj1.arr(a);
	}
}



/*class twoddouble {
    double arr(double[][] a) {
        double sum = 0.0;
        for (int i = 0; i < a[1].length; i++) {
            sum += a[1][i];
        }
        return sum;
    }
}
public class program5 {
    public static void main(String[] args) {
        double[][] a = {{1.1, 2.2, 3.3}, {4.4, 5.5, 6.6}, {7.7, 8.8, 9.9}};
        twoddouble obj1 = new twoddouble();
        double sum = obj1.arr(a);
        System.out.println("Sum of the second row: " + sum);
    }
}*/
