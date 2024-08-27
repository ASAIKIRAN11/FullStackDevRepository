//without using replace, replace the oldstring with newstring.
package com.strings;

class ReplaceString
{
    static String replaceTheString(String str,String s1,String s2)
    {
        String res="";
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals(s1))
            {
                arr[i]=s2;
            }
        }
        for(String s:arr)
        {
            res+=s;
            res+=" ";
        }
        return res;
    }
}
public class third{
    public static void main(String[] args) {
        String res=ReplaceString.replaceTheString("gandhi veersavarkar bhagat singh","gandhi","godse");
        System.out.println(res);
    }
}