package com.corejava.others;

public class Anagram {

    public static boolean checkForAnagram(String str1, String str2) {

        for(Character c : str1.toCharArray()) {
            if(!str2.contains(c.toString())) {
                return false;
            }
        }

        /*if(str1.contains(str2)) {
            System.out.println("Given strings are anagram!");
            return true;
        }
        System.out.println("Given strings are not anagram!");*/
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkForAnagram("care", "race"));
    }
}
