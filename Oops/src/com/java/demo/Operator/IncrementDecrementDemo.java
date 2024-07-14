package com.java.demo.Operator;

public class IncrementDecrementDemo {

	public static void main(String[] args) {
           int a=2;
           
//           System.out.println("Pre-Increment :"+ ++a );      //3
//           System.out.println("Post-Increment :"+ a++ );     //2
             
//           int result=++a + ++a + ++a;
//           System.out.println("Pre-Increment Addition:"+result);      //3+4+5=     12 
//           //Post-Increment
//           System.out.println("Post-Increment :"+ a++ );
//           System.out.println("Post-Increment Addition:"+  a++ +  a++ +  a++);
           
           //mixup Increment
           
           int res= ++a +  a++ +  a++;             //3+3+4=10
           System.out.println("Post-Increment Addition:"+ res);
           
           boolean rres=(++a + ++a + ++a)>10;
         System.out.println(rres);
           
	}

}
