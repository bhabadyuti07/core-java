package com.corejava.hackerank;

public class AppendAndDelete {

    private static String NO = "No";
    private static String YES = "Yes";
    static String appendAndDelete(String s, String t, int k) {

        String substr = "";
        if(t.length() > k) {
            return NO;
        } else {
            if(s.contains(t)) {
                for(int i=0; i<t.length(); i++) {
                    if(s.charAt(i) == t.charAt(i)) {
                        substr = substr.concat(String.valueOf(s.charAt(i)));
                    } else {
                        break;
                    }
                }
            }
            String[] split = s.split(substr);
            String leftoverString = split[1];
            System.out.println(leftoverString);
        }
        return YES;
    }

    public static void main(String[] args) {

        String s = "hackerhappy";
        String t = "hackerrank";
        int k = 9;
        String result = appendAndDelete(s, t, k);
    }
}
