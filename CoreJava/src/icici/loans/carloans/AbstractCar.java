package icici.loans.carloans;

public class AbstractCar extends AbstractVehicle
{

		@Override
	public void start() 
	{
			nooftypres=4;
			System.out.println("Starts by the Key " + nooftypres);
		
	}
		public void b()
		{
			System.out.println("I am inside method B of car class");
		}

		public static void main(String[] args) 
		{
			AbstractCar ac =new AbstractCar();
			ac.start();
			//	ab.a();
			System.out.println(ac.nooftypres);
ac.a();
ac.b();
ac.test();

AbstractVehicle name;
name = new AbstractCar();
name.start();
name.test();
//name.b();

		}	
		
}
