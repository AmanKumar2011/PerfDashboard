package icici.loans.eduloans;


import icici.loans.carloans.AMultilevelInheritance;
import icici.loans.carloans.BMultilevelInheritance;


public class DMultilevelInheritance extends BMultilevelInheritance
{
	
	void d4()
	{
		System.out.println("Class D default method");
	}
	
	public void m4()
	{
		System.out.println("Class D m4 method");
	}
	
	protected void A4()
	{
		System.out.println("Class D A4 method");
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
