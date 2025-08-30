package NumTwo;

import java.util.Scanner;

public class PrintName {
	
	
	
	public void printname(String name) {
		
		for (int i =1 ; i <=10; i++) {
			System.out.println( name+i);
			
		}
	}
	
	
	
	public static void main(String[] args) {
		
		PrintName obj = new PrintName();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the name ");
		String name = sc.next();
		obj.printname(name);
	}

}
