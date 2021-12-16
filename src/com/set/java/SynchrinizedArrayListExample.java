package com.set.java;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SynchrinizedArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // creating non synchronized  ArrayList object 
		
		ArrayList<String> list=new ArrayList<String>();
		
		//adding elements to the list
		list.add("Java");
		list.add("Python");
		list.add("Jsp");
		list.add("ABC");
		
		//getting synchronized list 
		
	//	List<String> synchronizedlist = Collections.synchronizedList(list);
		// List<String> synchronizedList = Collections.synchronizedList(list);
		 // List<String> synchronizedList = Collections.synchronizedList(list);
          List<String>synchronizedList = Collections.synchronizedList(list);
        //you must use synchronized block while iterating over synchronizedList
		
		synchronized (synchronizedList) {
			
			Iterator<String> it = synchronizedList.iterator();
			
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
		}
		
	}

}
