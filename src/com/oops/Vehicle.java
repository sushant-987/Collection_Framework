package com.oops;

public class Vehicle {

	String color;
	double price;

	void initObj(String c, double p) {
		color = c;
		price = p;

	}

	void display() {
		System.out.println(color + " " + price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Vehicle v=new Vehicle();
          v.initObj("Black", 50000.00);
          v.display();
	}

}
