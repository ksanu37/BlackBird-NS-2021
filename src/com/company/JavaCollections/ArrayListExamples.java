package com.company.JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListExamples {

    public static void ArrayListDefinition(){
        // ArrayList<Object> nameOfTheArrayList = new ArrayList<>();

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayListSecond = new ArrayList<>();

        // Add an element, remove an element, change an element
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of test Cases: ");
//        int tc = sc.nextInt();
//
//        for(int i=0; i<tc; i++){
//            arrayList.add(sc.nextInt());
//        }

        arrayList.add(3);
        arrayList.add(30);
        arrayList.add(34);
        arrayList.add(55);
        arrayList.add(90);
        arrayList.add(37);

        arrayListSecond.add(90);
        arrayListSecond.add(30);
        arrayListSecond.add(70);

        int sum = 0;
        arrayList.add(1, 50);

        int[] arr = {10,20};

//        System.out.println("Initial List: ");
//        for(int i=0; i<arrayList.size(); i++){
//            sum += arrayList.get(i);
//            System.out.print(sum + " ");
//        }

//        arrayList.set(4, 87);
//
//        System.out.println("\nCurrent List: ");
//        for(int i=0; i<arrayList.size(); i++){
//            System.out.print(arrayList.get(i) + " ");
//        }


        ArrayList<Character> charList = new ArrayList<Character>(
                Arrays.asList('A', 'B', 'C')
        );

        ArrayList<Character> charListSecond = new ArrayList<Character>(
                Arrays.asList('D', 'F', 'G', 'F')
        );

        ArrayList<ArrayList<Integer>> listOfList = new ArrayList<>();
        listOfList.add(arrayList);
        listOfList.add(arrayListSecond);

        for(int i=0; i<listOfList.size(); i++){
            for(int j=0; j<listOfList.get(i).size(); j++){
                System.out.print(listOfList.get(i).get(j) + " ");
            }
            System.out.println();
        }

//        System.out.println(listOfList);

        charList.add('P');

        charList.addAll(charListSecond);

        int x =  charList.lastIndexOf('F');
//
//        System.out.println(x);
//
//
//        System.out.println(charList);




    }
}
