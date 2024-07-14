package com.java.demo.Operator;

class A {

}

class B extends A {

}

public class Instance_poerator {
	public static void main(String[] args) {
		A objA = new A();
		B objB = new B();

  if(objA instanceof  B) {
	  System.out.println("objA is Instance of A");
  }
  
  if(objB instanceof A) {
	  System.out.println("objA is Instance of A");
  }
  

	}
}
