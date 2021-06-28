package com.company;

public class BitwiseOperators {

    public static int bitwiseAnd(int n, int m){
        return n & m;
    }

    public static int bitwiseOr(int n, int m){
        return n | m;
    }

    public static int bitwiseNot(int n){
        return ~n;
    }

    public static int bitwiseXor(int n, int m){
        return n ^ m;
    }

    public static int rightShift(int num, int n){
        return num>>n;
    }

    public static int leftShift(int num, int n){
        return num<<n;
    }

    public static int unsignedRightShift(int num,int n){
        return num>>>n;
    }

    public static void checkIfOddOrEven(int n){
        if((n&1) > 0){
            System.out.println("Odd Number");
        } else{
            System.out.println("Even Number");
        }
    }

    public static void setNthBit(int x, int n){
        x = x | (1<<n);
        System.out.println(x);
    }

    public static void unsetNthBith(int x, int n){
        x = x & ~(1<<n);
        System.out.println(x);
    }

    public static void toggleNthBit(int x, int n){
        x = x ^ (1<<n);
        System.out.println(x);
    }

    public static void checkIfPowerOfTwo(int n){
        if((n & n-1) == 0){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}
