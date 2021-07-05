package com.company.JavaCollections;

import java.util.*;

public class HashSetExamples {

    public static void HashSetDefinition(){
        Set<Character> charSet = new HashSet<Character>();
        charSet.add('A');
        charSet.add('B');
        charSet.add('C');
        charSet.add('D');
        charSet.add('A');

        Set<Character> charSet1 = new HashSet<>(charSet);

        charSet1.add('E');

        charSet1.remove('D');

//        for(Character c: charSet){
//            System.out.println(c);
//        }

        //addAll set1.addAll(set2)
        Set<Character> unionSet = new HashSet<>(charSet);
        unionSet.addAll(charSet1);

        Set<Character> intersectionSet = new HashSet<>(charSet);
        intersectionSet.retainAll(charSet1);

        //retainAll set1.retainAll(set2)

       // System.out.println(intersectionSet);

       // System.out.println(charSet1);

        Set<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(10);
        linkedSet.add(30);
        linkedSet.add(40);
        linkedSet.add(50);
        linkedSet.add(60);

        //System.out.println(linkedSet);


        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(60);
        treeSet.add(40);




        System.out.println(treeSet);
    }
}
