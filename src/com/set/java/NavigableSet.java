package com.set.java;

//Java code to demonstrate
//adding of elements in
//NavigableSet
import java.util.*;
//import java.io.*;

class NavigableSetDemo {

	public static void main(String[] args) {
		NavigableSet<String> ts = new TreeSet<String>();

		// Elements are added using add() method
		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("A");
		ts.descendingSet();
		ts.pollFirst();
		ts.floor("Ab");

		System.out.println(ts);
	}
}