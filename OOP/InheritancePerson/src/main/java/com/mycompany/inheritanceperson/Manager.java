package com.mycompany.inheritanceperson;

public class Manager extends Employee {

    private int raise;

    public Manager(String name, int id, BirthDate Bdate, double salary, int raise) {
        super(name, id, Bdate, salary);
        this.raise = raise;
    }

    public Manager() {
    }

    public int getRaise() {
        return raise;
    }

    public void setRaise(int raise) {
        this.raise = raise;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Raise: " + raise + "%";
    }
}
