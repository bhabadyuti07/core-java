package com.corejava.others;

import java.util.ArrayList;
import java.util.List;

public class DeepCopy {
	
	static Object getCopy(List<Age> list) {
		List<Age> newList = new ArrayList<>();
		for(Age age : list) {
			try {
				newList.add((Age) age.clone());
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		List<Age> list = new ArrayList<>();
		
		@SuppressWarnings("unchecked")
		List<Age> list2 = (List<Age>) getCopy(list);
		for (Age age : list2) {
			System.out.println(age.getName());
		}
	}

}
