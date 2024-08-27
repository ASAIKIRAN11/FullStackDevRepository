//In Multilevel Inheritance each class Contains same method name Signature based on Sub class object execute all the methods.
package com.inheritance;

class Calculus1 
{
  void addition1(int a,int b) 
  {
      System.out.println("Addition of 2 Digits : " +(a+b));
  }
}
class Calculus2 extends Calculus1 
{
  void addition1(int a,int b)
  {
      System.out.println("total of 2 Digits : " +(a+b));
  }
}
class Calculus3 extends Calculus2 
{
  void addition1(int a,int b)
  {
      System.out.println("result of 2 Digits : " +(a+b));
  }
}
public class prog7 {
  public static void main (String [] args) {
      Calculus3 O1 = new Calculus3();
      O1.addition1(20,30);
      O1.addition1(10,2);
      Calculus2 O2=new Calculus2();
      O2.addition1(21,39);
      O2.addition1(77,33);
      Calculus1 O3=new Calculus1();
      O3.addition1(7,7);
      O3.addition1(11,22);
  }
}