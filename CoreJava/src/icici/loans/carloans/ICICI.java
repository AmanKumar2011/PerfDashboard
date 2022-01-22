package icici.loans.carloans;

public class ICICI implements Rbi
{

final public int b; //If a final variable is not initialized during declaration, then it can be initialized in constructor
	
	ICICI()
	{
		b=5;
	}

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
		ICICI i1= new ICICI();
		i1.withdrawal();
	//	Rbi.withdrawal();
		i1.deposit();
		
		Rbi i;
		i= new ICICI();
		i.withdrawal();
		
	//	ICICI b= new ICICI();
	//	b.withdrawal();

	}
	
}
