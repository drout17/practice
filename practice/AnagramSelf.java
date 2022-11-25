package com.practice;

import java.util.Arrays;

public class AnagramSelf {

    public static Boolean check(String a, String b){
            Boolean status=false;
            a=a.replaceAll(" ","");
            b=b.replaceAll(" ","");

            if(a.length()==b.length())
            {
                a=a.toLowerCase();
                b=b.toLowerCase();
                char[] charA=a.toCharArray();
                char[] charB=b.toCharArray();
                Arrays.sort(charA);
                Arrays.sort(charB);
                status = Arrays.equals(charA,charB);
            }
            return status;
    }

    public static void main(String[] args) {
        System.out.println(AnagramSelf.check("Ke    ep","PEEK"));
        System.out.println(AnagramSelf.check("I hvae","havei"));
    }
}
