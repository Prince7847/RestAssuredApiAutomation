package inheritance;


class Dada{
	public void a() {
		System.out.println("hello method a ");
	}
}

class Papa extends Dada{
    public void b() {
    	System.out.println("hello  method b ");
    }
}

public class MultiLevel extends Papa{
	
	public void c() {
		System.out.println("hello method c ");
	}

	public static void main(String[] args) {
		MultiLevel obj = new MultiLevel();
		obj.c();
		obj.b();
		obj.a();
	}

}
