package constructor;


class Rajju{
 static	int a=30;
}

public class Static_Variable extends Rajju{
	

	public void data() {
		
		System.out.println("hello data method  ..." + a);
	}

	public static void main(String[] args) {
		Static_Variable obj = new Static_Variable();
		obj.data();
		
 	}

}
