package OOPs;


class Ram{
	
	public Ram(int a) {
		System.out.println("hello  ram  " + a);
	}
}
public class Super_byConstructor extends Ram {
	
	public Super_byConstructor() {
		super(20);							// we are using super constructor for  to pass data to parent class method
		System.out.println("hello  super");
	}

	
	public static void main(String[] args) {
		Super_byConstructor obj = new Super_byConstructor();
		
	}
}
