package com.polymor;

abstract class ITcompany
{
    abstract void position();
}
class webdeveloper extends ITcompany 
{
    void position() 
    {
        System.out.println("webdeveloper develops good webpages and apps");
    }
}
class gamedeveloper extends ITcompany 
{
    void position() 
    {
        System.out.println("appdeveloper develops apps and update software");
    }
}
class cybersecurity extends ITcompany 
{
    void position() 
    {
        System.out.println("maintains good cyber security data and information");
    }
}
public class examp5 {
    public static void main(String[] args) {
        ITcompany it=null;
        webdeveloper obj=new webdeveloper();
        gamedeveloper obj1=new gamedeveloper();
        cybersecurity obj2=new cybersecurity();

        it=obj;
        it.position();
        
        it=obj1;
        it.position();
        
        it=obj2;
        it.position();
    }
}