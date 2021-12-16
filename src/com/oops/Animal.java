package com.oops;

public  class  Animal {
	
	public void eat(){
		System.out.println("I am eating");
	}
	
	public void run(){
		System.out.println("I am running");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		System.out.println("1");
		
		Animal a=new Animal();
		a.eat();
		a.run();
		Birds b=new Birds();
		b.fly();
		
	
	}
	
	
}
