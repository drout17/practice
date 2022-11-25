package com.practice;

abstract class Person{
    abstract void eat();
}

public class InnerClass {

    public static void main(String[] args) {
        Person p = new Person() {
            @Override
            void eat() { System.out.println("Inner Class implementation");}
        };
        p.eat();
    }
}
