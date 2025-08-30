package OOPs;

public class Parameterised_Constructor {
	
	
	int a =12;
	public Parameterised_Constructor(int a) {
		System.out.println("hello parameterised constructor  " + a);
	}
	
	public void demo() {
		System.out.println("hello  demo method ");
	}
	
	public static void main(String[] args) {
		Parameterised_Constructor obj = new Parameterised_Constructor(25);  // we will pass argument for parameterised 
		obj.demo();
		
	}

}
