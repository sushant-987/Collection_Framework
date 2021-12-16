package com.java.demos;

import java.util.Comparator;
import java.util.TreeSet;

public class SetImpl {
	
	public static void main(String[] args) {
	
		Comparator<Integer> reverse = new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {
				return -(o1-o2);
			}
		};
		
		TreeSet<Integer> numberTree = new TreeSet<Integer>();		// CURRENTLY ITS USING COMPARABLE
		numberTree.add(10);
		numberTree.add(30);
		numberTree.add(420);
		numberTree.add(1230);
		numberTree.add(444);
		numberTree.add(120);
		numberTree.add(140);
		numberTree.add(1530);
		numberTree.add(406);
		numberTree.add(170);
		numberTree.add(140);
		
		System.out.println(numberTree);
		//[10, 30, 120, 140, 170, 406, 420, 444, 1230, 1530]
		//[1530, 1230, 444, 420, 406, 170, 140, 120, 30, 10]
		
		System.out.println("Which Comparator --> (null)-->"+numberTree.comparator());
		
		System.out.println("LOWER -->"+numberTree.lower(170));	// less than
		System.out.println("HIGHER -->"+numberTree.higher(170)); // greater than
		
		System.out.println("CEILING -->"+numberTree.ceiling(170));	//greater than equal to
		System.out.println("CEILING -->"+numberTree.ceiling(150));	//greater than equal to
		
		System.out.println("FLOOR -->"+numberTree.floor(170));		//less than equal to 
		System.out.println("FLOOR -->"+numberTree.floor(150));		//less than equal to 
		
		
		System.out.println("FIRST -->"+numberTree.first());
		System.out.println("LAST -->"+numberTree.last());
		
		System.out.println("HEADSET +"+numberTree.headSet(170));	// all elements --> less than
		System.out.println("TAILSET +"+numberTree.tailSet(170));	// all elements --> grt than equal to
		System.out.println("SUBSET --> "+numberTree.subSet(170, 1230));// >= and less than
		
		
		System.out.println("HEADSET +"+numberTree.headSet(170,true));	// all elements --> less than=
		System.out.println("TAILSET +"+numberTree.tailSet(170,false));	// all elements --> grt than
		System.out.println("SUBSET --> "+numberTree.subSet(170,false, 1230,true));// > and less than=
		
		System.exit(0);
		
		Product1 p1 = new Product1(101, "Mobile",12893.23, 3);		// p1 p3 p5  p2
		Product1 p2 = new Product1(1401, "ggfbile",189.23, 22);		// 128 728 989
		Product1 p3 = new Product1(1051, "faisbile",7289.23, 33);
		Product1 p4 = new Product1(11, "sa32ile",189.23, 2);
		Product1 p5 = new Product1(1031, "Vbile",989.23, 253);
		TreeSet<Product1> prodsTree = new TreeSet<Product1>(new PriceComparator());
		prodsTree.add(p1);
		prodsTree.add(p2);
		prodsTree.add(p3);
		prodsTree.add(p4);
		prodsTree.add(p5);
		System.out.println(prodsTree);
		
		System.out.println("LOWER PRODUCT -->"+prodsTree.lower(p4));		//p4 --> 189
		
		System.out.println("Which Comparator --> (PriceComparator)-->"+prodsTree.comparator());
		
	}
}


class PriceComparator implements Comparator<Product1>{

	public int compare(Product1 o1, Product1 o2) {
		return (int) (o1.getProdPrice() - o2.getProdPrice());
	}
	
}

class Product1 implements Comparable<Product1>{
	private int prodId;
	private String prodName;
	private double prodPrice;
	private int prodQty;
	public Product1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product1(int prodId, String prodName, double prodPrice, int prodQty) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodQty = prodQty;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public int getProdQty() {
		return prodQty;
	}
	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}
	@Override
	public String toString() {
		return "\n [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + ", prodQty="
				+ prodQty + "]";
	}
	public int compareTo(Product1 o) {
		return this.getProdQty() - o.getProdQty();
	}
}

/**
 * 
 * Set --> 
 * 		hom + hetro data elements--. seq not maintained--> single null allowed
 * 		duplicates are not allowed --> no sync
 * 
 * 
 * 	[Iterable]
 * 			[collection]
 * 						[set]
 * 									HashSet ---> LinkedHashet
 * 									[SortedSet] --> [NavigableSet] --> TreeSet
 * 
 * 
 * Treeset	--><
 *					only homogenous dataelements are allowed
 *			<1.6	-- single null allowed -- that too-- very first element
 *			>=1.6	--> not even very first --> single element allowed..
 *
 *		Treeset ---> comparable -->
 *									comprable or comparator -->
 *			sorted --> duplicates not allowed --> seq not preserved...
 * 
 * 
 */
