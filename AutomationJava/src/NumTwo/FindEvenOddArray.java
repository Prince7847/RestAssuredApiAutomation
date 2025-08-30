package NumTwo;

import java.util.Arrays;
import java.util.Scanner;

public class FindEvenOddArray {
	
	
	
	public void findarray(int[] num) {
		for(int i=0; i<5; i++) {
			int reminder =num[i]%2;
			if(reminder==0) {
				System.out.println(num + " is even number ");
			}else {
				System.out.println(num + " is odd number ");
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		FindEvenOddArray obj = new FindEvenOddArray();
		int[] num = new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println(" please enter the 5 number ");
		for(int i=0; i<5; i++) {
			num[i] = sc.nextInt();
		}
		obj.findarray(num);
		
	}

}
