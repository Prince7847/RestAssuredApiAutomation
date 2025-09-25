package constructor;


class Hello{
	
	int a=10;
	public void getdata() {
		
		System.out.println("hello parent method ... ");
	}
}

public class Super_Variable extends Hello {
	
	
	int a=20;
	public void func() {
		System.out.println("hello child method..." + super.a);  // it call the parent var into a child class.
	}
	

	public static void main(String[] args) {
		Super_Variable obj = new Super_Variable();
obj.func();	}

}
