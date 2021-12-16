// package com.java.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Sample {
		
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> hmap1 = new HashMap<String, Integer>();
		hmap1.put("A",1);
		hmap1.put("B",2);
		hmap1.put("C",3);
		hmap1.put("D",8);
		hmap1.put("E",8);
		
		HashMap<String,Integer> hmap2 = new HashMap<String, Integer>();
		hmap2.put("M",5);
		hmap2.put("G",2);
		hmap2.put("D",3);
		hmap2.put("B",8);
		hmap2.put("X",8);
		
		
		
		
		
		ConcurrentHashMap<String, Integer> hmap = new ConcurrentHashMap<String, Integer>();
		hmap.putAll(hmap1);
		hmap.putAll(hmap2);

		Set<String> keys = hmap.keySet();
		Iterator<String> keystr = keys.iterator();
		while(keystr.hasNext()) {
			String k = keystr.next();
			if(hmap1.containsKey(k) && hmap2.containsKey(k)) {
				hmap.remove(k);
			}else if(hmap1.containsKey(k)) {
				hmap.put(k,Integer.parseInt(hmap1.get(k)+"1"));
			}else if(hmap2.containsKey(k)) {
				hmap.put(k,Integer.parseInt(hmap2.get(k)+"2"));
			}
			
		}
		
		System.out.println(hmap);
		
		hmap.clear();
		//System.exit(0);
		
		Iterator<Entry<String,Integer>> entry1Iter  = hmap1.entrySet().iterator();
		Iterator<Entry<String,Integer>> entry2Iter  = hmap1.entrySet().iterator();
		
		while(entry1Iter.hasNext()) {
			Entry<String,Integer> pair1  = entry1Iter.next();
			if(hmap2.containsKey(pair1.getKey())) {
				continue;
			}else {
				hmap.put(pair1.getKey(),Integer.parseInt(hmap1.get(pair1.getKey())+"1"));
			}
		}
	
		while(entry2Iter.hasNext()) {
			Entry<String,Integer> pair2  = entry2Iter.next();
			if(hmap1.containsKey(pair2.getKey())) {
				continue;
			}else {
				hmap.put(pair2.getKey(),Integer.parseInt(hmap2.get(pair2.getKey())+"2"));
			}
		}
		
		//System.out.println(hmap);

		//System.exit(0);

		
		
		Set<String> keys1 = hmap1.keySet();	// A B C D
		Set<String> keys2 = hmap2.keySet();	// M G D B
		
		keys = new HashSet<String>(keys1);			// A B C D
		HashMap<String,Integer> hashmap = new HashMap<String, Integer>();
		
		for (String k : keys2) {
			if(keys.contains(k)) {
				continue;
			}else {
				keys.add(k); // hmap2 -->
				hashmap.put(k,Integer.parseInt(hmap2.get(k)+"2"));
			}
		}
		
		//System.out.println(keys);
		for (String key : keys) {
			if(keys2.contains(key)) {
				continue;
			}else {
				hashmap.put(key,Integer.parseInt(hmap1.get(key)+"1"));
			}
			
		}
		System.out.println(hashmap);
		
		/***
		 * 
		 * ANS --> A-->[1,MAP1]	B-->2/8	
		 * 
		 * compare two maps -- > based on keys
		 * 			--. create seperate map 
		 * 				--> which will have uncommon elements from both map--
		 * 							key,value
		 * 							append --> some dummy string---> to the value-- 
		 * which will indicate original map name
		 * for that record
		 * 
		 * 
		 * 
		 */
	}
}