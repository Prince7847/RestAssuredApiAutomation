package oops;

public class StaticVariableUsingConstructor {
	
	//int count=0; //non-static variable
	static int count=0;  // memory will be allocated only once
	
	public StaticVariableUsingConstructor() {
		
		count++;   // increment by 1. retain its value.
		System.out.println(count);
		
	}
	
	

	public static void main(String[] args) {
		StaticVariableUsingConstructor obj1= new StaticVariableUsingConstructor();
		StaticVariableUsingConstructor obj2 = new StaticVariableUsingConstructor();
		StaticVariableUsingConstructor obj3 = new StaticVariableUsingConstructor();
		StaticVariableUsingConstructor obj4 = new StaticVariableUsingConstructor();
		

	}

}
