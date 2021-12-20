package icici.loans.carloans;

public class BSingleInheritance extends ASingleInheritance  // is a relation
{
	
//	public void m1()
//	{
//		System.out.println("Class B m1 method");
//	}
	
	
	
 private void p2()
	{
		System.out.println("Class B defalut method");
	}
	
	void d2()
	{
		System.out.println("Class B defalut method");
	}
	
	public void m2()
	{
		System.out.println("Class B m2 method");
	}
	
	protected void A2()
	{
		System.out.println("Class B A2 protected method");
	}

	public static void main(String[] args) 
	{
		
		ASingleInheritance a = new ASingleInheritance();
		a.m1();
		a.d1();
		a.A1();
		
//		a.m2(); //b's(child) public method not accessible with a's 9partent) class object
//		a.d2(); //b's(child) default method not accessible with a's 9partent) class object
//		a.A2(); //b's(child) protected method not accessible with a's 9partent) class object
		
		
		BSingleInheritance b = new BSingleInheritance();
		
		b.m1();
		b.A1();
		b.d1();
		
		b.m2();
		b.d2();
		b.A2();
		b.p2();
		
ASingleInheritance a1 = new BSingleInheritance();
		
		a1.m1();
		a1.d1();
		a1.A1();
		
//		a1.m2(); //b's(child) public method not accessible with a's 9partent) class object reference
//		a1.d2(); //b's(child) default method not accessible with a's 9partent) class object reference
//		a1.A2(); //b's(child) protected method not accessible with a's 9partent) class object reference
//		a1.p2();
		
//		BSingleInheritance b1 = new ASingleInheritance(); // we cannot put the parent class object to child class reference
 
		

	}

}
