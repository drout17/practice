package com.practice;

import java.util.ArrayList;
import java.util.List;

public class ImmutableSelf {

    public static void main(String[] args) {
        Emp e = new Emp(001,"Debasis Rout",List.of(23,444,677));
        System.out.println(e);
        List<Integer> myList = e.getPriceList();
        myList.add(24);
        System.out.println(e);
    }

}

final class Emp{

    private final Integer id;
    private final String name;
    private final List<Integer> priceList;

    public Emp(Integer id,String name,List<Integer> priceList){
        this.id=id;
        this.name=name;
        List<Integer> tempPrice = new ArrayList<>();
        for (Integer i:priceList)
        {
            tempPrice.add(i);
        }
        this.priceList = tempPrice;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public List<Integer> getPriceList() {
        List<Integer> tempList = new ArrayList<>();
        for (Integer i : priceList) {
            tempList.add(i);
        }
        return tempList;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", priceList=" + priceList +
                '}';
    }
}

