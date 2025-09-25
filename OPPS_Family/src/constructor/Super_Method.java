package constructor;

class Raju{
	
	
	int a=10;
}
public class Super_Method extends Raju {
	
	int a=20;
	public void getdata() {
		System.out.println("hello get data child ..."+ super.a);
	}
	
	
	public static void main(String[] args) {
		Super_Method obj = new Super_Method();
		obj.getdata();
	}

}
