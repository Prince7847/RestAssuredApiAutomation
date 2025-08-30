package OOPs;

public class This_demo {
	
	int a=10;
	public This_demo(int a) {
		this.a=a;
		System.out.println(a);
	}
	
	public void getdata() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		This_demo obj = new This_demo(20);
		obj.getdata();
	}

}
