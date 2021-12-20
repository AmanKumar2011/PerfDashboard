package icici.loans.eduloans;

import icici.loans.carloans.ASingleInheritance;
import icici.loans.carloans.BSingleInheritance;

public class D extends ASingleInheritance
{

	public static void main(String[] args) 
	{
		D d= new D();
		
		ASingleInheritance a = new ASingleInheritance();
		a.m1();
		a.d1();
		a.A1();
		
		
		BSingleInheritance b = new BSingleInheritance();
		b.m2();
		b.m1();
		b.A1();
		b.d1();
	}

}
