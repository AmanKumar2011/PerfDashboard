package icici.loans.carloans;

import icici.loans.eduloans.DMultilevelInheritance;

public class BMultilevelInheritance extends AMultilevelInheritance  // is a relation
{
	
	/*
	  public void m()
	{
		System.out.println("Class B m1 method");
	}
	 
	 */
	
	
	void d2()
	{
		System.out.println("Class B D2 method");
	}
	
	public void m2()
	{
		System.out.println("Class B m2 method");
	}
	
	protected void A2()
	{
		System.out.println("Class B A2 method");
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
		
		DMultilevelInheritance d = new DMultilevelInheritance();
		
		
		d.m1();
		d.A1();
		d.d1();
		
		d.m2();
		d.A2();
		d.d2();
		
		d.m4();
		d.d4();
		d.A4();
		

	}

}
