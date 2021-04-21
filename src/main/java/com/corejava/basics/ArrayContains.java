package com.corejava.basics;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayContains {

    static boolean exists(int[] ints, int k) {
        System.out.println("size of array: " + ints.length);
        long start = System.currentTimeMillis();
        Set<Integer> set = Arrays.stream(ints).boxed().collect(Collectors.toSet());
        //boolean contains = set.contains(k);
        int index = Arrays.binarySearch(ints, k);
        long end = System.currentTimeMillis();
        System.out.println("time taken: " + (end - start));
        if(index > -1)
            return true;
        return false;
    }

    public static void main(String[] args) {

        int[] arr = new int[1000000];

        Random s = new Random();
        for(int i=0; i< 10000; i++){
            arr[i] = s.nextInt();
        }
        boolean exists = exists(arr, 9989);
        System.out.println(exists);
    }
}
