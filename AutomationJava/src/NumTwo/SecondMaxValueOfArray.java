package NumTwo;

import java.util.Scanner;

public class SecondMaxValueOfArray {
	
	
	public void getSecondMax(int[] num) {   // 12345
		
		int max1 = num[0];
		int max2 = num[1];
		
		for(int j=0; j<num.length; j++) {
			
			if(num[j]>max1  ) {
				max1 = num[j]<max2;
				
			}
		}
		System.out.println("Second  max value is " + max2);
		
	}
	
	
	public static void main(String[] args) {
		SecondMaxValueOfArray obj = new SecondMaxValueOfArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input");
		int[] num = new int[5];
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		obj.getSecondMax(num);
	}

}
