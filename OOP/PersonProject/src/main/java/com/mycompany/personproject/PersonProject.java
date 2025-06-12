//Course OOP - PPU - Dr. Mohammed Jabari
//BY:A7mad_Joba 

package com.mycompany.personproject;

public class PersonProject {

    public static void main(String[] args) {
        BirthDate bd = new BirthDate(14, 2, 2005);
        Person p1 = new Person("ahmad", 233, bd);
        Person p2 = new Person("aziz", 243, 23, 5, 2005);
        Person p3 = new Person("yazeed", 10, new BirthDate(2, 6,2005));

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println("p3 name: " + p3.getName());
        System.out.println("p3 birth day: " + p3.getBirthDate().getDay());
    }
}
