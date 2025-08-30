package OOPs;

public class MethodOverloading {
	
	public void getTraindetails(String trainName) {
		System.out.println("train details by trainName");
		
	}
	
public void getTraindetails(int trainNumber) {
	System.out.println("train details by trainNumber");
	}


public void getTraindetails(String fromSt,  String ToSt) {
	System.out.println("train details by station ");
}
	
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.getTraindetails(null, null);
		obj.getTraindetails(0);
		
	}

}
