package com.constructoroverloading;

class Contract 
{
    String contractTitle;
    String clientName;
    String startDate;
    String endDate;
    double contractValue;
    boolean isActive;

    Contract(String contractTitle) 
    {
        this.contractTitle = contractTitle;
        System.out.println("Contract Title: " + contractTitle);
    }
    Contract(String contractTitle, String clientName) 
    {
        this(contractTitle);  
        this.clientName = clientName;
        System.out.println("Client Name: " + clientName);
    }
    Contract(String contractTitle, String clientName, String startDate, String endDate) 
    {
        this(contractTitle, clientName);  
        this.startDate = startDate;
        this.endDate = endDate;
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
    }
    Contract(String contractTitle, String clientName, String startDate, String endDate, double contractValue, boolean isActive) 
    {
        this(contractTitle, clientName, startDate, endDate); 
        this.contractValue = contractValue;
        this.isActive = isActive;
        System.out.println("Contract Value: $" + contractValue);
        System.out.println("Active: " + isActive);
    }   
    void generateContractSummary() 
    {
        System.out.println("\n--- Contract Details ---");
        System.out.println("Contract Title: " + contractTitle);
        System.out.println("Client Name: " + clientName);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("Contract Value: $" + contractValue);
        System.out.println("Active: " + isActive);
    }
}

public class program5 {
    public static void main(String[] args) {
        Contract obj1=new Contract("Service Agreement");
        Contract obj2=new Contract("Software Development", "XYZ Corp.");
        Contract obj3=new Contract("Maintenance Contract", "ABC Inc.", "2024-01-01", "2025-12-31");
        Contract obj4=new Contract("Consulting Services", "DEF Ltd.", "2023-09-01", "2024-08-31", 150000.0, true);
        obj4.generateContractSummary();  
    }
}

