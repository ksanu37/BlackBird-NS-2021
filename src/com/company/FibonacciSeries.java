package com.company;

public class FibonacciSeries {

    public static void printTerms(int n){
        int firstTerm = 0;
        int secondTerm = 1;

        if(n==1){
            System.out.print(firstTerm);
        }
        if(n>=2){
            System.out.print(firstTerm + " " + secondTerm + " ");

            for(int i=3; i<=n; i++){
                int newTerm = firstTerm+secondTerm;
                System.out.print(newTerm+ " ");
                firstTerm = secondTerm;
                secondTerm = newTerm;
            }
        }
    }
}
