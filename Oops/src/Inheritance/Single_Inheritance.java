package Inheritance;

 class Demo{
	public void Add() {
		int a=7, b=7;
		int c=a+b;
		System.out.println("Addition is:"+c);

	}
}
public class Single_Inheritance  extends Demo{
	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.Add();
	}

}
