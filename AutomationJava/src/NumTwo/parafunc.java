package NumTwo;

import java.util.Scanner;

public class parafunc {
	
	
	
	public void SumTwo(int a, int b) {
		int c = a+b;
		System.out.println("Sum of two number is : " + c);
		
	}
	
	
	
	
	
public static void main(String[] args) {
	parafunc obj = new parafunc();
	Scanner sc = new Scanner(System.in); 
	System.out.println("Enter two number is : ");
	int a= sc.nextInt();
	int b= sc.nextInt();
	obj.SumTwo(a, b);
	
}
}
