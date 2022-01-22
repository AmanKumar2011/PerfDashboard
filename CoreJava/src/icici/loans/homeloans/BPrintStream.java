package icici.loans.homeloans;

import icici.loans.eduloans.CSingleInheritance;

//import icici.loans.carloans.*;

public class BPrintStream
{

	public void add()
	{
		
		System.out.println("Added");
	}
	
	public static void main(String[] args) {
		
		
		CSingleInheritance c = new CSingleInheritance();
		c.m3();
		c.d3();
		c.p3(); //now this becomes a has a realation here even though a is being extended by c. for a it is has a relation
		
		c.m1();
		c.A1();
		c.d1(); 
	}
	
}
