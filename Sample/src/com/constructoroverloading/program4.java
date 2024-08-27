package com.constructoroverloading;

class ReportGeneration {
    String reportTitle;
    String author;
    int totalPages;
    String contentSummary;
    boolean isPublished;

    ReportGeneration(String reportTitle) 
    {
        this.reportTitle = reportTitle;
        System.out.println("Report Title: " + reportTitle);
    }
    ReportGeneration(String reportTitle, String author) 
    {
        this(reportTitle);  
        this.author = author;
        System.out.println("Author: " + author);
    }
    ReportGeneration(String reportTitle, String author, int totalPages) 
    {
        this(reportTitle, author);  
        this.totalPages = totalPages;
        System.out.println("Total Pages: " + totalPages);
    }
    ReportGeneration(String reportTitle, String author, int totalPages, String contentSummary, boolean isPublished) 
    {
        this(reportTitle, author, totalPages);  
        this.contentSummary = contentSummary;
        this.isPublished = isPublished;
        System.out.println("Content Summary: " + contentSummary);
        System.out.println("Published: " + isPublished);
    }
    void generateReport() 
    {
        System.out.println("Report Title: " + reportTitle);
        System.out.println("Author: " + author);
        System.out.println("Total Pages: " + totalPages);
        System.out.println("Content Summary: " + contentSummary);
        System.out.println("Published: " + isPublished);
    }
}

public class program4 {
    public static void main(String[] args) {
        ReportGeneration obj1=new ReportGeneration("Annual Report");
        ReportGeneration obj2=new ReportGeneration("Technical Report", "John Doe");
        ReportGeneration obj3=new ReportGeneration("Market Analysis", "Jane Smith", 120);
        ReportGeneration obj4=new ReportGeneration("Project Documentation", "Alice Johnson", 250, "Detailed project plan and execution", true);
        obj4.generateReport();  
    }
}

