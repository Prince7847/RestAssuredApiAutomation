package OOPs;



class One{
	int a=10;
	 
	
}
public class Super_demoVar extends One {
	
	int a=20;
	public void getdata() {
		System.out.println(super.a); 		// we are using super for to access global variable
	}
	
	public static void main(String[] args) {
		Super_demoVar obj =new Super_demoVar();
		obj.getdata();
	}

}
