package polymorphism;

public class MethodOverloading {

// In methodOverloading real project we make same name of multiple methods so that they will be easy for us to use in future to access, we can 
	//access them by using different parameter.
	
//	public void getTrainDetails(int trainNo) {
//		System.out.println("Train detail by number ");
//	}
//
//	public void getTrainDetails(String trainName) {
//		System.out.println("Train detail by name ");
//
//	}
//
//	public void getTrainDetails(String frmStation, String  station) {
//		System.out.println("Train detail by station to station ");
//
//	}
//	
//	public static void main(String[] args) {
//		MethodOverloading obj = new MethodOverloading();
//		obj.getTrainDetails(23);
//	}

	
	
//  overloading doesn't depend upon return type.
	
	
	public int Sum(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public float Sum(int a, int b, int c) {
		int d = a+b;
		return d;
	}
	
	
	
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.Sum(2, 3, 5);
	}



}
