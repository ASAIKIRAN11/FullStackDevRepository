package com.polymor;

abstract class job 
{
    abstract void jobdescription();
}
class engineer extends job 
{
    void jobdescription() 
    {
        System.out.println("engineer works in IT company");
    }
}
class doctor extends job 
{
    void jobdescription() 
    {
        System.out.println("doctor works in hospital");
    }
}
class teacher extends job 
{
    void jobdescription() 
    {
        System.out.println("teacher works in school");
    }
}
public class examp2 {
    public static void main(String[] args) {
        job job=null;
        engineer obj=new engineer();
        doctor obj1=new doctor();
        teacher obj2=new teacher();

        job=obj;
        job.jobdescription();

        job=obj1;
        job.jobdescription();

        job=obj2;
        job.jobdescription();
    }
}
