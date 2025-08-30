package OOPs;

// this is single level inheritance 

class First{  // parent class
	
	public void first() {
		System.out.println("hello  first method ");
	}
	
}

public class Inheritance_demo extends First{    // inheritance_demo is child class & first is parent class.
	
	public void demo() {
		System.out.println("hello  demo  method ");
	}
	
	
	public static void main(String[] args) {
		Inheritance_demo obj = new Inheritance_demo();
		obj.demo();
		obj.first();
	}

}
