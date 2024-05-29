package Inheritance;

class Car {
	public void Brand() {
		System.out.print("I am in Car class");
	}
}

class Maruti extends Car {
	public void maruti() {
		System.out.println("I am in Maruti class");
	}
}

public class Multi_Level extends Maruti {
	public static void main(String[] args) {
		Maruti m1 = new Maruti();
		m1.maruti();
		m1.Brand();
	}

}
