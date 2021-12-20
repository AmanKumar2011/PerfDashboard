package icici.loans.carloans;

public class ICICI implements Rbi
{

	

	@Override
	public void withdrawal() {
		System.out.println("I have overridden withdrawl in ICICI");
		
	}

	@Override
	public void deposit() {
		System.out.println("I have overridden deposit in ICICI");
		
	}

	public static void main(String[] args)
	{
		ICICI i= new ICICI();
		i.withdrawal();
	//	Rbi.withdrawal();
		i.deposit();
		
	//	Rbi i;
	//	i= new ICICI();
	//	i.withdrawal();
		
	//	ICICI b= new ICICI();
	//	b.withdrawal();

	}
	
}
