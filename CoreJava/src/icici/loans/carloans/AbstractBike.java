package icici.loans.carloans;

public class AbstractBike extends AbstractVehicle
{

	@Override
	public void start() 
	{
		nooftypres=2;
		System.out.println("Starts by the Kick"+nooftypres);
		
	}

/*	
	public void a()
	{
		nooftypres=5;
		System.out.println("inside a");
	}
	*/
	
	
		public static void main(String[] args) 
		{
			AbstractBike ab= new AbstractBike();
			
			
			
			ab.start();
			ab.a();
			System.out.println(ab.nooftypres);

		}	

}
