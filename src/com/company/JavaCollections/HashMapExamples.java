package com.company.JavaCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExamples {

    public static void HashMapDefinition(){
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();

        hm.put(12, 34);
        hm.put(15, 45);
        hm.put(18, 34);
        hm.put(90, 55);
        hm.put(21, 66);
        hm.put(12, 98);


//        System.out.println("The previous Map: ");
//
//        for(Map.Entry e: hm.entrySet()){
//            System.out.println(e.getKey() + " is Mapped to  " + e.getValue());
//        }


        HashMap<Integer, Integer> hm1 = new HashMap<>(hm);
        hm1.put(49, 79);

//        System.out.println("The current Map: ");
//        for(Map.Entry e: hm1.entrySet()){
//            System.out.println(e.getKey() + " is Mapped to  " + e.getValue());
//        }


        TreeMap<Integer, Integer> tMap = new TreeMap<>(hm);

        tMap.put(90, 12);
        tMap.put(98, 43);
        tMap.put(79, 55);
        tMap.put(123, 12);
        tMap.put(12, 34);
        tMap.put(34, 98);

        for(Map.Entry e: tMap.entrySet()){
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

    }
}
