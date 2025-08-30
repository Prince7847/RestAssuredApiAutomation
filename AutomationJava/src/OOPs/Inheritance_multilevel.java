package OOPs;


// multi-level inheritance 


class Firsts{              // grandfather
	public void first() {
		System.out.println("hello  first method");
	}
}


class Second  extends Firsts{     // father inherit property of his father 
	public void second() {
		System.out.println("hello second method");
	}
	
}

public class Inheritance_multilevel  extends Second{      // son inherit property of father & grandfather as well
	
	public void multilevel() {
		System.out.println("hello  multi-level method");
	}
	
	
	public static void main(String[] args) {
		Inheritance_multilevel obj = new Inheritance_multilevel();
		obj.first();
		obj.second();
		obj.multilevel();

}
}