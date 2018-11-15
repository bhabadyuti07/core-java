package com.corejava.ds.array;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArraysEx<T> {
	
	static final String filePath = "C:\\Users\\Bhabadyuti Bal\\Desktop";
	
	public static void getDiffreence() throws FileNotFoundException{
		Scanner s1 = new Scanner(new File(filePath+"\\file_en.txt"));
		Scanner s2 = new Scanner(new File(filePath+"\\file_de.txt"));
		ArrayList<String> list_en = new ArrayList<String>();
		while (s1.hasNext()){
		    list_en.add(s1.next());
		}
		
		ArrayList<String> list_de = new ArrayList<String>();
		while (s2.hasNext()){
		    list_de.add(s2.next());
		}
		Set<String> en = new HashSet<String>(list_en);
		Set<String> de = new HashSet<String>(list_de);
		en.removeAll(de);
		System.out.println(en);
	}
	
	
	static int[] array = new int[]{1, 2, 3, 4, 5};
	
	public static void displayArray(int[] array) {
		
		
		/*
		System.out.println("oldarray size: "+array.length);
		int size = array.length + 1;
		int[] newArray = new int[size];
		newArray = array;
		System.out.println("onewarray size: "+size);
		int index = 2;
		
		//System.arraycopy(array, index, newArray, index + 1, size - index);
		//array[index] = 100;
		for (int i : newArray) {
			System.out.print(i + " ");
		}
	*/}
	
	
	private Object[] mergeTwoSortedArraysMethod1(int[] t1, int[] t2) {
		int n = t1.length;
		int m = t2.length;
		int  i = 0, j = 0, k = 0;
		
		Object[] array = new Object[n + m];
		while(i < n && j < m) {
			if(t1[i] < t2[j]) {
				array[k++] = t1[i++]; 
			} else {
				array[k++] = t2[j++]; 
			}
		}
		while (i < n) {
			array[k++] = t1[i++]; 
		}
		
		while (j < m) {
			array[k++] = t2[j++]; 
		}
		
		/*for(int i=0;i<t1.length;i++) { 
			array[i] = t1[i];
		}
		
		for(int i=0;i<t2.length;i++) {
			array[t1.length + i] = t2[i];
		}
		Arrays.sort(array);*/
		return array;
	}
	
	
	public static void displayArrayList(int[] array) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		
		list.add(2, 100);
		for (Integer i : list) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		//getDiffreence();
		//displayArray(array);
		//displayArrayList(array);
		int[] array1 = new int[]{1, 2, 3, 4, 5};
		int[] array2 = new int[]{1, 2, 3, 4, 5, 10};
		Object[] mergedArray = new ArraysEx().mergeTwoSortedArraysMethod1(array1, array2);
		for (int i=0; i < mergedArray.length; i++)
            System.out.print(mergedArray[i] + " , ");
	}

}
