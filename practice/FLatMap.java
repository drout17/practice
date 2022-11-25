package com.practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FLatMap {

    public static void main(String[] args) {
        List<Student> studentList=Stream.of(
                new Student(001,"Debasis",List.of("8249926358","8861675521")),
                new Student(002,"Mohit",List.of("8249926466","8908285169"))
        ).collect(Collectors.toList());

       // List <String> mobNumbers = studentList.stream().flatMap(x->x.getMobileNumber().stream()).collect(Collectors.toList());

        List <String> mobNumbers = studentList.stream().flatMap(x->x.getMobileNumber().stream()).collect(Collectors.toList());

        System.out.println(mobNumbers);

    }
}
