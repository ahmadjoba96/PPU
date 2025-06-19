
package com.mycompany.inventorysystem;
import java.time.LocalDate;

public class date {  
    private int year;
    private int month;
    private int day;
    
    date(){
        
    }

    public date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMounth(int mounth) {
        this.month = mounth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String infoDate()
    {
        return getMonth() +"/"+getDay()+"/"+getYear();
    }
    public int getCurrDay(){
     LocalDate currDate = LocalDate.now();
     return currDate.getDayOfMonth();
    }
    public int getCurrMonth(){    
        LocalDate currDate = LocalDate.now();
        return currDate.getMonthValue();
    }
    public int getCurrYear(){  
    LocalDate currDate = LocalDate.now();
    return currDate.getYear();
    }
}
