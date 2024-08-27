package com.gentech.program;

class student1{
    String name;
    String year;
    student1()
    {
    	name="deepu";
        year="4th year 7th sem";
        System.out.println(name+" ");
        System.out.println(year+" ");
        System.out.println("******************");
    }
}
class library1{
    int libid;
    int noofbookstook;
    library1()
    {
    	libid=20;
        noofbookstook=2;
        System.out.println(libid+" ");
        System.out.println(noofbookstook+" ");
        System.out.println("**************************");
    }
}
class sports1{
    String name;
    String competion;
    sports1()
    {
    	 name="batminton";
         competion="district-level";
         System.out.println(name+" ");
         System.out.println(competion+" ");
         System.out.println("*********************");
    }
}
class computerlabs1{
    int numbers;
    String name;
    computerlabs1()
    {
    	numbers=3;
        name="DAA lab";
        System.out.println(numbers+" ");
        System.out.println(name+" ");
    }
}

public class noargsconstructor5 {
    public static void main(String args[]){
        student1 obj1=new student1();
        library1 obj2=new library1();
        sports1 obj3=new sports1();
        computerlabs1 obj4=new computerlabs1(); 
    }
}
