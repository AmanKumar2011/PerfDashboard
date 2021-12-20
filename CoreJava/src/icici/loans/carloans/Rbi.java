package icici.loans.carloans;

public interface Rbi
{
	int x=100;
	
	//protected void a();
	
	 public default void withdrawal()
	{
		System.out.println("hello i am static inside an interface");
	}

/*	public static void withdrawal()
	{
		System.out.println("hello i am static inside an interface");
	}
	
	public static void main(String[] args) {
	//	Rbi obj=new Rbi(); we cannot create the object for an interface
		
	//	Rbi.withdrawal();
	}
*/
//	public void withdrawal();
	public void deposit();
	
	public static void main(String[] args) 
	{
		Rbi i;
		i= new ICICI();
		i.withdrawal();
		
	//	i.a();
		
		ICICI b= new ICICI();
		b.withdrawal();
		
	}
	
}
