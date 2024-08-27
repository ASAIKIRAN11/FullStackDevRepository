//GIVEN STRING 1D ARRAY, READ 2ND HALF OF THE ELEMENT.
package com.assignmentonMethod;

class onedstring
{
	void arr(String a[])
	{
		for(int i=a.length-1;i>=(a.length/2);i--)
		{
			System.out.println(a[i]+" ");
		}
	}
}
public class problem1 {
	public static void main(String[] args) {
		String a[]= {"bat","ball","wickets","virat","rohit","hardik"};
		onedstring obj1=new onedstring();
		obj1.arr(a);
	}
}



/*class onedstring {
    String[] arr(String[] a) {
        int length = a.length;
        int halfLength = length / 2;
        String[] reversed = new String[halfLength];

        for (int i = length - 1, j = 0; i >= halfLength; i--, j++) {
            reversed[j] = a[i];
        }
        return reversed;
    }
}

public class problem1 {
    public static void main(String[] args) {
        String[] a = {"bat", "ball", "wickets", "virat", "rohit", "hardik"};
        onedstring obj1 = new onedstring();
        String[] result = obj1.arr(a);
        
        for (String s : result) {
            System.out.println(s);
        }
    }
}*/
