package com.company;


enum suits{
    SPADES, DIAMONDS, CLUB, HEART
}

public class ConditionalStatements {

    public static void printDaysOfTheWeek(int n){
//        if(n==1) {
//            System.out.println("Monday");
//        } else if(n==2){
//            System.out.println("Tuesday");
//        } else if(n==3){
//            System.out.println("Wednesday");
//        } else if(n==4){
//            System.out.println("Thursday");
//        } else if(n==5){
//            System.out.println("Friday");
//        } else if(n==6 || n==7){
//            System.out.println("Weekend");
//        } else {
//            System.out.println("Not a valid Input");
//        }

        // 1-> spades, 2 -> hearts, 3 -> clubs, 4->diamonds
        // Inputs: 1 --> number of the suit and second input is the number on the card
        // Tell me the card you have
        suits suit = suits.valueOf("SPADES");


        /*

        *
        **
        ***
        ****


        */
        switch(n){
            case 1:
                System.out.println("Monday");   // spades
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Not a valid input");
        }

    }


    public static void gradesOfAStudent(int marks){
        if(marks > 90){
            System.out.println("A");
        }
         if(marks >80){
            System.out.println("B");
        }
         if(marks>70){
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }


    // >90 : A
    // >80 and <=90: B
    // >70 and <=80: C
    // else D

    public static void printPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
