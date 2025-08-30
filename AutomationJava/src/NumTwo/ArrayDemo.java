package NumTwo;

import java.util.Arrays;

public class ArrayDemo {
	
	
	
	public void arrayDemo() {
		
		int[] num = {12,23,34,45,56,78};
		
//		int[] num = new  int[5];
//		num[0] = 5;
//		num[1] = 20;
//		num[2] = 48;
//		num[3] = 39;
//		num[4] = 12;
		
		
		for(int i=0; i<6; i++) {
			System.out.println(num[i]);
		}
		
//		System.out.println(Arrays.toString(num));
	}
	
	
	
	public static void main(String[] args) {
		
		ArrayDemo obj = new ArrayDemo();
		obj.arrayDemo();
		
	}

}
