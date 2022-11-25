package com.practice;

public class CyclicSelf {

    public static Boolean checkCyclic(String a, String b){
        Boolean isCyclic=false;

        a=a+a;

        if(a.toLowerCase().contains(b.toLowerCase()))
            isCyclic=true;

        return isCyclic;
    }

    public static void main(String[] args) {
        System.out.println(CyclicSelf.checkCyclic("Absda","sdaab"));
    }
}
