package com.company;

import java.util.ArrayList;

public class ArrayListExamples {

    public static void ArrayListEx(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(10);
        list.add(13);

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
