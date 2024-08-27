package com.polymor;

abstract class document 
{
    abstract void open();
}
class worddocument extends document 
{
    void open() 
    {
        System.out.println("word document is opened");
    }
}
class pptdocument extends document 
{
    void open() 
    {
        System.out.println("ppt document is opened");
    }
}
class exceldocument extends document 
{
    void open() 
    {
        System.out.println("excel documnet is opened");
    }
}
public class examp3 {
    public static void main(String[] args) {
        document document=null;
        worddocument obj=new worddocument();
        pptdocument obj1= new pptdocument();
        exceldocument obj2=new exceldocument();

        document=obj;
        document.open();

        document=obj1;
        document.open();

        document=obj2;
        document.open();
    }
}