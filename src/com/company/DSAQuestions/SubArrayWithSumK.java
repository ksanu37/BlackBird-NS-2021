package com.company.DSAQuestions;


/*
        Given an unsorted array of integers, find a subarray that adds to a given number.
        If there is more than one subarray with the sum of the given number, print any of them.

        Example: arr[] = {10,20,30,40,50}
        k = 90

        valid outputs: 1,3 or 3,4
 */


import java.util.HashMap;

public class SubArrayWithSumK {

    public static void subArrayWithSumK(int[] arr, int k){
        int curr_sum = 0;
        int startIndex = 0;
        int endIndex = -1;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            curr_sum+= arr[i];

            if(curr_sum - k == 0){
                startIndex = 0;
                endIndex = i;
                break;
            }

            if(hm.containsKey(curr_sum - k)){
                startIndex = hm.get(curr_sum - k) + 1;
                endIndex = i;
                break;
            }
            hm.put(curr_sum, i);
        }

        if(endIndex != -1){
            System.out.println("Start = " + startIndex + " end = " + endIndex);
        } else {
            System.out.println("No Subarray with sum k = " + k);
        }
    }
}
