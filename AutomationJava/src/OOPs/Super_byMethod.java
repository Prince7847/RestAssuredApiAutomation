package OOPs;



class Mohit{
	public void  one() {
		System.out.println("hello one method");
	}
}


public class Super_byMethod  extends Mohit{

	public void superby() {
		super.one();  								// calling parent method into child method by using super keyword
		System.out.println("hello super method");
	}
	
	
	public static void main(String[] args) {
		Super_byMethod obj = new Super_byMethod();
		obj.superby();
	}
}
