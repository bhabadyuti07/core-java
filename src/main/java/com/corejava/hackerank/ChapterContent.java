package com.corejava.hackerank;

import java.util.ArrayList;
import java.util.List;

public class ChapterContent {


    public static List<String> tableOfContents(List<String> text) {
        List<String> output = new ArrayList<>();
        int chapterNo = 0;
        int secNo = 0;
        for(int i=0; i<text.size(); i++ ) {
            //text.get(i).matches("\\b#\\b.*");
            if(text.get(i).startsWith("#") || text.get(i).startsWith("##") ) {
                if(text.get(i).substring(0, 2).equals("# ")) {
                    chapterNo++;
                    String[] split = text.get(i).split("# ");
                    String temp = chapterNo+". "+split[1];
                    output.add(temp);
                }
                if(text.get(i).substring(0, 3).equals("## ")) {
                    secNo++;
                    String[] split = text.get(i).split("## ");
                    String temp = chapterNo+"."+secNo+". "+split[1];
                    output.add(temp);
                }
            }
        }

        return output;
    }

    public static void main(String[] args) {

        List<String> strings = tableOfContents(List.of(
                "# Algorithms",
                "## Sorting",
                "## Searching",
                "# Data Structures"

        ));
        /*Output`
        1. Algorithms
        1.1. Sorting
        1.2. Searching
        2. Data Structures
        */

        System.out.println(strings);
    }
}
