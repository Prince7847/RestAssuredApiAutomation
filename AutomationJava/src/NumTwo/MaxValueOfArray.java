package NumTwo;

import java.util.Scanner;

public class MaxValueOfArray {
	
	
	public void getMax(int[] num) {  // [1,2,3,4,5]
		
		int max =0;
		for(int i=0; i<=num.length-1; i++) {
			
			if(num[i]>max) {
				max = num[i];
				
			}
			
		}
		
		System.out.println("Maximum value is " + max);
	}

	
	
	
	public static void main(String[] args) {
		MaxValueOfArray obj = new MaxValueOfArray();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the input Array");
		
		int[] num = new int[5];
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		obj.getMax(num);
	}
}
