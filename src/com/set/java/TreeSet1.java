package com.set.java;

import java.util.*;

class TreeSet1 {
	public static void main(String args[]) {
		// Creating and adding elements
		TreeSet<String> al = new TreeSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		al.add("null");
		al.add("null");
		// Traversing elements
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}