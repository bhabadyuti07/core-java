package com.corejava.hackerank;

/**
 * An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly  steps, for every step it was noted if it was an uphill, ,
 * or a downhill,  step. Hikes always start and end at sea level, and each step up or down represents a  unit change in altitude. We define the following terms:
 *
 * A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
 * A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
 * Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.
 */
public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int level = 0;
        int valley = 0;
        for (int i = 0; i < steps; i++) {
            System.out.println(level);
            char letter = path.charAt(i);
            if (letter == 'U') {
                level++;
                if (level == 0) {
                    valley++;
                }
            } else if (letter == 'D') {
                level--;

            }
        }
        return valley;
    }

    public static void main(String[] args) {
        int steps = 12;
        String path = "DDUUDDUDUUUD";
        int valleys = countingValleys(steps, path);
        System.out.println("valleys: " + valleys);
    }

}
