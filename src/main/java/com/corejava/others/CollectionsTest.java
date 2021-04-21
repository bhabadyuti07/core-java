package com.corejava.others;

public class CollectionsTest {

    public static void main(String[] args) {
//        List<Integer> list = List.of(23, 2, 89, 10);
//        List<Integer> list1 = new ArrayList<>(list);
//        //List<Integer> list = Arrays.asList(23, 2, 89, 10);
//        Collections.sort(list1); //Asc
//        System.out.print(list1);

        //loop

        String str = "#. Algorithms";
        String s1 = str.substring(0, 2); //##
        System.out.println(s1);
        if(s1.equals("#.")) {
            System.out.println("done");
        }
    }
}
