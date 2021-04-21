package com.corejava.multithreading;

class MyRunnable implements Runnable {

    int[] array = new int[] {1, 2, 3, 4};

    public MyRunnable(int i) {
        array[0] = i;
    }

    @Override
    public void run() {

    }
}

public class Ambiguity {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        MyRunnable runnable1 = new MyRunnable(5);
    }
}
