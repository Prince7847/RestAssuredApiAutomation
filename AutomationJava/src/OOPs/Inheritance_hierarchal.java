package OOPs;


// Hierarichal inheritance

// Base class
class Grandfather{
	public void grand() {
		System.out.println("hello  Grandfather");
	}
}


//Derived 1 class
class Father extends Grandfather{
	public void father(){
		System.out.println("hello father");
	}
	
}



//Derived 2 class
class Son extends Grandfather{
	public void son() {
		System.out.println("hello  son");
	}
}


//Derived 3 class
class SonOfSon extends Grandfather{
	public void sonofson() {
		System.out.println("hello  son of son");
	}
} 



public class Inheritance_hierarchal  extends  Grandfather{
	public void hierarichal() {
		System.out.println("hello hierarichal method");
	}
	
	
	public static void main(String[] args) {
		Inheritance_hierarchal obj = new Inheritance_hierarchal();
		obj.hierarichal();
		obj.grand();
		
		Father obj1 = new Father();
	    obj1.father();
	    obj1.grand();
	    
	    SonOfSon obj2 = new SonOfSon();
	    obj2.sonofson();
	    obj2.grand();
	    
	    
	}

}
