package icici.loans.carloans;

import icici.loans.eduloans.ChasaRelation;

public class AHasaRelation 
{
	
	public void m1()
	{
		System.out.println("Class Ahas a relation m1 method");
	}
	
	 void d1()
	{
		System.out.println("Class Ahas a relation defalut method");
	}
	
	
	protected void A1()
	{
		System.out.println("Class Ahas a relation A1 protected method");
	}

	public static void main(String[] args) 
	{
		AHasaRelation a = new AHasaRelation();
		a.m1();
		a.A1();
		a.d1();

	
		BHasaRelation b = new BHasaRelation();
		b.m1();
		b.bd1();
		b.bm1();
		b.m2();
		b.A1();
		b.d1();
		
		ChasaRelation c = new ChasaRelation();
		c.m1();
		c.A1();
		c.d1();
		
		
	

	}

}
