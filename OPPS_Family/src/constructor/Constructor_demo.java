package constructor;

public class Constructor_demo {
	
	
	public Constructor_demo(int a) {
		System.out.println("hello constructor ... "+ a);
	}
	

	public void demo() {
		System.out.println("hello demo method ... ");
	}
	public static void main(String[] args) {
		
		Constructor_demo obj = new Constructor_demo(20); //when we need to initialize the memory at compile time then we will use constructor 
		obj.demo();
	}

}
