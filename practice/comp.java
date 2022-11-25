package com.practice;

import java.util.*;
import java.util.stream.Collectors;

class MyComp implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return -(o1.compareTo(o2));
    }
}


public class comp {

    public static void main(String[] args) {
        List<Integer> abc = List.of(2,4,6,8,0,7,22,100,5);

        Map<Integer,String> mp = new HashMap<Integer,String>();
        mp.put(12,"Debasis");
        mp.put(11,"Rohit");
        mp.put(01,"Zone");

        Set<Map.Entry<Integer,String>> itr = mp.entrySet();
        for(Map.Entry<Integer,String> m:itr)
        {
            System.out.println(m.getKey()+":"+m.getValue());
        }

        List sort = abc.stream().sorted((o1,o2)->new MyComp().compare(o1,o2)).collect(Collectors.toList());
        System.out.println(sort);

        Set <String> s = new HashSet<>();
        s.add("Debasis");
        String a = "Debasis";
        s.add(a);

        Iterator<String> it = s.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }

}
