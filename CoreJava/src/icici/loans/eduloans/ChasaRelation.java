package icici.loans.eduloans;


import icici.loans.carloans.AHasaRelation;

import icici.loans.carloans.BHasaRelation;

public class ChasaRelation
{
		
	
	public void m3()
	{
		System.out.println("Class C has a relation m3 method");
	}

	public static void main(String[] args) 
	{
				
		ChasaRelation c = new ChasaRelation();
				
		c.m3();
	//	c.A1(); // protectecd class cannot be access by crelation class object .can be accessed if arelation class is extended
	//	c.d1(); // default class cannot be extended by crealtion class object both by extending as well as without extending
	//	c.m1(); //cannot access methods of Ahasarelation class
	//		     With Chasarelation class object we cannot access any methods of Ahasarelation class
				
		AHasaRelation a = new AHasaRelation();
//		a.A1();// protected class cannot be accessed with ahasarelation object both by extending as well as without extending
	//	a.d1();//cannot access default method of Ahasarelation class even with Ahasarelation class object outside package
		a.m1();

		
		
			
	}

}
