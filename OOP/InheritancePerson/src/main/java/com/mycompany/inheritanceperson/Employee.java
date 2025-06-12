package com.mycompany.inheritanceperson;

public class Employee extends Person {

    private double salary;

    public Employee(String name, int id, BirthDate Bdate, double salary) {
        super(name, id, Bdate);
        this.salary = salary;
    }

    public Employee() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Salary: " + salary;
    }
}
