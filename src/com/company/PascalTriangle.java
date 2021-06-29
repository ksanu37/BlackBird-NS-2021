package com.company;

import java.util.ArrayList;

public class PascalTriangle {
    public static ArrayList<Integer> nthRowOfPascalTriangle(int n){
        ArrayList<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);
        if(n==0)
            return currentRow;

        ArrayList<Integer> prevRow = nthRowOfPascalTriangle(n-1);

        for(int i=1; i<prevRow.size(); i++){
            currentRow.add(prevRow.get(i) + prevRow.get(i-1));
        }
        currentRow.add(1);
        return currentRow;

    }
}
