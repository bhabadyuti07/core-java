package com.corejava.basics;

import java.util.ArrayList;
import java.util.List;

public class CodingGame {

    /*public static int sumRange(int[] ints) {

    }*/

    public static int count(int n) {
        int total = 0;
        if(n == 1) {
            return n;
        }
        for(int i = 1;i<=n;i++) {
            total = total + (n - i);
        }
        return  total;
    }

    public static String encode(String plainText) {
        StringBuilder temp = new StringBuilder();
        StringBuilder encoded = new StringBuilder();

        List<Character> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<plainText.length() - 1;i++) {
            char c1 = plainText.charAt(i);
            char c2 = plainText.charAt(i+1);
            if(c1 != c2) {
                temp.append(c1);
                temp.append(',');

            } else if(c1 == c2 && i == plainText.length() - 2) {
                temp.append(c1);
                temp.append(c2);

            } else if(c1 == c2){
                temp.append(c1);
            }
        }

        String[] splits = temp.toString().split(",");
        for (int i=0;i<splits.length;i++) {
            String substr = splits[i];
            int count = 0;
            for (int j=0; j < substr.length(); j++) {
                ++count;
            }
            encoded.append(count).append(substr.charAt(0));
        }
        //System.out.println(temp.toString());
        return encoded.toString();
    }

    public static void main(String[] args) {
        //System.out.println(count(4));
        //System.out.println(encode("aaaaabbcccc"));

        //System.out.println(Planet.MERCURY.equals(Planet.MERCURY));
        //System.out.println(Planet.MERCURY == Planet.MERCURY);

        System.out.println(5/2);
    }
}
