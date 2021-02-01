package com.corejava.hackerank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodSegment {

    public static int goodSegment(List<Integer> badNumbers, int lower, int upper) {
        // Write your code here
        Collections.sort(badNumbers);

        int maxDiff = 0;
        List<Integer> diffsList = new ArrayList<>();

        for(int i=0;i<badNumbers.size();i++) {
            int rightR = badNumbers.get(i) - 1;
            if(i == 0 && badNumbers.get(i) > lower) {
                int leftR = lower;

                System.out.println(leftR+","+ rightR);
                maxDiff = rightR - leftR;
                if(maxDiff == 0) {
                    diffsList.add(maxDiff);
                } else {
                    diffsList.add(maxDiff+1);
                }
            }

            if (i > 0 && badNumbers.get(i) < upper) {
                int leftR = badNumbers.get(i-1) + 1;
                if(leftR != badNumbers.get(i)) {
                    //int rightR = badNumbers.get(i) - 1;
                    System.out.println(leftR+","+ rightR);
                    maxDiff = rightR - leftR;
                    if(maxDiff == 0) {
                        diffsList.add(maxDiff);
                    } else {
                        diffsList.add(maxDiff+1);
                    }
                }

            }
            if(i > 0 && badNumbers.get(i) > upper) {
                int leftR = badNumbers.get(i-1) + 1;
                rightR = upper;
                System.out.println(leftR+","+ rightR);
                maxDiff = rightR - leftR;
                if(maxDiff == 0) {
                    diffsList.add(maxDiff);
                } else {
                    diffsList.add(maxDiff+1);
                }

                break;
            }

        }

        Integer max1 = Collections.max(badNumbers);
        if(upper > max1) {
            int leftR = Collections.max(badNumbers) + 1;
            int rightR = upper;
            maxDiff = rightR - leftR;
            diffsList.add(maxDiff+1);
        }

        //int finalDiff = 0;
        if(diffsList.size() > 0) {
            return Collections.max(diffsList);
        }
        return 0;
    }


    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

//        integers.add(5);
//        integers.add(4);
//        integers.add(2);
//        integers.add(15);
//        int segment = goodSegment(integers, 1, 10);

//        integers.add(37);
//        integers.add(7);
//        integers.add(22);
//        integers.add(15);
//        integers.add(49);
//        integers.add(60);
//        int segment = goodSegment(integers, 3, 48);

//        integers.add(1);
//        integers.add(2);
//        integers.add(3);
//        integers.add(4);
//        int segment = goodSegment(integers, 1, 4);

        integers.add(8);
        integers.add(6);
        integers.add(20);
        integers.add(12);
        int segment = goodSegment(integers, 1, 30);

        System.out.println(segment);
    }
}
