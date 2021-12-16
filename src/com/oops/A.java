package com.oops;

// Multilevel Inheritance

public class A {
	
	void showA(){
		System.out.println("a class show method");
		
	}
}

	class B extends A {
		
		void showB(){
			System.out.println("b class show method");
		}
	}
	
	class C extends A{
		
		void showC(){
			System.out.println("c class show method");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A a=new A();
         a.showA();
         //b.showB();
         System.out.println("-------------------");
         B b=new B();
         b.showA();
         b.showB();
         System.out.println("------------------");
         C c=new C();
         c.showA();
       //  c.showB();
         c.showC();
	}

}
