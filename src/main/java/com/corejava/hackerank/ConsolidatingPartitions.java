package com.corejava.hackerank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConsolidatingPartitions {

    public static int minPartitions(List<Integer> used, List<Integer> totalCapacity) {
        Collections.sort(totalCapacity);
        //get the sum of all the used partitions
        int totalUsedPartition = used.stream().mapToInt(i -> i.intValue()).sum();
        int count = 0;
        int remaining = 0;
        for (int i = totalCapacity.size() - 1;i >= 0; i--) {
            if (count == 0) {
                Integer firstCapacity = totalCapacity.get(i);
                remaining = totalUsedPartition - firstCapacity;
                count++;
            } else if (count > 0){
                Integer eachCapacity = totalCapacity.get(i);
                remaining = remaining - eachCapacity;
                count++;
                if (remaining <= 0) {
                    break;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> used = Arrays.asList(3,1,1,1);
        List<Integer> totalCapacity = Arrays.asList(3,3,3,3);
        int minPartitions = minPartitions(used, totalCapacity);
        System.out.println("minPartitions: " + minPartitions);
    }

}
