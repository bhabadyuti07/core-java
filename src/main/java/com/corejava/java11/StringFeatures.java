package com.corejava.java11;

public class StringFeatures {

    public static void main(String[] args) {
        //isBlank - understands that unicode & space are not valid strings
        System.out.println("\n\t\u2005 ".isBlank());

        //trim - understands the white space character and applies it
        System.out.println("\n\t\u2005 abc ".trim());

        //strip - understands the unicode & whitespace and ignores it
    }
}
