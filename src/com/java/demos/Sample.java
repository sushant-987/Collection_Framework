package com.java.demos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class Sample {

	
	
	public static void main(String[] args) {
		Product p1 = new Product(101, "Mobile",12893.23, 3);
		Product p2 = new Product(1401, "ggfbile",189.23, 22);
		Product p3 = new Product(1051, "faisbile",7289.23, 33);
		Product p4 = new Product(11, "sa32ile",189.23, 2);
		Product p5 = new Product(1031, "Vbile",989.23, 253);


/**
 * AL --> 
 * 		fillratio--loadfactor-> when to grow--> 100% full zalyanntr -> cp+cp>>1
 * 		AL()		--> 10	---> 15
 * 		AL(int)		--> 20	---> 30
 * 		AL(Colln)	--> based on size --> grow hoto
 * 		
 * 		!sync --> not ThreadSafe --> singleThread madhe fast--> can we use it inside multithreading madhe--
 * 					Yes--> but--> Collections.Syne(list)
 * 		
 * 		1.2
 * 
 * 		Cursors --> 		
 * 					iterator
 * 					listiterator
 * 					
 * 		
 * iterator --> works only on collection implementated classes--
 * 		however if u want--> iterarator to be worked on --< map --> map kah--> 
 * 																keyset -- values-- entryset-->
 * 																		collection--> iterator..
 * 
 * VC	
 * 		fillratio--loadfactor-> when to grow--> 100% full zalyanntr -> cp+cp	--> doubles
 * 		Vc()		--> 10	--> 20
 * 		Vc(int)		--> 20	--> 40
 * 		Vc(Coll)	--> based on size --grow hoto
 * 		Vc(int,int)--> 20,0.75	--> 100% --> 75% --> 	20 cha 40 --> 16th element la hoel.
 * 
 * 		Vector ha bydefault- -- ThreadSafe --> every method is Synechronized--> in Threading..
 * 
 * 		grow -- > doubles...
 * 
 * 		1.0
 * 		
 * 		enumerator --> only on legacy class- --> 1.0
 * 											vector -- stack --> properties-hashtable--dict	
 * 
 * 
 * 
 */
		
		
		
		Vector<Product> productVector = new Vector<Product>();		// Array
		productVector.add(p1);
		productVector.add(p2);
		productVector.add(p3);
		productVector.add(p4);
		productVector.add(p5);
		
		System.out.println("-----------------------------------------------");
		Iterator<Product> prodIter = productVector.iterator();
		while(prodIter.hasNext()) {
			Product prod = prodIter.next();
			System.out.println(prod);
		}
		//read --> remove -->
					// hasnext -- next ---> remove ---		--> remove/read --> frwd
		// all collection implemented classes vs
		System.out.println("-----------------------------------------------");
		ListIterator<Product> prodListIter =  productVector.listIterator();
		while(prodListIter.hasNext()) {
			Product prod = prodListIter.next();
			System.out.println(prod);
		}
		
		//hasnext --> next -- remove ---> add  --- set			--> add/remove/update/read --> both ways
		//hasprevious ---> previous --> previousIndex
		// only on list implemented classes vr
		
		System.out.println("-----------------------------------------------");
		Enumeration<Product> enumProduct = productVector.elements();
		while(enumProduct.hasMoreElements()) {
			Product prod = enumProduct.nextElement();
			System.out.println(prod);
		}
		//works on only legacy classes --> vector/stack/properties/hashtable/dict
		
		//hasmorelements() ---> nextElement() ---> 			readonly.
		
		
		Stack<Product> productsStack = new Stack<Product>();		// Child of Vector--> so-->Array
		productsStack.add(p1);										//synechronized--> internally vector chya
		productsStack.add(p2);
		productsStack.add(p3);
		productsStack.add(p4);
		productsStack.add(p5);
		
		
		System.exit(0);
		
		
		List<Product> products = Arrays.asList(p1,p2,p3,p4,p5);
		System.out.println(products);
		
		Collections.sort(products);// default pick krto same class-- compareTo method madhn-->nature sorting					//T->Product			--> extends- >Comparable
		System.out.println("--------------------------------------");
		System.out.println(products);
		
		
		System.out.println("-------------------ID SORT---------------------");
		Collections.sort(products, new SortByID());			//custom sorting--> every time we need to tell --sorting mechanism kay ahe
		System.out.println(products);
		System.out.println("-------------------ID AND DESCQTY SORT---------------------");
		Collections.sort(products, new SortByIDAndQty());
		System.out.println(products);
		System.out.println("-------------------NAME AND PRICE SORT---------------------");
		Collections.sort(products, new SortByNameAndPrice());
		System.out.println(products);
		
		
		
		
		System.exit(0);
		List<Integer> numbers = Arrays.asList(10,20,30,40,506,07);
		List<String> values = Arrays.asList("ABCD","1ADu1i","ADJKSJ","khjs","ksfhff","fASDad");
		
		System.out.println(numbers);
		System.out.println(values);
		
		System.out.println("------------------------------");
		Collections.sort(numbers);	//ASC--REVERSE
		Collections.sort(values);
		System.out.println(numbers);
		System.out.println(values);			//48 to 57 -->65--90 ---> 97-122
		System.out.println("------------------------------");
		Collections.reverse(numbers);	//ASC--REVERSE
		Collections.reverse(values);
		
		System.out.println(numbers);
		System.out.println(values);	
		
	}
	
	
}

class SortByID implements Comparator<Product>{

	public int compare(Product o1, Product o2) {
		return o1.getProdId() - o2.getProdId();
	}
	
}

class SortByIDAndQty implements Comparator<Product>{
	public int compare(Product o1, Product o2) {			// sort by id--> asc--> in case ids are same
		int temp = o1.getProdId() - o2.getProdId();				// sort by qty --> desc		101 2
		if(temp==0) {											//							101 4	101 1	
			temp = (o1.getProdQty() - o2.getProdQty());		//101 4	101 2	101 1
		}													//101 1 101 2 101 4
		return temp;
	}
}

class SortByNameAndPrice implements Comparator<Product>{
	public int compare(Product o1, Product o2) {
		int temp = o1.getProdName().compareTo(o2.getProdName());
		if(temp==0) {
			temp = (int) (o1.getProdPrice() - o2.getProdPrice());
		}
		return temp;
	}
}

class Product implements Comparable<Product>{
	private int prodId;
	private String prodName;
	private double prodPrice;
	private int prodQty;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int prodId, String prodName, double prodPrice, int prodQty) {
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
	public int compareTo(Product o) {
		//return -(this.prodName.compareTo(o.prodName));	//with name --> ASC/desc
		int temp = (int) (this.prodPrice - o.prodPrice);
		if(temp==0) {
			temp = this.prodQty - o.prodQty;
		}
		return temp;
	}
	/**
	 * P1 and p2 --> 
	 * 										10 20 11
	 * 										10-20
	 * 										-10 --> 10
	 * 		p1-p2	--> 							p1.id - p2.id
	 * 					0			p1=p2				0
	 * 					+ve			p1>p2				p1.id> p2.id	--> swap
	 * 					-ve			p<p2				p1.id<p2.id		--> next product consider karel
	 * 
	 * 
	 * 
	 */
	
	
}

/***
	Arrays --> ARRAY DATATYPE CHA UTILITY CLASS AHE
	COLLECTIONS --> COLLECTION FRAMEWORK CHA UTILITY CLASS--> SORT/SHUFFLE/ROTATE/SYNC/REVERS/IMMUTABLE-> METHODS


	COLLECTION 											VS					 COLLECTIONS
	 JAVA.UTIL																	JAVA.UTIL
	 INTERFACE	
	 COLL-HIERARCHY CHA ROOT INTERFACE											UTILITY CLASS--> 
	

*/