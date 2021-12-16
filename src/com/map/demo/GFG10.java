package com.map.demo;

//Java Program to illustrate the LinkedHashmap Class
import java.util.*;

public class GFG10 {

	public static void main(String[] args)
	{
		Map<String, Integer> map
			= new LinkedHashMap<>();

		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		for (Map.Entry<String, Integer> e : map.entrySet())
			System.out.println(e.getKey() + "  "
							+ e.getValue());
	}
}
