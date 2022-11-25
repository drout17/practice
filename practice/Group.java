package com.practice;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Group {
    public static void main(String[] args) {

        List<Employee> employeeList = Stream.of(
                new Employee("Debasis","Devloper",600000),
                new Employee("Rohit","Ops",500000),
                new Employee("Mohit","Ops",800000),
                new Employee("Kishore","Ops",700000),
                new Employee("Suresh","Devloper",500000),
                new Employee("David","Devloper",300000)
                ).collect(Collectors.toList());

/*        Map<String, Optional<Employee>> dept = employeeList.stream().collect(
                Collectors.groupingBy(Employee::getDept,Collectors.reducing(
                        BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));*/
        Map<String,List<Employee>> dept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println("dept --> "+dept);

        List<User> userList = Stream.of(
                new User(001,"Debasis",5),
                new User(002,"Debasis",6),
                new User(003,"Debasis",8),
                new User(004,"Amit",2)
        ).collect(Collectors.toList());
        //userList.forEach(System.out::println);
        Collections.sort(userList);
        //TreeSet <User> ts = new TreeSet<>();//userList.stream().forEach(x->ts.addAll(userList));
          //      ts.addAll(userList);
        userList.forEach(System.out::println);
        //ts.forEach(System.out::println);
    }
}
