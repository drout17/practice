package com.practice;

import java.util.ArrayList;
import java.util.List;

class A{}
class B extends A{

        }

public class PracList {
    public static void main(String[] args) {
        List<?super A> l1 = new ArrayList<>();
        List<?extends B> l2 = new ArrayList<>();
        //l2=l1;

        l1.add(new A());
        //l2.add(new B());
        l1.add(l2.get(0));
        //l2.add(l1.get(0));

        /*List<? extends Number> foo1 = new ArrayList<Number>();  // Number "extends" Number (in this context)
        List<? extends Number> foo2 = new ArrayList<Integer>(); // Integer extends Number
        List<? extends Number> foo3 = new ArrayList<Double>();  // Double extends Number

        List<? super Integer> foo4 = new ArrayList<Integer>();  // Integer is a "superclass" of Integer (in this context)
        List<? super Integer> foo5 = new ArrayList<Number>();   // Number is a superclass of Integer
        List<? super Integer> foo6 = new ArrayList<Object>();   // Object is a superclass of Integer*/

    }
}
