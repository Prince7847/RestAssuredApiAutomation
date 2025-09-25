package inheritance;



class A{
	public void a() {
		System.out.println("hello method a ");
	}
}

class B extends A{
	
	public void b() {
		System.out.println("hello method b ");
	}
}
//CLASS B & C HAVE SAME PARENTS THAT'S WHY IT'S KNOWN AS Hierarchial level
class C extends A{
	
	public void c() {
		System.out.println("hello method c ");
	}
}

//CLASS C & HierarchalLevel  BOTH ARE FOLLOW TO EACH OTHER THAT WHY CALLED MULTIPLE ---
// AND THIS MULTIPLE AND HIERARCHICAL BOTH ARE CALLED HYBRID --

public class HierarchalLevel  extends C{
	
	public void d() {
		System.out.println("hello method d ");
	}

	public static void main(String[] args) {
		HierarchalLevel obj = new HierarchalLevel();
		obj.d();
		obj.c();
		
		C obj2 = new C();
		obj2.c();
		obj2.a();
	}

}
