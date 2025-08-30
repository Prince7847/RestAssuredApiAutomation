package NumTwo;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumArray {

	public void reverseNumArray(int[] num)// [1,2,4,3,5]
	{
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - 1; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));
	}

	public static void main(String[] args) {
		ReverseNumArray ob = new ReverseNumArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter input array");
		
		int[] num = new int[5];

		for (int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
		}
		ob.reverseNumArray(num);
	}
}
