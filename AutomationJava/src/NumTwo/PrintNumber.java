package NumTwo;

import java.util.Iterator;

public class PrintNumber {
	
	
	
	public void printNumber() {
		
//     for (int i = 0; i <=10; i++) {
//		System.out.println(i);
//	}
     
     
		for (int i = 10; i >=0; i--) {
			System.out.println(i);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		PrintNumber obj = new PrintNumber();
		System.out.println("print the number");
		
		obj.printNumber();
	}

}
