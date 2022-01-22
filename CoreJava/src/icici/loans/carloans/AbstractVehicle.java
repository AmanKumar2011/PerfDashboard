package icici.loans.carloans;

abstract public class AbstractVehicle 
{
//public final int a;  In Abstract class also data field with final is mandatorily to be initialized
	
	 static transient final public int c=4;
	
final public int b; //If a final variable is not initialized during declaration, then it can be initialized in constructor
	
	AbstractVehicle()
	{
		b=5;
	}

	public final void test() //An abstract class can contain a final method but a final class cannot contain abstract class
	{
		System.out.println("I am inside final method of abstract class");
	}
	
	public  int  nooftypres;
	 abstract public void start();
	 
	 public void a() // this proves that an Abstract class can be 0-100 % abstract, since we are able to create a normal method
	 {
		 System.out.println("I am method A inside the a method of Abstract Class Vehicle");
	 }
	 
	 public void m1() // this proves that an Abstract class can be 0-100 % abstract, since we are able to create a normal method
	 {
		 System.out.println("I am method A inside the a method of Abstract Class Vehicle");
	 }
	 protected void A1() // this proves that an Abstract class can be 0-100 % abstract, since we are able to create a normal method
	 {
		 System.out.println("I am method A inside the a method of Abstract Class Vehicle");
	 }
	  void d1() // this proves that an Abstract class can be 0-100 % abstract, since we are able to create a normal method
	 {
		 System.out.println("I am method A inside the a method of Abstract Class Vehicle");
	 }
	 
	 public static void main(String[] args)
	 {
		 //AbstractVehicle name1= new AbstractVehicle(); //Abstract class cannot be instantiated
		
		AbstractVehicle name;
		name = new AbstractCar();
		name.a();
		
	//	name.b();
		
		
	}
	
}
