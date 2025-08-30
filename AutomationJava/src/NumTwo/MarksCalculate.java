package NumTwo;

import java.util.Scanner;

public class MarksCalculate {
	
	
	
	public void marksCalculate(String name, int english, int math, int science, int computer, int gk) {
		
		
		
		int totalMarks = (english+math+science+computer+gk);
		float totalPercentage = (totalMarks*100)/500;

		
		System.out.println("Your name is : "+ name);
		System.out.println("Your english subject marks is : "+ english);
		System.out.println("Your maths subject marks is : "+ math);
		System.out.println("Your science subject marks is : " + science);
		System.out.println("Your gk subject marks is : " + gk);
		System.out.println("Your total Mark calculated : "+ totalMarks);
		System.out.println("Your total percentage calculated : " + totalPercentage);

				
		
		
	}
	
	
	public static void main(String[] args) {
		
		MarksCalculate obj = new MarksCalculate();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter student name :");
		String name = sc.next();
		System.out.println("Please enter the English subject marks :");
		int english = sc.nextInt();
		System.out.println("Please enter the Maths subject marks :");
		int math = sc.nextInt();
		System.out.println("Please enter the Science subject marks :");
		int science = sc.nextInt();
		System.out.println("Please enter the Computer subject marks :");
		int computer = sc.nextInt();
		System.out.println("Please enter the Gk subject marks :");
		int gk = sc.nextInt();
		
		
		obj.marksCalculate(name, english, math, science, computer, gk);
		
		
	}
	
	

}
