package constructor;


class Rajuu{
	
	int a=18;
	public Rajuu() {
		System.out.println("hello default constructor ..." +a);
	}
}

public class Super_Constructor extends Rajuu {
	
	int a=20;
	public  Super_Constructor() {
		System.out.println("hello get data of child ..." + super.a);  // access parent var in a child class we use super keyword for access.
	}

	public static void main(String[] args) {
		
		Super_Constructor obj = new Super_Constructor();
		
	}

}
