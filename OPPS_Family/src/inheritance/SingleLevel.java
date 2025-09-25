package inheritance;


class Daddy{
	
	public void a() {
		System.out.println("Hello  method a ");
	}
	
}

public class SingleLevel extends Daddy{
	
	public void b() {
		System.out.println("Hello method b ");
	}
	

	public static void main(String[] args) {
		SingleLevel obj = new SingleLevel();
		obj.b();
		obj.a();
	}

}
