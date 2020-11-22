package com.corejava.leetcode;


class ListNode {
    private int val;

    public ListNode getNext() {
        return next;
    }

    ListNode(){}

    public void setNext(ListNode next) {
        this.next = next;
    }

    ListNode next;
    ListNode(ListNode next) {
        this.next = next;
    }
    ListNode(int val) { this.val = val;}
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}


public class Problem2AddTwoNumbers {

    int count = 1;
    private int lengthOf(ListNode list) {
        ListNode next = list.getNext();
        if(next != null) {
            count++;
            lengthOf(next);
        }
        return count;
    }

    private int getReverseNumber(ListNode list) {
        ListNode next = list.getNext();
        StringBuilder sb = new StringBuilder();
        sb.append(list.getVal());
        while(next != null) {
            sb.append(next.getVal());
            next = next.getNext();
        }
        return Integer.valueOf(sb.reverse().toString());
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        //reverse l1 & l2
        int revNum1 = getReverseNumber(l1);
        int revNum2 = getReverseNumber(l2);
        int sum = revNum1 + revNum2;

        StringBuilder sv  = new StringBuilder(String.valueOf(sum));

        int[] digitArray = new int[sv.length()];
        String reveresed = sv.reverse().toString();
        for(int i=0;i<reveresed.length();i++) {
            String s = String.valueOf(reveresed.charAt(i));
            digitArray[i] = Integer.valueOf(s);
        }
        ListNode node = convertToLinkedList(digitArray);

        return node;
    }

    private ListNode convertToLinkedList(int[] array) {
        ListNode rootNode = null;
        for (int i = 0; i<array.length; i++) {
            rootNode = insert(rootNode, array[i]);
        }
        return rootNode;
    }

    private ListNode insert(ListNode rootNode, int val) {
        ListNode temp = new ListNode();
        ListNode ptr;
        temp.setVal(val);
        temp.setNext(null);

        if(rootNode == null) {
            rootNode = temp;
        } else {
            ptr = rootNode;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = temp;
        }
        return rootNode;
    }

    public static void main(String[] args) {

        ListNode node11 = new ListNode(2);
        ListNode node12 = new ListNode(4);
        ListNode node13 = new ListNode(3);
        node11.setNext(node12);
        node12.setNext(node13);

        ListNode node21 = new ListNode(5);
        ListNode node22 = new ListNode(6);
        ListNode node23 = new ListNode(4);
        node21.setNext(node22);
        node22.setNext(node23);

        Problem2AddTwoNumbers object = new Problem2AddTwoNumbers();
        ListNode newNode = object.addTwoNumbers(node11, node21);
    }
}
