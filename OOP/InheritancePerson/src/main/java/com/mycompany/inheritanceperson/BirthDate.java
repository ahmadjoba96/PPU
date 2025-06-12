package com.mycompany.inheritanceperson;

public class BirthDate {

    private int day;
    private int month;
    private int yyyy;

    public BirthDate(int day, int month, int yyyy) {
        this.day = day;
        this.month = month;
        this.yyyy = yyyy;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYyyy() {
        return yyyy;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYyyy(int yyyy) {
        this.yyyy = yyyy;
    }
}
