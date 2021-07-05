package com.company.JavaCollections;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class HashTablesExamples {

    public static void HashTableDefinition(){
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Sachin");
        nameList.add("Yuvraj");
        nameList.add("Virat");
        nameList.add("Sehwag");
        nameList.add("Rohit");
        nameList.add("Zaheer");
        nameList.add("Brett");
        nameList.add("Flintoff");

        Hashtable<String, Boolean> nameTable = new Hashtable<>();
        for(int i=0; i<nameList.size(); i++){
            nameTable.put(nameList.get(i), true);
        }

        nameTable.put("Flintoff", false);
        nameTable.remove("Flintoff");

        int [] arr = {1,2,3,4,5,5,5,5,5,5,8,6,5,5,5,3,3,3,3};

        Hashtable<Integer, Integer> countTable = new Hashtable<>();

        for(int item: arr){
            if(countTable.containsKey(item)){
                int val = countTable.get(item);
                countTable.put(item, val+1);
            } else {
                countTable.put(item, 1);
            }
        }
        System.out.println(countTable);
    }
}
