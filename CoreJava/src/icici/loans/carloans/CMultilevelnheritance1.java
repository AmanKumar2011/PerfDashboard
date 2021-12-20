package icici.loans.carloans;

public class CMultilevelnheritance1 extends BMultilevelInheritance  // is a relation
{
	
	 void d3()
	{
		System.out.println("Class c D3 method");
	}
	
	protected void A3()
	{
		System.out.println("Class c A3 method");
	}
	
	public void m3()
	{
		System.out.println("Class c m3 method");
	}

	public static void main(String[] args) 
	{
		
		AMultilevelInheritance a = new AMultilevelInheritance();
		a.m1();
		a.d1();
		a.A1();
		
		a.m2();
		a.A2();
		a.d2();
		
		a.m3();
		a.d3();
		a.A3();
		
		
		BMultilevelInheritance b = new BMultilevelInheritance();
		
		b.m1();
		b.A1();
		b.d1();
		
		b.m2();
		b.A2();
		b.d2();
		
		b.m3();
		b.d3();
		b.A3();
		
		
		CMultilevelnheritance1 c = new CMultilevelnheritance1();
		
		c.m1();
		c.A1();
		c.d1();
		
		c.m2();
		c.A2();
		c.d2();
		
		c.m3();
		c.d3();
		c.A3();

	}

}
