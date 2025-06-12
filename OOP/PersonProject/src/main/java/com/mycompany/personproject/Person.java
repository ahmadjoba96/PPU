
package com.mycompany.personproject;


public class Person {
    private String name;
    private int id;
    private BirthDate bd;

    public Person(String name, int id, BirthDate bd) {
        this.name = name;
        this.id = id;
        this.bd = bd;
    }

    public Person(String name, int id, int day, int month, int year) {
        this.name = name;
        this.id = id;
        this.bd = new BirthDate(day, month, year);
    }

    public void setBirthDate(BirthDate bd) {
        this.bd = bd;
    }

    public BirthDate getBirthDate() {
        return this.bd;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nID: " + id + "\nBirth Date: " + bd.toString();
    }
}
