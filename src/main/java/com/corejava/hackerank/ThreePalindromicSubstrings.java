package com.corejava.hackerank;

import java.util.List;

/**
 * Given a string, need to find exact 3 non-empty palindromic substrings
 */

public class ThreePalindromicSubstrings {


    public static List<String> threePalindromicSubstrings(String word) {
        // Write your code here

        boolean isPalindrom = checkPalindrom(word);
        System.out.println(isPalindrom);

        int minChars = 3;
        if (word.length() == minChars) {
            return List.of(String.valueOf(
                    word.charAt(0)),
                    String.valueOf(word.charAt(1)),
                    String.valueOf(word.charAt(2))
            );
        }

        List<String> substrings = getAllSubstrings(word);


        return List.of("Impossible");
    }

    private static List getAllSubstrings(String word) {
        for(int i = 0;i < word.length();i++) {

        }
        return null;
    }

    private static boolean checkPalindrom(String str) {
        boolean isPalindrom = false;
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            //System.out.println("No");
            isPalindrom = false;
        }
        if (str.length() % 2 == 0) {
            //System.out.println("No");
            isPalindrom = false;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            builder.append(str.charAt(str.length() - (i + 1)));
        }
        if (builder.toString().equals(str)) {
            //System.out.println("Yes");
            isPalindrom = true;
        }
        return isPalindrom;
    }

    public static void main(String[] args) {
        //"kayakracecartenet"
        List<String> array = threePalindromicSubstrings("tenet");
        System.out.println(array);
    }
}
