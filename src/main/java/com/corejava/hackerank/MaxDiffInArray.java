package com.corejava.hackerank;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MaxDiffInArray {
	
	public static int findMaxDiff(int[] a) {
        List<Integer> list = new ArrayList<>();
        if(a.length == 1) return -1;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<i;j++){
                if(a[j] < a[i]) {
                	int diff = a[i] - a[j];
                	list.add(diff);
                }
            }
        }
        int max = list.stream().mapToInt(e -> e).max().orElseThrow(NoSuchElementException::new);
		return	 max;
	}
	
	
	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 4, 6, 5};
		int max = findMaxDiff(array);
		System.out.println(max);
	}

}
