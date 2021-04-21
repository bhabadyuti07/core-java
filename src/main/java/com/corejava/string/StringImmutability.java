package com.corejava.string;

public class StringImmutability {

    public static final boolean isStringImmutable() {
        String s1 = "abc";
        String s2 = new String("abc");
        s2.intern();
        System.out.println(s1.equals(s2));


        return true;
    }

    public static void main(String[] args) {
        isStringImmutable();
    }
}

class X extends StringImmutability {


}
