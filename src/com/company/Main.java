package com.company;

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
          BitwiseOperators.toggleNthBit(162, 3);
//          BitwiseOperators.toggleNthBit(240, 5);
        BitwiseOperators.checkIfPowerOfTwo(32);
        BitwiseOperators.checkIfPowerOfTwo(33);

    }
}
