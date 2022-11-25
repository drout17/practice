package com.practice;

public class ExceptionPrac {
    public static void main(String[] args) {
        System.out.println(LetsDoException());
    }

    public static Integer LetsDoException(){
        try{
            return 1;
        }
        catch(Exception e){
            return 2;
        }
        finally{
            return 3;
        }
    }
}
