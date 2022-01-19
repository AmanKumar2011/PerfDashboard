package icici.loans.carloans;

public interface Rbi1 
{

	 int x=100;
		
		//protected void a();
		
		 public default void withdrawalRbi1()
		{
			System.out.println("hello i am default Rbi1 inside an interface");
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
//		public void withdrawal();
		  public void deposit();
		
		public static void main(String[] args) 
		{
			Rbi1 i;
			i= new ICICI();
			i.withdrawal();
			
		//	i.a();
			
			HDFC b= new HDFC();
			b.withdrawal();
			
		}
	
}
