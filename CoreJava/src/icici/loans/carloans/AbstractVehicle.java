package icici.loans.carloans;

abstract public class AbstractVehicle 
{

	 int  nooftypres;
	 abstract public void start();
	 public void a() // this proves that an Abstract class can be 0-100 % abstract, since we are able to create a normal method
	 {
		 System.out.println("I am method A inside the a method of Abstract Class Vehicle");
	 }
	 
	 public static void main(String[] args)
	 {
		AbstractVehicle name;
		name = new AbstractCar();
		name.a();
	//	name.b();
		
		
	}
	
}
