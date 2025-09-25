package constructor;


class Ram{
	
   final public void getdata() {
		System.out.println("hello parent method  ...");
	}
}

public class Final_Method extends Ram {
	
	
	public void  getdata() {  // we cann't overide of final method
		System.out.println("hello child method ...");
	}

	public static void main(String[] args) {
		Final_Method obj = new Final_Method();
		obj.getdata();
	}

}
