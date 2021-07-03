package com.company.JavaCollections;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class VectorExamples {
        public static void VectorDefinition(){

            Vector<Integer> v = new Vector<>();
            v.add(10);
            v.add(30);
            v.add(40);
            v.add(50);
            v.add(60);
            v.add(98);
            v.add(60);
            v.add(73);
            v.add(60);
            v.add(75);
            v.add(60);
            v.add(60);
            v.add(70);

//            System.out.println(v.get(0));

            System.out.println("Initial Vector: ");
            System.out.println(v);

            v.remove(4);
            System.out.println("Vector After removal:");
            System.out.println(v);

            v.add(4, 60);

            v.set(4, 65);
            v.add(4, 65);

            Collections.sort(v);

            System.out.println(v);



        }
}
