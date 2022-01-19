package icici.loans.carloans;

 public interface Rbi extends Rbi1// extends Car   // interface can extend only interface. it cannot extend a class
{
	 int x=100;
	
	//protected void a();
	
	 public default void withdrawal()
	{
		System.out.println("hello i am default inside an interface");
	}
	 
	 public  static void withdrawal1()
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
		Rbi.withdrawal1();
		
		
		
		i= new ICICI();
		i.withdrawal();
		
	//	i.a();
		
		HDFC b= new HDFC();
		b.withdrawal();
		
	}
	
}
