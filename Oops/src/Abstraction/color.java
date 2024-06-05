package Abstraction;
abstract class Red{
	
	abstract public void showclr();
	 void parammethod(String nm) {
	    	System.out.println("Name is : "+nm);
	    }
	    
}
abstract class Violet extends Red{
    public void showclr(){
    	System.out.println("This is Red Class");
    }
   
}
public  class color  extends Violet {

	public static void main(String[] args) {
		Red r1=new color();
		r1.showclr();
		r1.parammethod("vicky");
		
	}

}
