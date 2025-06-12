//Course OOP - PPU - Dr. Mohammed Jabari
//BY:A7mad_Joba 

package com.mycompany.innerclass;

public class InnerClass {

    public static void main(String[] args) {

        AnonymousClassExample example1 = new AnonymousClassExample();
        example1.AnonymousClass();

        InnerClassExample example2 = new InnerClassExample();
        InnerClassExample.Inner inner = example2.new Inner();
        inner.sayHello();

    }
}
