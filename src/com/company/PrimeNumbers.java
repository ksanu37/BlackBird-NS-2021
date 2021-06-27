package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumbers {

    public static void printFactors(int n){
        for(int i=1; i*i<=n; i++){
            if(n%i == 0){
                if(i != n/i)
                    System.out.print(i + " " + n/i + " ");
                else
                    System.out.println(i + " ");
            }
        }
    }

    public static void printPrimesUptoN(int n){
        for(int i=1; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }


    public static boolean isPrime(int n){
        if(n<2) {
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2; i*i<=n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;

    }


    public static ArrayList<Integer> sieve(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2; i<=n; i++){
            if(isPrime[i]){
                for(int j = i*i; j<=n; j+=i){
                    isPrime[j] = false;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=2; i<=n; i++){
            if(isPrime[i]) {
                list.add(i);
            }
        }

        return list;
    }


    public static int segmentedSieve(int n){
        int count = 0;
        if(n>=2){
            int limit = (int)Math.sqrt(n);
            ArrayList<Integer> primes = sieve(limit);
            count = primes.size();
            int low = limit;
            int high = 2*limit;
            while(low < n){
                if(high >= n)
                    high = n;
                boolean [] mark = new boolean[limit + 1];
                Arrays.fill(mark, true);
                for(int i=0; i<primes.size(); i++){
                    int smallest = low/primes.get(i) * primes.get(i);
                    if(smallest <low)
                        smallest = smallest + primes.get(i);

                    for(int j= smallest; j <= high; j = j + primes.get(i)){
                        mark[j-low] = false;
                    }
                }
                for(int i = low; i<=high; i++){
                    if(mark[i-low]){
                        count++;
                    }
                }
                low = low + limit;
                high = high + limit;

            }
        }
        return count;
    }



    public static void printPrimeFactors(int n){
        if(n>1){
            for(int i=2; i<=n; i++){
                if(n%i == 0){
                    System.out.print(i + " ");
                    while(n%i == 0)
                        n = n/i;
                }
            }
        }
    }


}
