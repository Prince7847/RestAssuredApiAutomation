package polymorphism;

import java.util.Scanner;

class Congress_System{

	public int getTax(int input, String goods, String state) {

		int out =0;

		if(goods.equals("fashion") & state.equals("UP")) {
			out =(input*5)/100;
			System.out.println(out);
		}
		else if (goods.equals("medical") & state.equals("Delhi")) {
			out = (input*4)/100;
			System.out.println(out);
		}else {
			out = (input*2)/100;
			System.out.println(out);
		}

		return out;


	}
}





public class MethodOverriding_BJP extends Congress_System{


	public int getTax(int input, String goods, String state) {

		int out =0;

		if(goods.equals("fashion")) {
			out =(input*18)/100;
			System.out.println(out);

		}
		else if (goods.equals("medical")) {
			out = (input*18)/100;
			System.out.println(out);

		}
		return out;


	}


	public static void main(String[] args) {
		MethodOverriding_BJP obj = new MethodOverriding_BJP();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the amount");
		int amnt = sc.nextInt();
		System.out.println("please enter the input tax");
		String tax = sc.next();
		obj.getTax(amnt, tax, tax);
	}

}
