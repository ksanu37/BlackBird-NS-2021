package com.company.JavaCollections;

import java.util.HashSet;
import java.util.Set;

public class UniqueString {

    public static void checkUniqueString(String s){
        Set<Character> charSet = new HashSet<>();

        boolean isUnique = true;

        for(int i=0; i< s.length(); i++){
            if(charSet.contains(s.charAt(i))){
                isUnique = false;
                break;
            } else {
                charSet.add(s.charAt(i));
            }
        }

        if(isUnique){
            System.out.println("Unique String");
        } else {
            System.out.println("Not a unique String");
        }

    }
}
