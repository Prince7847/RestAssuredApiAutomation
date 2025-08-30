package OOPs.Exception_handling_demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_handle_demo {
	
	public void getdata1() {
		System.out.println("hello getdata 1");
	}
	

	public void getdata2() {
		
		try {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the data");
		int a  = sc.nextInt();
		int  b= sc.nextInt();
		int c = a/b;
		System.out.println(c);
		
		
		}
		
		catch(ArithmeticException e) {
			getdata1();
		}
		catch(InputMismatchException e) {
			getdata3();
		}
		
		catch(Exception e){
			System.out.println("System carsh ..../");
		}
		finally {
			System.out.println("final block");
		}
		
	}


public void getdata3() {
	System.out.println("hello getdata 3");
}
	
	
	
	
	public static void main(String[] args) {
		Exception_handle_demo obj = new Exception_handle_demo();
		obj.getdata1();
		obj.getdata2();
		obj.getdata3();
		
	}

}
