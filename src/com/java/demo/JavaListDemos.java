package com.java.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;
/**
 * Iterable --> interface--> java.lang --> 1.5 --> 
 * 		Iterator iterator()
 *   				Iterator --> java util--> 1.2
 *   
 * Collection ---  1.2
 * 				hom + hetro data elements
 * 				every implemented class backed by datastructure
 * 				every data structure is growble in nature
 * 				only objects are allowed
 * 				based on generics
 * 				collection is a group of objects as single entity..						
 * 				primitives not allowed
 * 
 * List
 * 				index based operations supported
 * 				stores -- duplicates 
 * 				insertion seq -- maintained
 * 				multiple null types allowed
 * 				not sync --> no thread safe--> not a better choice-- multithreading
 * 		LIst--> Collections[utility class] --> Collections.synechronizeList(list)
 * 				
 * 
 *
 */
public class JavaListDemos {
	public static void main(String[] args) {
		
		
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(120);
		linkedList.add(10);
		linkedList.add(104);
		linkedList.add(120);
		linkedList.add(104);
		linkedList.add(120);
		linkedList.add(2);
		linkedList.add(4);
		
		//linkedList.clear();
		//[10, 120, 10, 104, 120, 104, 120, 2, 4]
		System.out.println(linkedList);
		
		//System.out.println("ELEMENT : "+linkedList.element()); // error --> in case empty
		System.out.println("POLL : "+linkedList.poll()); // null in case empty
		System.out.println("POLLFIRST : "+linkedList.pollFirst());
		System.out.println("POLLLAST : "+linkedList.pollLast());
		System.out.println(linkedList);
		
		System.exit(0);
		
		
		Book b1 = new Book(101,"AAAA1",4290.23,21);
		Book b2 = new Book(102,"AAAA2",2390.23,22);
		Book b3 = new Book(103,"AAAA3",2290.23,32);
		
		LinkedList<Book> bookLinkList = new LinkedList<Book>(); //LinkedList --> why no indexes --> no continous memory allocation
		bookLinkList.add(b1);
		bookLinkList.add(b2);
		bookLinkList.add(b3);
		
		/**
		 * LInkedlist --->  dynamic--> next and back node ref ->
		 * poll --> remove --> retrive --> null			--> 3
		 * peek  --> no remove -->retrive --> null		--> 3
		 * offer --> adds					--> 		--. 3
		 * push --> addFirst()--->						--> 1
		 * pop --> removes last-->						--> 1
		 * 
		 * AL VCT --> legacy --> set impl
		 * 
		 * practically --->  note--> 
		 * 
		 * 
		 * 
		 * Collection vs Collections
		 * AL vs Array
		 * AL vs Vector
		 * Iter  List
		 * List  Set
		 * 
		 * vector --> stack --> implementation
		 * 
		 * Comparrable vs comparator
		 * --> 
		 * 
		 * 
		 */
		
		Book bk = bookLinkList.get(2); // internally-- for loop over nodes--. perfm--slow
		System.out.println(bk);
		
		
		
		System.exit(0);
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(11);//0
		values.add(10);
		values.add(160);
		
		values.add(10);//3
		values.add(150); //4 
		values.add(130);//5
		values.add(210);//6
		
		values.add(10);	//7
		values.add(23);//
		
		
		
		System.out.println("---USING ITERATOR --");	// entire collection hierarchy [only]
		Iterator<Integer> valIter1 = values.iterator();
		while(valIter1.hasNext()) {
			System.out.println(valIter1.next());
		}
		//hasnext  next  remove --> foreachremainng
		//read remove --one way direction--> --> entire collection
		
		System.out.println("---USING ITERATOR --"); // only list implemented classes vr
		ListIterator<Integer> valIter2 = values.listIterator();//ListIterator --> both ways-- navigate
		while(valIter2.hasNext()) {
			System.out.println(valIter2.next());
		}
			
		//add -- update --> remove ---> read --> both ways navigate ---. AL,LL,ST,V
		//hasnext  next  remove
		//hasPrevi previous add set  
		//previousIndex - nextIndex
		
		//using normal for loop
		System.out.println("USING NORMAL FOR LOOP");
		for(int i=0;i<values.size();i++) {
			if(values.get(i)>100) {
				System.out.println(values.get(i));
			}
		}
		
		
		System.out.println("USING FOREACH LOOP");
		for (Integer num : values) {
			System.out.println("Number-->"+num);
		}
		
		System.out.println("Using WHILE LOOP---");
		int cnt = 0;
		while(cnt<values.size()) {
			System.out.println(values.get(cnt));
			cnt++;
		}
		
		System.exit(0);
		
		
		
		
		System.out.println(values);
		
		System.exit(0);
		
/**		
 * iterator --> collection
 * listiterator
 * 		-->JAVA8 --> 
 * foreach
 * stream -- 
 * ||stream
 * removeif
 * replaceall
 * splititerator
 * 
 */
		
		
		
		System.out.println(values.subList(3,17));//3 to 6
		
		System.exit(0);
		
		
		values.set(values.indexOf(150), 1500);
		System.out.println(values);
		
		List<Integer> nvalues = new ArrayList<Integer>();
		nvalues.add(10);
		nvalues.add(1220);
		System.out.println("Before Operation -->"+values);
		System.out.println(values.removeAll(nvalues));	//
		System.out.println("After Operation -->"+values);
		System.exit(0);
		
		
	
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList.add(b1);
				//-->
		bookList.add(b2);
		bookList.add(b3);
		
		System.out.println(bookList);
		
		bookList.addAll(bookList);//append		//b1 b2 b3 --> b1 b2 b3 b1 b2 b3
		bookList.addAll(1,bookList);//insert		//b1 b2 b3 --> b1 b1 b2 b3 b2 b3 
		System.exit(0);
		/**
		 * 	()		(int)			(coll)
		 * 	array
		 *  grow --> Arrays.copyof---> incrementatl -->
		 *  	1.6--> 	cp * 3/2 + 1		--> 16
		 *  	1.7	--> cp + cp>>1			--> 15
		 *  default capacity -- 10
		 *  		eager loading --> 1.7--> constructor calling--> 10 size
		 *  		lazy loading	--> 1.8 --> first element add la--> 10 size
		 *  
		 *  trimtosize --> size evdi-- capacity -->
		 *  		spece waste --. release karto..
		 *  
		 */
		
		 // capacity--10
		System.out.println(bookList.isEmpty());  // True	--> size --> 0
		
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		
		Object[] books = bookList.toArray(); //generic type cha array
		
		System.out.println("Object type cha Book Array -->" +Arrays.toString(books));
		
		Book books1 []  = new Book[bookList.size()];
		books1 = bookList.toArray(books1);		//specific book types
		System.out.println(" Book Type Array -->" +Arrays.toString(books1));
		
		System.exit(0);
		
		System.out.println(bookList.isEmpty());  //False  ---> size>0
		
		bookList.clear();
		
		System.out.println(bookList.isEmpty());  //True  ----> size--> 0
		
		
		System.exit(0);
		
		//bookList.trimToSize();			//
		System.out.println(bookList.size());// capacity -- 10 --> size 3
		 
		ArrayList<Book> bookList1 = new ArrayList<Book>(bookList); // capacity--3
		bookList1.add(b1);
		bookList1.add(b2);
		bookList1.add(b3);		//capacity -- 3 ---. size--> 3
		System.out.println(bookList.size());// capacity -- 3 --> size 3
		
		bookList1.add(b3); // grow karayla pahije  --> 3+1.5 --> 4	
		System.out.println(bookList.size());// capacity -- 4 --> size 4		---> 4		: 4
		bookList1.add(b3); // grow karayla pahije 				//4+2 ---> 6	--> 5
		System.out.println(bookList.size());// capacity -- 6 --> size 5		--> 6:5
		
		
		ArrayList<Book> bookList2 = new ArrayList<Book>(); // capacity--10
		bookList2.add(b1);
		bookList2.add(b2);
		bookList2.add(b3);
		bookList2.addAll(bookList); // ankhi 3 add hotil
		bookList2.addAll(bookList); // ankhi 3 add hotil
		bookList2.addAll(bookList); // ankhi 3 add hotil
		bookList2.addAll(bookList); // ankhi 3 add hotil			// capacity 15 --> size 15
		bookList2.add(b1);					//capacity 22 --> size 16
		//trimtosize..
											
		System.out.println(bookList2.size()); //capacity -- 10- -. size is 6
			//AL ---> 101 ---> 7 times --> 109 --> slow karel --> 
		bookList2.trimToSize();
		bookList2.ensureCapacity(200); // ekach capcity -- 200 chi
		bookList2.addAll(bookList1);
		System.out.println(bookList2.size());
		
		System.exit(0);
		
	
		
		
		Vector<Book> booksVector = new Vector<Book>();
		booksVector.add(b1);
		booksVector.add(b2);
		booksVector.add(b3);
		
		Stack<Book> booksStack = new Stack<Book>();
		booksStack.add(b1);
		booksStack.add(b2);
		booksStack.add(b3);
		
		
	}
}


class Book{
	private int bookId;
	private String bookName;
	private double bookPrice;
	private int bookQty;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String bookName, double bookPrice, int bookQty) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookQty = bookQty;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public int getBookQty() {
		return bookQty;
	}
	public void setBookQty(int bookQty) {
		this.bookQty = bookQty;
	}
	@Override
	public String toString() {
		return "\n [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookQty=" + bookQty
				+ "]";
	}
	
}