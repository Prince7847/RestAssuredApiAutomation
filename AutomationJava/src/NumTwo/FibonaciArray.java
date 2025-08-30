package NumTwo;

import java.util.Scanner;

public class FibonaciArray {

	
	
	public void fibonaci(int[] num) {
		
		
		int dig =0;
		for(int i=0; i<5; i++) {
			dig = dig+num[i];
		}
		
		    System.out.println(dig);  
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		FibonaciArray obj = new FibonaciArray();
		int[] num = new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the number :");
		for(int i=0; i<5; i++) {
			num[i] = sc.nextInt();
		}
		obj.fibonaci(num);
	}
}
