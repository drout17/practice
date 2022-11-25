package com.practice;

import java.io.InputStream;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Reducing {

    public static void main(String[] args) {

        Double d1 = 0.0/0.0;
        //Integer i =24/0;
        System.out.println(d1.isNaN());
        System.out.println(d1.isInfinite());
        List <Integer> integerList = List.of(2,3,5,6,3,8,7,8,5,10);

        Integer sum = integerList.stream().reduce(0,Integer::sum);
        System.out.println(sum);
        Optional<Integer> max = integerList.stream().max((x, y)-> x.compareTo(y));
        Optional<Integer> min = integerList.stream().min((x, y)-> x.compareTo(y));
        System.out.println(max.get());
        System.out.println(min.get());

        IntStream.rangeClosed(0,10).forEach(x->System.out.println(Thread.currentThread().getName()+" "+x));
        IntStream.rangeClosed(0,10).parallel().forEach(x->System.out.println(Thread.currentThread().getName()+" "+x));
    }

}
