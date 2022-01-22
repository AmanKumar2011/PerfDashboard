package icici.loans.eduloans;

import icici.loans.carloans.AbstractCar;
import icici.loans.carloans.AbstractVehicle;
import icici.loans.carloans.Rbi;

public class AbstractTrain extends AbstractVehicle implements Rbi
{
	
	
	  @Override 
	  public void start() 
	  { 
		  System.out.println("Starts by the Kick");
	  
	  }
	 
	  protected void testmethod()
	  {
		  System.out.println("I am inside Abstract train class testmethod method");
	  }

		@Override
		public void deposit() {
			// TODO Auto-generated method stub
			System.out.println("I am inside Abstract train class deposit method");
		}

	public static void main(String[] args) 
	{
Rbi.withdrawal1();

		AbstractTrain a= new AbstractTrain();
		a.A1(); //Protected method can be accessed by class extending Abstract class  outside a package//
		AbstractVehicle name;
		name = new AbstractTrain();
		name.a();
//		name.A1(); //Protected method cannot be accessed by Abstract class reference outside a package//
		

		
	}



}
