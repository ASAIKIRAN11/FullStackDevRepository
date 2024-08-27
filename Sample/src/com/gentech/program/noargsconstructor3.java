package com.gentech.program;

class country1{
	String name;
	String continent;
	int globalranking;
	country1()
	{
		name="BHARAT";
		continent="ASIA";
		globalranking=1;
		System.out.println(name+" ");
		System.out.println(continent+" ");
		System.out.println(globalranking+" ");
		System.out.println("*************************");
	}
}
class state1{
	String name;
	String designation;
	int ranking;
	state1()
	{
		name="KARNATAKA";
		designation="south";
		ranking=1;
		System.out.println(name+" ");
		System.out.println(designation+" ");
		System.out.println(ranking+" ");
		System.out.println("*************************");
	}
}
class district1{
	String name;
	String location;
	int ranking;
	district1()
	{
		name="VIJAYANAGARA";
		location="HAMPI";
		ranking=1;
		System.out.println(name+" ");
		System.out.println(location+" ");
		System.out.println(ranking+" ");
		System.out.println("*************************");
	}
}
class village1{
	String name;
	String taluk;
	String area;
	village1()
	{
		name="HOSAPETE";
		taluk="VIJAYANAGARA";
		area="MG nagar";
		System.out.println(name+" ");
		System.out.println(taluk+" ");
		System.out.println(area+" ");
		System.out.println("*************************");
	}
}

public class noargsconstructor3 {
	public static void main(String[] args) {
		country1 obj1=new country1();
		state1 obj2=new state1();
		district1 obj3=new district1();
		village1 obj4=new village1();

	}
}
