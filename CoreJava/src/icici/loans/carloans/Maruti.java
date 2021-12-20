package icici.loans.carloans;

public class Maruti extends Car
{
	//Maruti extends Car and thus inherits all methods from Car (except final and static)
	//Maruti can also define all its specific functionality
	public void MarutiStartDemo()
	{
		Engine MarutiEngine = new Engine(); //has a realtion is created here
		MarutiEngine.start();
		
	}
	
	public static void main(String[] args) 
	{		
		Maruti myMaruti = new Maruti();
		myMaruti.setColor("RED");
		myMaruti.setMaxSpeed(180);
		myMaruti.carInfo();
		myMaruti.MarutiStartDemo();
	}
	
	
	}
