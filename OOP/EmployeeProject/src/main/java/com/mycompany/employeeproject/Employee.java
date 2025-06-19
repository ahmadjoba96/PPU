package com.mycompany.employeeproject;


import com.mycompany.employeeproject.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Employee { 
    private String name ; 
    private double salary; 
    private Date hire_date; 

    public Employee(String name, double salary, Date hire_date) {
        this.name = name;
        this.salary = salary;
        this.hire_date = hire_date;
    }
    
    

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    } 
    public double getAnuualSaalry(){
        return this.getSalary()*12; 
    } 
    public double BonusSalary(double per){ 
        return this.getSalary()*(1+per); 
        
    }
    public String getEmployeeInfo(){
        return "Name =" +this.getName() +" Salary = " +this.getSalary() +" Date = "+this.getHire_date().getDate(); 
    }
    
    
    
}
