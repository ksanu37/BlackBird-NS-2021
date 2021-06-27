package com.company;

public class GreatestCommonDivisor {

        public static void printGCD(int n, int m){
            int rem = 1;

            while(m != 0){
                rem = n%m;
                n = m;
                m = rem;
            }

            System.out.println(n);
        }


        public static void gcdOfAnArray(int[] arr){
            int len = arr.length;

            int gcd = arr[0];

            for(int i=1; i<len; i++){
                gcd = getGCD(gcd, arr[i]);
                if(gcd == 1)
                    break;
            }

            System.out.println(gcd);
        }

    public static int getGCD(int n, int m){
        int rem;

        while(m != 0){
            rem = n%m;
            n = m;
            m = rem;
        }

        return n;
    }
}
