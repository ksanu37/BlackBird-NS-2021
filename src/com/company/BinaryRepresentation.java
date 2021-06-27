package com.company;

import java.util.ArrayList;

public class BinaryRepresentation {

    public static void representAsBinary(int n){
        // This method converts a decimal number into its binary representation
        if(n>0){
            System.out.println("The Binary representation for " + n + ": ");
            ArrayList<Integer> rep = new ArrayList<>();
            while(n != 0){
                rep.add(n%2);
                n /= 2;
            }

            for (int i=rep.size()-1; i>=0; i--){
                System.out.print(rep.get(i));
            }
        }
    }
}
