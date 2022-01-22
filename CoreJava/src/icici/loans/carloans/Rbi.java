package icici.loans.carloans;

import icici.loans.eduloans.AbstractTrain;

public interface Rbi extends Rbi1// extends Car   // interface can extend only interface. it cannot extend a class
{
	 int x=100;
	 
//	int b; //If a final variable is not initialized during declaration, then it can be initialized in constructor.
//		//But interface does not have constructor so variable has to be mandatorily initialized
//		Rbi()
//		{
//			b=5;
//		}
	 
	
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
		
		
		
		i= new ICICI(); //Run time polymorphism. 
		
		i.withdrawal();  // withdrawl method is from rbi interface during complile time. During run time it is of icici. 
		//So abstraction also is achieved here. Only interface method name is shown and no implementation details are displayed.
		
		i=new AbstractTrain();
		i.deposit();
		
		
	//	i.a();
		
		HDFC b= new HDFC();
		b.withdrawal();
		
	}
	
}
