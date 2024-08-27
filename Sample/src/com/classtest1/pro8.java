package com.classtest1;

class bank
{
	int accountno;
	String accountholdername;
	public int getaccountno()
	{
		return accountno;
	}
	public void setaccountno(int accountno)
	{
		this.accountno=accountno;
	}
	public String getaccountholdername()
	{
		return accountholdername;
	}
	public void setaccountholdername(String accountholdername)
	{
		this.accountholdername=accountholdername;
	}
}
public class pro8 {
	public static void main(String[] args) {
		bank obj=new bank();
		obj.setaccountno(123456);
		obj.setaccountholdername("namratha");
		
		int accno=obj.getaccountno();
		System.out.println(accno);
		
		String name=obj.getaccountholdername();
		System.out.println(name);
	}
}