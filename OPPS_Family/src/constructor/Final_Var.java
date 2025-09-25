package constructor;


public class Final_Var {
	
	
    final int a=10;  //final keyword means wecann't reassign again/change
	
	public void getdata() {	
		// a=20;
		System.out.println("hello getdata ..." + a);
		
	}
	

	public static void main(String[] args) {
		Final_Var obj = new Final_Var();
		obj.getdata();
	}

}
