
/* Iterator Interface: Iterator is an interface provided by collection framework to traverse a collection and for a sequential access of items in the collection.

// Iterating over collection 'c' using terator
for (Iterator i = c.iterator(); i.hasNext(); ) 
    System.out.println(i.next());
It has 3 methods:

boolean hasNext(): This method returns true if the iterator has more elements.
elements next(): This method returns the next elements in the iterator.
void remove(): This method removes from the collection the last elements returned by the iterator.

 */
//Java program to demonstrate working of iterators
package com.iterator.java;

import java.util.*;

public class IteratoDemo {
	public static void main(String args[]) {
		// create a Hashset to store strings
		HashSet<String> hs = new HashSet<String>();

		// store some string elements
		hs.add("India");
		hs.add("America");
		hs.add("Japan");

		// Add an Iterator to hs.
		Iterator it = hs.iterator();

		// Display element by element using Iterator
		while (it.hasNext())
			System.out.println(it.next());
	}
}