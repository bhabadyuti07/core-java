package com.corejava.leetcode;

import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class Problem1 {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++) {
            for(int j=0; j<nums.length;j++) {
                if((i != j) && (nums[i] + nums[j] == target)) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();
        int[] ints = problem1.twoSum(new int[]{2, 3, 3}, 6);
        Arrays.stream(ints).forEach(System.out::print);
    }

}
