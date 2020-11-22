package com.corejava.hackerank;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FizzBuzz {



    public int solution1(String S) {
        // write your code in Java SE 8
        TreeSet<Integer> set = new TreeSet<>();
        if(S.length() == 2) {
            return Integer.valueOf(S);
        } else if(S.length() > 2) {
            for(int i=1;i < S.length();i++) {
                    String num = String.valueOf(S.charAt(i-1)) + String.valueOf(S.charAt(i));
                    set.add(Integer.valueOf(num));
            }

        }
        return set.last();
    }

    public int smalledst(int[] a) {

        int missisngNum = 0;
        List<Integer> list = Arrays.stream(a)        // IntStream
                .boxed()          // Stream<Integer>
                .collect(Collectors.toList());

        Integer max = Collections.max(list);

        Integer arraySum = list.stream().collect(Collectors.summingInt(Integer::intValue));

        int n = a.length;
        int seriesSum = (n * (n + 1)) / 2;

        if(arraySum == seriesSum)
            missisngNum = max+1;

        return missisngNum;
    }

    public int solution2(int[] a) {
        // write your code in Java SE 8
        TreeSet<Integer> set = new TreeSet<>();
        set.add(a[1] + a[3]);
        set.add(a[1] + a[4]);
        set.add(a[2] + a[4]);

        return set.first();

    }

    public int solution3(String str) {
        // write your code in Java SE 8
        Set<Character> set = new LinkedHashSet<Character>(); // UNORDERED SET

        for(int i=0;i<str.length();i++)
        {
            set.add(str.charAt(i));

        }
        return str.length()-set.size()+1;

    }


    public static void main(String[] args) {
        FizzBuzz obj = new FizzBuzz();
        //obj.solution1("50552");
        obj.solution3("ccaaffddecee");
       // fizzBuzz();
    }

    private static void fizzBuzz() {
        int n = 15;
        for(int i=1;i<=n;i++) {
            if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if((i % 3 != 0) && (i % 5 != 0)){
                System.out.println(i);
            }
        }
    }
}
