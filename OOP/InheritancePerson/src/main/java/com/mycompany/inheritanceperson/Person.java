package com.mycompany.inheritanceperson;

public class Person {

    private String name;
    private int id;
    private BirthDate Bdate;

    public Person() {
    }

    public Person(String name, int id, int day, int month, int year) {
        this.name = name;
        this.id = id;
        this.Bdate = new BirthDate(day, month, year);
    }

    public Person(String name, int id, BirthDate Bdate) {
        this.name = name;
        this.id = id;
        this.Bdate = Bdate;
    }

    public BirthDate getBdate() {
        return Bdate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setBdate(BirthDate Bdate) {
        this.Bdate = Bdate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return "Name: " + name + ", ID: " + id + ", Birth Date: "
                + Bdate.getDay() + "/" + Bdate.getMonth() + "/" + Bdate.getYyyy();
    }
}
