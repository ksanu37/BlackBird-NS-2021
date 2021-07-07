package com.company;

import com.company.DSAQuestions.SubArrayWithSumK;
import com.company.JavaCollections.*;
import com.company.JavaCollections.ArrayListExamples;
import com.company.JavaConcepts.StringExamples;
import com.company.JavaOOP.Animal;
import com.company.JavaOOP.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {2, 4, 6, 6, 3, 9, 9, 4, 2};
        //GreatestCommonDivisor.gcdOfAnArray(arr);
//        BinaryRepresentation.representAsBinary(10);
//        System.out.println(BitwiseOperators.bitwiseAnd(136, 196));
//        System.out.println(BitwiseOperators.bitwiseOr(-10, 1));
//        System.out.println(BitwiseOperators.bitwiseXor(2, 4));
//        System.out.println(BitwiseOperators.rightShift(10, 1));
//        System.out.println(BitwiseOperators.rightShift(10, 2));
//        System.out.println(BitwiseOperators.rightShift(10, 3));
//        System.out.println(BitwiseOperators.leftShift(-12, 1));
//        System.out.println(BitwiseOperators.unsignedRightShift(-12, 1));
//        BitwiseOperators.checkIfOddOrEven(5);
//        BitwiseOperators.checkIfOddOrEven(100);
//          BitwiseOperators.setNthBit(240, 3);
//          BitwiseOperators.unsetNthBith(240, 4);
//          BitwiseOperators.toggleNthBit(162, 3);
//          BitwiseOperators.toggleNthBit(240, 5);
//        BitwiseOperators.checkIfPowerOfTwo(32);
//        BitwiseOperators.checkIfPowerOfTwo(33);

//        BitwiseOperators.printFirstNNumbersWithTwoSetBits(5);
        //int[] a = {1,3,5};
        //BitwiseOperators.getSumOfBitDifferencesInAnArray(a);
        //System.out.println(PascalTriangle.nthRowOfPascalTriangle(4));

//        ArrayList<Integer> ar = new ArrayList<>();
//        ArrayListExamples.ArrayListDefinition();

//        VectorExamples.VectorDefinition();
//        HashTablesExamples.HashTableDefinition();
//        HashMapExamples.HashMapDefinition();
//        HashSetExamples.HashSetDefinition();
//        StringExamples.stringExamples();
//
//       int [] a = {10,20,30,40,50};
//       int k = 90;
////        SubArrayWithSumK.subArrayWithSumK(a, k);


        String userName = "abcdef";
        String password = "abcd@1234";

//        Animal animal = new Animal(4, "black", 120f);
//        animal.no_of_feet = 10;
//        animal.setColor(userName, password, "red");
//        System.out.println(animal.no_of_feet);
//        System.out.println(animal.getColor(userName, password));

        Student s = new Student("Sanu", 10, 1, "Male", "Geography");
        System.out.println(s.printClass());
        System.out.println(s.getClass());
    }
}
