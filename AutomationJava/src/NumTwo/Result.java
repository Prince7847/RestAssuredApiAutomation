package NumTwo;

import java.util.Scanner;

public class Result {
	
	
	
	
	public int totalMarks(int hindi, int math, int sci, int phy, int comp) {
		
		int totalNumber = (hindi+math+sci+phy+comp);
		return totalNumber;
		
	}
	
	
	
	public float percentage(int totalNumber) {
		
		float totalper = (totalNumber*100)/500;
		return totalper;
	}
	
	
	
	
	public static void main(String[] args) {
		
		//make an class object
		Result obj = new Result();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5 subjects marks :");
		int hindi = sc.nextInt();
		int math = sc.nextInt();
		int sci = sc.nextInt();
		int phy = sc.nextInt();
		int comp = sc.nextInt();
		
		
		
		int results = obj.totalMarks(hindi, math, sci, phy, comp);	
		System.out.println("TOTAL NUMBER IS :" + results);
				
		
		float percent = obj.percentage(results);
		System.out.println("TOTAL PERCENTAGE IS :" + percent);
	}

}
