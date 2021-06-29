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

    public static void printFirstNNumbersWithTwoSetBits(int n){
        int x = 1;

        while(n>0){
            int y = 0;
            while(y<x){
                System.out.print((1<<x) + (1<<y) + " ");
                n--;
                if(n==0)
                    return;
                y++;
            }
            x++;
        }
    }


    public static void getSumOfBitDifferencesInAnArray(int[] arr){
        int res = 0;
        for(int i=0; i<32; i++){
            int count = 0;

            for(int j=0; j<arr.length; j++){
                if((arr[j] & (1<<i)) == 0)
                    count++;
            }
            res = res + (count * (arr.length-count) * 2);
        }

        System.out.println(res);
    }



}
