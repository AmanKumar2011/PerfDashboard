package icici.loans.eduloans;

import icici.loans.carloans.AbstractCar;
import icici.loans.carloans.AbstractVehicle;

public class AbstractTrain extends AbstractVehicle
{
	
	
	  @Override 
	  protected void start() 
	  { 
		  System.out.println("Starts by the Kick");
	  
	  }
	 

	public static void main(String[] args) 
	{

		AbstractTrain a= new AbstractTrain();
		AbstractVehicle name;
		name = new AbstractTrain();
		name.a();
		

		
	}

}
