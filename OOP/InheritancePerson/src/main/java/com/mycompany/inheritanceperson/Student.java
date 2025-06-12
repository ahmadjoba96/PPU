package com.mycompany.inheritanceperson;

public class Student extends Person {

    private double average;
    private String major;

    public Student(String name, int id, BirthDate Bdate, double average, String major) {
        super(name, id, Bdate);
        this.average = average;
        this.major = major;
    }

    public Student() {
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Average: " + average + ", Major: " + major;
    }
}
