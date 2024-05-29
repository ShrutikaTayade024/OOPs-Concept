package Inheritance;

class Animal{
	  void eat() {
		  System.out.println("Animals eat Food,Grass,Etc");
	  }
}
class Dog extends Animal{
	
	    void eat() {
	    	super.eat();
	    	System.out.println("Dog eats Bones");
	    }
	    void barking() {
	    	System.out.println("Dog Barking !!!!!!");
	  
	    }
}

public class Method_overRidding_inheritence {

	public static void main(String[] args) {
		Dog D1=new Dog();
		D1.eat();
		D1.barking();


	}

}
