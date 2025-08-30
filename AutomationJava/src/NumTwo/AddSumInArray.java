package NumTwo;

import java.util.Scanner;

public class AddSumInArray {

	
	public void sumArray(int[] num) {   // [1,2,3,4,5]
		
		int out = 0;
		for(int i=0; i<5; i++) {
			out = out+ num[i];
		}
		System.out.println(out);
	}
	
	
	
	public static void main(String[] args) {
		AddSumInArray obj = new AddSumInArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input");
		
		int[] num = new int[5];
		for(int i=0; i<5; i++) {
			num[i] = sc.nextInt();
		}
		
		obj.sumArray(num);
		
	}
}
