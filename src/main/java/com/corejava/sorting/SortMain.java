package com.corejava.sorting;

public class SortMain {

    public static void main(String[] args) {
        Lead lead1 = new Lead("Bhaba", "Bal");
        Lead lead2 = new Lead("Deba", "Ball");

        LeadSorting leadSorting = new LeadSorting();
        int compared = leadSorting.compare(lead1, lead2);
        switch (compared) {
            case -1:
                System.out.println("lead2 comes first");
                break;
            case 1:
                System.out.println("lead1 comes first");
                break;
            case 0:
                System.out.println("Bth are equal");
                break;
        }
    }
}
