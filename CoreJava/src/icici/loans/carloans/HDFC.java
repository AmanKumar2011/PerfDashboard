package icici.loans.carloans;

public class HDFC implements Rbi
{

	
	
	

	@Override
	public void withdrawal()
	{
		System.out.println("I have overridden withdrawl in HDFC");
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("I have overridden deposit in HDFC");
		
	}

	
	public static void main(String[] args)
	{
		HDFC i= new HDFC();
		i.withdrawal();
	//	Rbi.withdrawl();
		i.deposit();

	}
}
