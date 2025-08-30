package NumTwo;

import java.util.Scanner;

public class MinValueOfArray {
	
	
	public void getMin(int[] num) {    // [1,2,3,4]
		
		
		int min = num[0];
		for(int j=0; j<num.length; j++) {
			
			if(num[j]<min) {
				min = num[j];
			}
		}
		System.out.println("Minimum value is " + min);
	}
	
	public static void main(String[] args) {
		MinValueOfArray obj = new MinValueOfArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input");
		int[] num = new int[4];
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		obj.getMin(num);
	}

}
