package Abstraction;
abstract class Myclass{
	String name;
	 public  void printnm() {
		 this.name="Sonali";
		System.out.println("Name of Person is:"+name);
	}
}
public class AbstractDemo  extends Myclass{
	public static void main(String[] args) {
		Myclass m1=new AbstractDemo();
		m1.printnm();
	}

}
