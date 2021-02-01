package com.corejava.hackerank;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int n = arr.size();
        int ltorSum = 0;
        int rtolSum = 0;
        for(int i=0; i < n; i++) {
            List<Integer> eachRow = arr.get(i);
            //for(int j = 0;j < eachRow.size();j++) {
                ltorSum += eachRow.get(i);
                rtolSum += eachRow.get(n - 1 - i);
            //}
        }

        int diff = ltorSum - rtolSum;
        return Math.abs(diff);

    }

    public static void main(String[] args) {
        List<List<Integer>> lists = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(9, 8, 9)
        );
        int difference = diagonalDifference(lists);
        System.out.println("difference: " + difference);
    }

}
