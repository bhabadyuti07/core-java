/**
 * 
 */
package com.corejava.others;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bhabadyuti Bal
 *
 */
public class Fibonacii {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int i = 0;
		int j = 1;
		list.add(i);
		list.add(j);
		for (int k=2;k<10;k++) {
			int l = i + j;
			list.add(l);
			i = j;
			j = l;
		}
		System.out.println(list);
	}

}
