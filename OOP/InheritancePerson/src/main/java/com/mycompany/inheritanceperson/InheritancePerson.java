//Course OOP - PPU - Dr. Mohammed Jabari
//BY:A7mad_Joba 

package com.mycompany.inheritanceperson;

public class InheritancePerson {

    public static void main(String[] args) {
        BirthDate birthDate1 = new BirthDate(15, 6, 2000);
        BirthDate birthDate2 = new BirthDate(10, 10, 1985);

        Student student = new Student("Ali", 101, birthDate1, 88.5, "CS");
        Employee employee = new Employee("Aziz", 202, birthDate2, 7500);
        Manager manager = new Manager("Ahmed", 303, birthDate2, 9000, 10);

        System.out.println(student.getInfo());
        System.out.println(employee.getInfo());
        System.out.println(manager.getInfo());

    }
}
