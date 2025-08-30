package OOPs;

public class Constructor_demo {
	
	int a=10;  // globally variable becoz outside of method
	public Constructor_demo() {
		int a=20;    // local variable
		System.out.println("hello default constructor " + a);    // it's automatically  call / invoke
	}
	
	
	public void demo() {
		System.out.println("hello  demo method ");
	}
	
	
	public static void main(String[] args) {
		Constructor_demo obj = new Constructor_demo();
		obj.demo();  // it will call demo method after constructor
	}

}
