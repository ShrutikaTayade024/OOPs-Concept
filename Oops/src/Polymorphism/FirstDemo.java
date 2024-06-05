package Polymorphism;

class Bike {
	void run() {
		System.out.println("running");
	}
}

class FirstDemo extends Bike {
	
	void run() {
	
		System.out.println("running safely with 60km");
	}
	
	public static void main(String[] args) {
     Bike b1=new FirstDemo();
     b1.run();
 
	}

}
