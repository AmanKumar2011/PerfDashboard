package icici.loans.carloans;

public class AbstractCar extends AbstractVehicle
{

	//final public int a;  final variable always needs to be initialized inside Abstract Class and Interface
	
	final public int b;
	
	AbstractCar()
	{
		b=5;
	}
	
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
name.a();
name.A1();
//name.b();

		}	
		
}
