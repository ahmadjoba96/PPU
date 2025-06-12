package com.mycompany.innerclass;

public class AnonymousClassExample {

    public void AnonymousClass() {
        Animal cat = new Animal() {
            @Override
            public void sound() {
                System.out.println("Meow from anonymous");
            }
        };
        cat.sound();
    }
}
