package NumTwo;

public class AddTwoNumber {
	
	
	
// function for add two number	
	public void FunAdd() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	
// function for subtract two number	
	public void FunSub() {
		int d=20;
		int e=5;
		int f=d-e;
		System.out.println(f);
	}
	

// function for divide two number
	public void FunMult() {
		int g=20;
		int h=2;
		int i=g*h;
		System.out.println(i);
	}
	
	
// function for multiply two number
		public void FunDiv() {
			int m=100;
			int n=2;
			int p=m/n;
			System.out.println(p);
		}
	
	
// this is main function , here we will call all the function(that already define) in main function	
	public static void main(String[] args) {	
		AddTwoNumber obj1 = new AddTwoNumber();
		obj1.FunAdd();
		obj1.FunSub();
		obj1.FunMult();
		obj1.FunDiv();
	}

}
