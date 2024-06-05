package Polymorphism;
  class Bank{
	 void trnsaction() {
		 System.out.println("AllOver Transaction");
	 }
 }
  class SBI extends Bank{
	  void trnsaction() {
		  System.out.println("SBI transactrion");
	  }
  }
  class Union extends Bank{
	  void trnsaction() {
		  System.out.println("Union transactrion");
	  }
  }
  class ICICI extends Bank{
	  void trnsaction() {
		  System.out.println("ICICI transactrion");
	  }
  }
public class BankDemo extends Bank{

	public static void main(String[] args) {
		Bank b1;
		b1=new Bank();
		b1.trnsaction();
		b1=new SBI();
		b1.trnsaction();
		b1=new Union();
		b1.trnsaction();
		b1=new ICICI();
		b1.trnsaction();

	}

}
