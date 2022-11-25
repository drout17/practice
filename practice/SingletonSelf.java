package com.practice;

public class SingletonSelf {

    private static SingletonSelf s = null;

    private SingletonSelf(){

    }

    public static SingletonSelf getInstance(){
        if(s==null)
        {
            s = new SingletonSelf();
            return s;
        }
        else
            return s;
    }

    public static void main(String[] args) {
        System.out.println(SingletonSelf.getInstance());
        System.out.println(SingletonSelf.getInstance());
        System.out.println(SingletonSelf.getInstance());
        System.out.println(SingletonSelf.getInstance());
        System.out.println(SingletonSelf.getInstance());
    }

}
