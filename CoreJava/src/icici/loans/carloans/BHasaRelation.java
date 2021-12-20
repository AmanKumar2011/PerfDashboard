package icici.loans.carloans;

import icici.loans.eduloans.ChasaRelation;

public class BHasaRelation 
{
	
	/*
	 * public void m1() {
	 * System.out.println("Class Bhas a relation m1 method- tried override"); }
	 */
	
	/*protected void bm1()
	{
		System.out.println("Class Ahas a relation m1 method");
	}
	
	 void bd1()
	{
		System.out.println("Class Ahas a relation defalut method");
	}*/
	
	
	public void m2()
	{
		System.out.println("Class B has a relation m2 method");
	}

	public static void main(String[] args) 
	{
		AHasaRelation a = new AHasaRelation(); 
		a.A1();
		a.d1();
		a.m1();
		// we can create object of Ahasarelation class inside any class(both within a package and outside a package)
		//within a package we can access all the methods of Ahasarelation class with Ahasarelation object
		//With other class object we cannot access Ahasarelation class methods unless we extend it.
		//outside a package we can access only public methods
		// protected method cannot be accessed with Ahasarelation object both by extending(IS A) as well as without extending(HAS A)
		
		
//		AHasaRelation z = new BHasaRelation(); //referencing is not possible in has a relation
		
		BHasaRelation b = new BHasaRelation();
//		b.m1(); //cannot access ahasarelationc class methods
//		b.A1(); //cannot access ahasarelationc class methods
//		b.d1(); //cannot access ahasarelationc class methods
		b.m2();
		
		
	//	AHasaRelation a1 = (AHasaRelation) new BHasaRelation();
		
	
	}
}
