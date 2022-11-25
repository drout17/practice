package com.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class hashPrac {

    public static void main(String[] args) {
        HashMap<Student,String> map = new HashMap<>();
        Student s1 = new Student(1,"Debasis", List.of("898090"));
        map.put(s1,"Hii");
        s1.setName("Rout");
        //Student s2 = new Student(1,"Debasis", List.of("898090"));
        map.put(s1,"Bye");
        Iterator itr = map.entrySet().iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
