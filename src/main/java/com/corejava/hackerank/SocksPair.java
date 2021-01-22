package com.corejava.hackerank;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Alex works at a clothing store. There is a large pile of socks that must be paired by color for sale.
 * Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
 *
 * For example, there are  socks with colors . There is one pair of color  and one of color .
 * There are three odd socks left, one of each color. The number of pairs is .
 */

public class SocksPair {


    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        //count the number of repetition for the unique digits
        List<Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());

        Map<Integer, Long> collects = list.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting()));

        return collects.entrySet().stream().map(e -> e.getValue().intValue() / 2).reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        int n = 7;
        int[] ar = new int[]{1, 2, 1, 2, 1, 3, 2};

        int result = sockMerchant(n, ar);
        System.out.println("result: " + result);


    }
}
